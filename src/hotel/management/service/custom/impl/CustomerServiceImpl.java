/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.service.custom.impl;

import hotel.management.dao.DaoFactory;
import hotel.management.dao.custom.CustomerDao;
import hotel.management.dto.CustomerDto;
import hotel.management.entity.CustomerEntity;
import hotel.management.service.custom.CustomerService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deshini
 */
public class CustomerServiceImpl implements CustomerService{
    
    private CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.CUSTOMER);

    @Override
    public List<CustomerDto> getAll() throws Exception{
        List<CustomerDto> customerDtos = new ArrayList<>();
        List<CustomerEntity> customerEntities = customerDao.getAll();
        for (CustomerEntity entity : customerEntities) {customerDtos.add(new CustomerDto(
                entity.getCustomerId(), 
                entity.getCustomerTitle(),
                entity.getCustomerFirstName(),
                entity.getCustomerLastName(),
                entity.getCustomerNic(),
                entity.getCustomerAddress(),
                entity.getCustomerContact()));
        }
        return customerDtos;
    }

    @Override
    public String saveCustomer(CustomerDto customerDto) throws Exception{
        CustomerEntity customerEntity = new CustomerEntity(
                customerDto.getCustomerId(), 
                customerDto.getCustomerTitle(), 
                customerDto.getCustomerFirstName(), 
                customerDto.getCustomerLastName(),
                customerDto.getCustomerNic(),
                customerDto.getCustomerAddress(),
                customerDto.getCustomerContact());

        if (customerDao.save(customerEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }

    }

    @Override
    public String updateCustomer(CustomerDto customerDto)throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(
                customerDto.getCustomerId(), 
                customerDto.getCustomerTitle(), 
                customerDto.getCustomerFirstName(), 
                customerDto.getCustomerLastName(),
                customerDto.getCustomerNic(),
                customerDto.getCustomerAddress(),
                customerDto.getCustomerContact());
                
        if (customerDao.update(customerEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCustomer(String customerId) throws Exception{
        if (customerDao.delete(customerId)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public CustomerDto getCustomer(String customerId) throws Exception{
        CustomerEntity customerEntity = customerDao.get(customerId);
        if (customerEntity != null) {
            return new CustomerDto(
                    customerEntity.getCustomerId(),
                    customerEntity.getCustomerTitle(),
                    customerEntity.getCustomerFirstName(),
                    customerEntity.getCustomerLastName(),
                    customerEntity.getCustomerNic(),
                    customerEntity.getCustomerAddress(),
                    customerEntity.getCustomerContact());

        }
        return null;
    }

}
