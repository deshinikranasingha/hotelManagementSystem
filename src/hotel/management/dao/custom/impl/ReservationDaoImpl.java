/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.dao.custom.impl;

import hotel.management.dao.CrudUtil;
import hotel.management.dao.custom.ReservationDao;
import hotel.management.entity.ReservationEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deshini
 */
public class ReservationDaoImpl implements ReservationDao{

    @Override
    public boolean save(ReservationEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO reservation VALUES (?,?,?,?,?,?,?,?,?)",
                t.getReservationId(),
                t.getCustomerId(),
                t.getRoomCatogory(),
                t.getRoomNumber(),
                t.isFullBoard(),
                t.isHalfBoard(),
                t.isBreadAndBreakfast(),
                t.getArrivalDate(),
                t.getDepartureDate());
    }

    @Override
    public boolean update(ReservationEntity t) throws Exception {
         return CrudUtil.executeUpdate("UPDATE reservation SET CustomerID=?, Floor=?, RoomNumber=?, FullBoard=?, HalfBoard=?, BreadAndBreakfast=?, ArrivalDate=?, DepartureDate=? WHERE ReservationID=?",
            t.getCustomerId(),
            t.getRoomCatogory(),
            t.getRoomNumber(),
            t.isFullBoard(),
            t.isHalfBoard(),
            t.isBreadAndBreakfast(),
            t.getArrivalDate(),
            t.getDepartureDate(),
            t.getReservationId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM reservation WHERE ReservationID=?", id);
    }

    @Override
    public ReservationEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM reservation WHERE ReservationID = ?", id);
        ReservationEntity reservationEntity = null;

        if (rst.next()) {
            reservationEntity = new ReservationEntity(
                    rst.getString("ReservationID"),
                    rst.getString("CustomerID"),
                    rst.getString("RoomCatogory"),
                    rst.getString("RoomNumber"),
                    rst.getBoolean("FullBoard"),
                    rst.getBoolean("HalfBoard"),
                    rst.getBoolean("BreadAndBreakfast"),
                    rst.getTimestamp("ArrivalDate"),
                    rst.getTimestamp("DepartureDate"));
        }
        
        // Close the ResultSet
        if (rst != null) {
            rst.close();
        }

        return reservationEntity;
    }

    @Override
    public List<ReservationEntity> getAll() throws Exception {
        try (ResultSet rst = CrudUtil.executeQuery("SELECT * FROM reservation")) {
            List<ReservationEntity> reservationEntities = new ArrayList<>();

            while (rst.next()) {
                reservationEntities.add(new ReservationEntity(
                        rst.getString("ReservationID"),
                        rst.getString("CustomerID"),
                        rst.getString("RoomCatogory"),
                        rst.getString("RoomNumber"),
                        rst.getBoolean("FullBoard"),
                        rst.getBoolean("HalfBoard"),
                        rst.getBoolean("BreadAndBreakfast"),
                        rst.getTimestamp("ArrivalDate"),
                        rst.getTimestamp("DepartureDate")));
            }
            return reservationEntities;
        }
    }
    
}
