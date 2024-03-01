/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotel.management.dao.custom;

import hotel.management.dao.CrudDao;
import hotel.management.entity.ReservationDetailsEntity;

/**
 *
 * @author Deshini
 */
public interface ReservationDetailsDao extends CrudDao < ReservationDetailsEntity , String> {
    
    boolean availability(ReservationDetailsEntity t) throws Exception;

    boolean delete(String resId, String roomId) throws Exception;
    
    public ReservationDetailsEntity get(String resId, String roomId) throws Exception;
    
}
