/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.dao;

import hotel.management.dao.custom.impl.CustomerDaoImpl;
import hotel.management.dao.custom.impl.ReservationDaoImpl;
import hotel.management.dao.custom.impl.RoomCatogoryDaoImpl;
import hotel.management.dao.custom.impl.RoomDaoImpl;

/**
 *
 * @author Deshini
 */
public class DaoFactory {
    
    private static DaoFactory daoFactory;

    private DaoFactory() {}
    
    public static DaoFactory getInstance(){
        if (daoFactory==null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoType daoType){
        switch(daoType){ 
            case CUSTOMER:
                return new CustomerDaoImpl();
            case ROOM:
                return new RoomDaoImpl();
            case ROOM_CATOGORY:
                return new RoomCatogoryDaoImpl();
            case RESERVATION:
                return new ReservationDaoImpl();
            default:
                return null;
        }
    }
    
    public enum DaoType{
        CUSTOMER,ROOM,ROOM_CATOGORY,RESERVATION
    }
    
}
