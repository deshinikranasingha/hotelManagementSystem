/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotel.management.service.custom;

import hotel.management.dto.CustomerDto;
import hotel.management.service.SuperService;
import java.util.List;

/**
 *
 * @author Deshini
 */
public interface CustomerService extends SuperService{

    public List<CustomerDto> getAll() throws Exception;

    public String saveCustomer(CustomerDto customerDto) throws Exception;

    public String updateCustomer(CustomerDto customerDto) throws Exception;

    public String deleteCustomer(String customerId) throws Exception;

    public CustomerDto getCustomer(String customerId) throws Exception;
    
}
