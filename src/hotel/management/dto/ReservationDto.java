/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.dto;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Deshini
 */
public class ReservationDto {
    
    private String reservationId;
    private String customerId;
    private Date date;
    private List<ReservationDetailsDto> reservationDetailsList;

    public ReservationDto() {
    }

    public ReservationDto(String reservationId, String customerId, Date date, List<ReservationDetailsDto> reservationDetailsList) {
        this.reservationId = reservationId;
        this.customerId = customerId;
        this.date = date;
        this.reservationDetailsList = reservationDetailsList;
    }

    /**
     * @return the reservationId
     */
    public String getReservationId() {
        return reservationId;
    }

    /**
     * @param reservationId the reservationId to set
     */
    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the reservationDetailsList
     */
    public List<ReservationDetailsDto> getReservationDetailsList() {
        return reservationDetailsList;
    }

    /**
     * @param reservationDetailsList the reservationDetailsList to set
     */
    public void setReservationDetailsList(List<ReservationDetailsDto> reservationDetailsList) {
        this.reservationDetailsList = reservationDetailsList;
    }

    @Override
    public String toString() {
        return "ReservationDto{" + "reservationId=" + reservationId + ", customerId=" + customerId + ", date=" + date + ", reservationDetailsList=" + reservationDetailsList + '}';
    }
}
