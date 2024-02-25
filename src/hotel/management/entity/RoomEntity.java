/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.entity;

/**
 *
 * @author Deshini
 */
public class RoomEntity {
    private String roomId;
    private String floor;
    private double floorArea;
    private boolean bed;
    private boolean table;
    private boolean coffeeKit;
    private String bedType;
    private boolean ac;
    private boolean NonAc;
    private String roomCatogory;

    public RoomEntity() {
    }

    public RoomEntity(String roomId, String floor, double floorArea, boolean bed, boolean table, boolean coffeeKit, String bedType, boolean ac, boolean NonAc, String roomCatogory) {
        this.roomId = roomId;
        this.floor = floor;
        this.floorArea = floorArea;
        this.bed = bed;
        this.table = table;
        this.coffeeKit = coffeeKit;
        this.bedType = bedType;
        this.ac = ac;
        this.NonAc = NonAc;
        this.roomCatogory = roomCatogory;
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
     * @return the floor
     */
    public String getFloor() {
        return floor;
    }

    /**
     * @param floor the floor to set
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }

    /**
     * @return the floorArea
     */
    public double getFloorArea() {
        return floorArea;
    }

    /**
     * @param floorArea the floorArea to set
     */
    public void setFloorArea(double floorArea) {
        this.floorArea = floorArea;
    }

    /**
     * @return the bed
     */
    public boolean isBed() {
        return bed;
    }

    /**
     * @param bed the bed to set
     */
    public void setBed(boolean bed) {
        this.bed = bed;
    }

    /**
     * @return the table
     */
    public boolean isTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(boolean table) {
        this.table = table;
    }

    /**
     * @return the coffeeKit
     */
    public boolean isCoffeeKit() {
        return coffeeKit;
    }

    /**
     * @param coffeeKit the coffeeKit to set
     */
    public void setCoffeeKit(boolean coffeeKit) {
        this.coffeeKit = coffeeKit;
    }

    /**
     * @return the bedType
     */
    public String getBedType() {
        return bedType;
    }

    /**
     * @param bedType the bedType to set
     */
    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    /**
     * @return the ac
     */
    public boolean isAc() {
        return ac;
    }

    /**
     * @param ac the ac to set
     */
    public void setAc(boolean ac) {
        this.ac = ac;
    }

    /**
     * @return the NonAc
     */
    public boolean isNonAc() {
        return NonAc;
    }

    /**
     * @param NonAc the NonAc to set
     */
    public void setNonAc(boolean NonAc) {
        this.NonAc = NonAc;
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

    @Override
    public String toString() {
        return "RoomEntity{" + "roomId=" + roomId + ", floor=" + floor + ", floorArea=" + floorArea + ", bed=" + bed + ", table=" + table + ", coffeeKit=" + coffeeKit + ", bedType=" + bedType + ", ac=" + ac + ", NonAc=" + NonAc + ", roomCatogory=" + roomCatogory + '}';
    }
}