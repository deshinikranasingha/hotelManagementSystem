/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.dto;

import java.util.Date;

/**
 *
 * @author Deshini
 */
public class ReservationDetailsDto {
    
    private String roomId;
    private Date arrivalDate;
    private Date departureDate;
    private String pakage;
    private String roomCategory;
    private Double price;

    public ReservationDetailsDto() {
    }

    public ReservationDetailsDto(String roomId, Date arrivalDate, Date departureDate, String pakage, String roomCategory, Double price) {
        this.roomId = roomId;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.pakage = pakage;
        this.roomCategory = roomCategory;
        this.price = price;
    }

    /**
     * @return the roomId
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * @param roomId the roomId to set
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    /**
     * @return the arrivalDate
     */
    public Date getArrivalDate() {
        return arrivalDate;
    }

    /**
     * @param arrivalDate the arrivalDate to set
     */
    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /**
     * @return the departureDate
     */
    public Date getDepartureDate() {
        return departureDate;
    }

    /**
     * @param departureDate the departureDate to set
     */
    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    /**
     * @return the pakage
     */
    public String getPakage() {
        return pakage;
    }

    /**
     * @param pakage the pakage to set
     */
    public void setPakage(String pakage) {
        this.pakage = pakage;
    }

    /**
     * @return the roomCategory
     */
    public String getRoomCategory() {
        return roomCategory;
    }

    /**
     * @param roomCategory the roomCategory to set
     */
    public void setRoomCategory(String roomCategory) {
        this.roomCategory = roomCategory;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ReservationDetailsDto{" + "roomId=" + roomId + ", arrivalDate=" + arrivalDate + ", departureDate=" + departureDate + ", pakage=" + pakage + ", roomCategory=" + roomCategory + ", price=" + price + '}';
    }
}
