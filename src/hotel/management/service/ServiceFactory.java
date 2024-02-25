/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.service;

import hotel.management.service.custom.impl.CustomerServiceImpl;
import hotel.management.service.custom.impl.ReservationServiceImpl;
import hotel.management.service.custom.impl.RoomCatogoryServiceImpl;
import hotel.management.service.custom.impl.RoomServiceImpl;

/**
 *
 * @author Deshini
 */
public class ServiceFactory {
    
    private static ServiceFactory serviceFactory;

    private ServiceFactory() {}
    
    public static ServiceFactory getInstance(){
        if (serviceFactory==null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType serviceType){
        switch(serviceType){
            case CUSTOMER:
                return new CustomerServiceImpl();
            case ROOM:
                return new RoomServiceImpl();
            case ROOM_CATOGORY:
                return new RoomCatogoryServiceImpl();
            case RESERVATION:
                return new ReservationServiceImpl();
            default:
                return null;
        }
    }
    
    public enum ServiceType{
        CUSTOMER,ROOM,ROOM_CATOGORY,RESERVATION
    }
    
    
    
}
