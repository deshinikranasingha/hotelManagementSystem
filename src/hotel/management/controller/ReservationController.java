/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.controller;

import hotel.management.dto.ReservationDto;
import hotel.management.service.ServiceFactory;
import hotel.management.service.custom.ReservationService;
import java.util.List;

/**
 *
 * @author Deshini
 */
public class ReservationController {
    
     private ReservationService reservationService = (ReservationService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RESERVATION);

    public String confirm(ReservationDto reservationDto) throws Exception{
        return reservationService.confirm(reservationDto);
    }

    public List<ReservationDto> getAllReservations() throws Exception{
        return reservationService.getAllReservations();
    }

    public String cancleReservation(String reservationId) throws Exception{
        return reservationService.cancleReservation(reservationId);
    }
    
    public ReservationDto getReservation(String reservationId)throws Exception {
        return reservationService.getReservation(reservationId);
    }
    
}
