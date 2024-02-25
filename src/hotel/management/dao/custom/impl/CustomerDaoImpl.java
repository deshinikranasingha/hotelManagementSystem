/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.dao.custom.impl;

import hotel.management.dao.CrudUtil;
import hotel.management.dao.custom.CustomerDao;
import hotel.management.entity.CustomerEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deshini
 */
public class CustomerDaoImpl implements CustomerDao{

    @Override
    public boolean save(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO customer VALUES (?,?,?,?,?,?,?)",
                t.getCustomerId(),
                t.getCustomerTitle(),
                t.getCustomerFirstName(),
                t.getCustomerLastName(),
                t.getCustomerNic(),
                t.getCustomerAddress(),
                t.getCustomerContact());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE customer SET CustTitle=?, CustFirstName=?, CustLastName=?, CustNic=?, CustAddress=?, Contact=? WHERE CustID=?",
                t.getCustomerTitle(),
                t.getCustomerFirstName(),
                t.getCustomerLastName(),
                t.getCustomerNic(),
                t.getCustomerAddress(),
                t.getCustomerContact(),
                t.getCustomerId());
    }

    @Override
    public boolean delete(String id) throws Exception {
         return CrudUtil.executeUpdate("DELETE FROM customer WHERE CustID=?", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM customer WHERE CustID = ?", id);
        CustomerEntity customerEntity = null;
        
        if (rst.next()) {
            customerEntity = new CustomerEntity(
            rst.getString("CustID"),
            rst.getString("CustTitle"),
            rst.getString("CustFirstName"),
            rst.getString("CustLastName"),
            rst.getString("CustNic"),
            rst.getString("CustAddress"),
            rst.getString("Contact"));
        }
        
        // Close the ResultSet
        if (rst != null) {
            rst.close();
        }
        
        return customerEntity;
    }

    @Override
    public List<CustomerEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM customer");
        List<CustomerEntity> customerEntities = new ArrayList<>();
        
        while (rst.next()) {
            customerEntities.add(new CustomerEntity(
                    rst.getString("CustID"),
                    rst.getString("CustTitle"),
                    rst.getString("CustFirstName"),
                    rst.getString("CustLastName"),
                    rst.getString("CustNic"),
                    rst.getString("CustAddress"),
                    rst.getString("Contact")));
        }
        return customerEntities;
    }
    
}
