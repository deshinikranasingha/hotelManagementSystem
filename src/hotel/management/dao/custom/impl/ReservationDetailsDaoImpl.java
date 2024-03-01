/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.dao.custom.impl;

import hotel.management.dao.CrudUtil;
import hotel.management.dao.custom.ReservationDetailsDao;
import hotel.management.entity.ReservationDetailsEntity;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Deshini
 */
public class ReservationDetailsDaoImpl implements ReservationDetailsDao{

    @Override
    public boolean availability(ReservationDetailsEntity t) throws Exception {
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM reservation_details WHERE NOT(? >= outDate OR ? <= inDate) AND roomId=?",
                
                t.getArrivalDate(),
                t.getDepartureDate(),               
                t.getRoomId()
        );
        
        if (rst.next()) {
    
            return false;
            
        } else {
    
            return true;
            
        }
         
    }

    @Override
    public boolean delete(String resId, String roomId) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM reservation_details WHERE resId=? AND roomId=?",resId,roomId);
    }

    @Override
    public ReservationDetailsEntity get(String resId, String roomId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean save(ReservationDetailsEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO reservation_details VALUES(?,?,?,?,?,?)",
                 
                t.getResId(),
                t.getRoomId(),
                t.getArrivalDate(),
                t.getDepartureDate(),
                t.getPakage(),
                t.getPrice()
                 
         );   
    
    
    }

    @Override
    public boolean update(ReservationDetailsEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ReservationDetailsEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM reservation_details WHERE resId=? AND roomId=?",resId,roomId);
      while(rst.next()){
      
      return new ReservationDetailsEntity(
                       
                rst.getString("resId"),
                rst.getString("roomId"),
                rst.getTimestamp("inDate"),
                rst.getTimestamp("outDate"),
                rst.getString("pakage"),
                rst.getDouble("Price")
                            
      );
              
    }
    
      return null;
    }

    @Override
    public List<ReservationDetailsEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
