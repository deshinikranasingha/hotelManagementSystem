/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.controller;

import hotel.management.dto.CustomerDto;
import hotel.management.service.ServiceFactory;
import hotel.management.service.custom.CustomerService;
import java.util.List;

/**
 *
 * @author Deshini
 */
public class CustomerController {
    
    private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String saveCustomer(CustomerDto customerDto)throws Exception {
        return customerService.saveCustomer(customerDto);
    }

    public List<CustomerDto> getAllCustomer()throws Exception {
        return customerService.getAll();
    }

    public CustomerDto getCustomer(String customerId)throws Exception {
        return customerService.getCustomer(customerId);
    }

    public String updateCustomer(CustomerDto customerDto)throws Exception {
        return customerService.updateCustomer(customerDto);
    }

    public String deleteCustomer(String customerId)throws Exception {
        return customerService.deleteCustomer(customerId);
    }
    
}
