package hotel.management.dao.custom.impl;

import hotel.management.dao.CrudUtil;
import hotel.management.dao.custom.RoomDao;
import hotel.management.entity.RoomEntity;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RoomDaoImpl implements RoomDao {

    @Override
    public boolean save(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO room VALUES (?,?,?,?,?,?,?,?,?,?)",
                t.getRoomId(),
                t.getFloor(),
                t.getFloorArea(),
                t.isBed(),
                t.isTable(),
                t.isCoffeeKit(),
                t.getBedType(),
                t.isAc(),
                t.isNonAc(),
                t.getRoomCatogory());
    }

    @Override
    public boolean update(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE room SET Floor=?, FloorArea=?, Bed=?, Table_available=?, Coffee_Kit=?, BedType=? , AC=?, Non_AC=?, RoomCatogory=? WHERE RoomID=?",
                t.getFloor(),
                t.getFloorArea(),
                t.isBed(),
                t.isTable(),
                t.isCoffeeKit(),
                t.getBedType(),
                t.isAc(),
                t.isNonAc(),
                t.getRoomCatogory(),
                t.getRoomId());
    }

    @Override
    public RoomEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM room WHERE RoomID = ?", id);
        if (rst != null && rst.next()) {
            return new RoomEntity(
                    rst.getString("RoomID"),
                    rst.getString("Floor"),
                    rst.getDouble("FloorArea"),
                    rst.getBoolean("Bed"),
                    rst.getBoolean("Table_available"),
                    rst.getBoolean("Coffee_Kit"),
                    rst.getString("BedType"),
                    rst.getBoolean("AC"),
                    rst.getBoolean("Non_AC"),
                    rst.getString("RoomCatogory"));
        }

        return null;
    }

    @Override
    public List<RoomEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM room");
        List<RoomEntity> roomEntities = new ArrayList<>();

        while (rst.next()) {
            roomEntities.add(new RoomEntity(
                    rst.getString("RoomID"),
                    rst.getString("Floor"),
                    rst.getDouble("FloorArea"),
                    rst.getBoolean("Bed"),
                    rst.getBoolean("Table_available"),
                    rst.getBoolean("Coffee_Kit"),
                    rst.getString("BedType"),
                    rst.getBoolean("AC"),
                    rst.getBoolean("Non_AC"),
                    rst.getString("RoomCatogory")));
        }

        return roomEntities;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM room WHERE RoomID=?", id);
    }
    
    
}
