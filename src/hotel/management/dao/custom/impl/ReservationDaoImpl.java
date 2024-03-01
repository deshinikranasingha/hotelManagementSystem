/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.dao.custom.impl;

import hotel.management.dao.CrudUtil;
import hotel.management.dao.custom.ReservationDao;
import hotel.management.entity.ReservationEntity;
import java.util.List;

/**
 *
 * @author Deshini
 */
public class ReservationDaoImpl implements ReservationDao {

    @Override
    public boolean save(ReservationEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO reservation VALUES(?,?,?,?)",
                t.getResID(),
                t.getCustID(),
                t.getDate(),
                t.getTotalPrice()
        );
    }

    @Override
    public boolean update(ReservationEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE reservation set totalPrice= totalPrice - ? WHERE resId=? ",
                t.getTotalPrice(),
                t.getResID()
        );
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM reservation WHERE ReservationID=?", id);
    }

    @Override
    public ReservationEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ReservationEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
