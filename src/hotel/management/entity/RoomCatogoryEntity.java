/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.entity;

/**
 *
 * @author Deshini
 */
public class RoomCatogoryEntity {
    
    private String roomCatogoryId;
    private String roomCatogoryName;
    private double fullBoardPrice;
    private double halfBoardPrice;
    private double breadAndBreakfastPrice;

    public RoomCatogoryEntity() {
    }

    public RoomCatogoryEntity(String roomCatogoryId, String roomCatogoryName, double fullBoardPrice, double halfBoardPrice, double breadAndBreakfastPrice) {
        this.roomCatogoryId = roomCatogoryId;
        this.roomCatogoryName = roomCatogoryName;
        this.fullBoardPrice = fullBoardPrice;
        this.halfBoardPrice = halfBoardPrice;
        this.breadAndBreakfastPrice = breadAndBreakfastPrice;
    }

    /**
     * @return the roomCatogoryId
     */
    public String getRoomCatogoryId() {
        return roomCatogoryId;
    }

    /**
     * @param roomCatogoryId the roomCatogoryId to set
     */
    public void setRoomCatogoryId(String roomCatogoryId) {
        this.roomCatogoryId = roomCatogoryId;
    }

    /**
     * @return the roomCatogoryName
     */
    public String getRoomCatogoryName() {
        return roomCatogoryName;
    }

    /**
     * @param roomCatogoryName the roomCatogoryName to set
     */
    public void setRoomCatogoryName(String roomCatogoryName) {
        this.roomCatogoryName = roomCatogoryName;
    }

    /**
     * @return the fullBoardPrice
     */
    public double getFullBoardPrice() {
        return fullBoardPrice;
    }

    /**
     * @param fullBoardPrice the fullBoardPrice to set
     */
    public void setFullBoardPrice(double fullBoardPrice) {
        this.fullBoardPrice = fullBoardPrice;
    }

    /**
     * @return the halfBoardPrice
     */
    public double getHalfBoardPrice() {
        return halfBoardPrice;
    }

    /**
     * @param halfBoardPrice the halfBoardPrice to set
     */
    public void setHalfBoardPrice(double halfBoardPrice) {
        this.halfBoardPrice = halfBoardPrice;
    }

    /**
     * @return the breadAndBreakfastPrice
     */
    public double getBreadAndBreakfastPrice() {
        return breadAndBreakfastPrice;
    }

    /**
     * @param breadAndBreakfastPrice the breadAndBreakfastPrice to set
     */
    public void setBreadAndBreakfastPrice(double breadAndBreakfastPrice) {
        this.breadAndBreakfastPrice = breadAndBreakfastPrice;
    }

    @Override
    public String toString() {
        return "RoomCatogoryEntity{" + "roomCatogoryId=" + roomCatogoryId + ", roomCatogoryName=" + roomCatogoryName + ", fullBoardPrice=" + fullBoardPrice + ", halfBoardPrice=" + halfBoardPrice + ", breadAndBreakfastPrice=" + breadAndBreakfastPrice + '}';
    }
    
    
    
}
