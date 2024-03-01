/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.controller;

import hotel.management.dto.ReservationDetailsDto;
import hotel.management.dto.ReservationDto;
import hotel.management.service.ServiceFactory;
import hotel.management.service.custom.ReservationService;
import java.util.List;

/**
 *
 * @author Deshini
 */
public class ReservationController {
    
     private final ReservationService reservationService = (ReservationService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RESERVATION);

    public String reserve(ReservationDto reservationDto) throws Exception {
    
        return reservationService.saveReservation(reservationDto);
    }

    public double getPrice(long numOfDays, String roomType, String packageType) throws Exception {
       
        return reservationService.getPrice(numOfDays, roomType, packageType);
    
    }

    public boolean roomAvailablity(ReservationDetailsDto reservationDetailsDto) throws Exception {
    
        return reservationService.roomAvailablity(reservationDetailsDto);
        
    }

    public String deleteReservation(String resId,String roomId) throws Exception {
    
        return reservationService.deleteReservation(resId, roomId);
    
    }

    public List<ReservationDto> getAllReservations() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
