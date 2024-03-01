/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.entity;

import java.util.Date;

/**
 *
 * @author Deshini
 */
public class ReservationDetailsEntity {
    
    private String resId;
    private String roomId;
    private Date arrivalDate;
    private Date departureDate;
    private String pakage;
    private Double price;

    public ReservationDetailsEntity() {
    }

    public ReservationDetailsEntity(String resId, String roomId, Date arrivalDate, Date departureDate, String pakage, Double price) {
        this.resId = resId;
        this.roomId = roomId;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.pakage = pakage;
        this.price = price;
    }

    /**
     * @return the resId
     */
    public String getResId() {
        return resId;
    }

    /**
     * @param resId the resId to set
     */
    public void setResId(String resId) {
        this.resId = resId;
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
        return "ReservationDetailsEntity{" + "resId=" + resId + ", roomId=" + roomId + ", arrivalDate=" + arrivalDate + ", departureDate=" + departureDate + ", pakage=" + pakage + ", price=" + price + '}';
    }
}
