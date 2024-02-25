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
public class ReservationEntity {
    
    private String reservationId;
    private String customerId;
    private String roomCatogory;
    private String roomNumber;
    private boolean fullBoard;
    private boolean halfBoard;
    private boolean breadAndBreakfast;
    private Date arrivalDate;
    private Date departureDate;

    public ReservationEntity() {
    }

    public ReservationEntity(String reservationId, String customerId, String roomCatogory, String roomNumber, boolean fullBoard, boolean halfBoard, boolean breadAndBreakfast, Date arrivalDate, Date departureDate) {
        this.reservationId = reservationId;
        this.customerId = customerId;
        this.roomCatogory = roomCatogory;
        this.roomNumber = roomNumber;
        this.fullBoard = fullBoard;
        this.halfBoard = halfBoard;
        this.breadAndBreakfast = breadAndBreakfast;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
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
     * @return the roomCatogory
     */
    public String getRoomCatogory() {
        return roomCatogory;
    }

    /**
     * @param roomCatogory the roomCatogory to set
     */
    public void setRoomCatogory(String roomCatogory) {
        this.roomCatogory = roomCatogory;
    }

    /**
     * @return the roomNumber
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * @return the fullBoard
     */
    public boolean isFullBoard() {
        return fullBoard;
    }

    /**
     * @param fullBoard the fullBoard to set
     */
    public void setFullBoard(boolean fullBoard) {
        this.fullBoard = fullBoard;
    }

    /**
     * @return the halfBoard
     */
    public boolean isHalfBoard() {
        return halfBoard;
    }

    /**
     * @param halfBoard the halfBoard to set
     */
    public void setHalfBoard(boolean halfBoard) {
        this.halfBoard = halfBoard;
    }

    /**
     * @return the breadAndBreakfast
     */
    public boolean isBreadAndBreakfast() {
        return breadAndBreakfast;
    }

    /**
     * @param breadAndBreakfast the breadAndBreakfast to set
     */
    public void setBreadAndBreakfast(boolean breadAndBreakfast) {
        this.breadAndBreakfast = breadAndBreakfast;
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

    @Override
    public String toString() {
        return "ReservationEntity{" + "reservationId=" + reservationId + ", customerId=" + customerId + ", roomCatogory=" + roomCatogory + ", roomNumber=" + roomNumber + ", fullBoard=" + fullBoard + ", halfBoard=" + halfBoard + ", breadAndBreakfast=" + breadAndBreakfast + ", arrivalDate=" + arrivalDate + ", departureDate=" + departureDate + '}';
    }

    
}
