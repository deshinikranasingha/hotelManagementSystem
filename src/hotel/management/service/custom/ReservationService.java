/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotel.management.service.custom;

import hotel.management.dto.ReservationDetailsDto;
import hotel.management.dto.ReservationDto;
import hotel.management.service.SuperService;
import java.util.List;

/**
 *
 * @author Deshini
 */
public interface ReservationService extends SuperService{

    public List<ReservationDto> getAllReservations() throws Exception;

    public String confirm(ReservationDto reservationDto) throws Exception;

    public String cancleReservation(String reservationId) throws Exception;

    public ReservationDto getReservation(String reservationId)throws Exception;

    public double getPrice(long numOfDays, String roomType, String packageType);

    public String saveReservation(ReservationDto reservationDto);

    public boolean roomAvailablity(ReservationDetailsDto reservationDetailsDto);

    public String deleteReservation(String resId, String roomId);
    
}
