package hotel.management.dao.custom.impl;

import hotel.management.dao.CrudUtil;
import hotel.management.dao.custom.RoomCatogoryDao;
import hotel.management.entity.RoomCatogoryEntity;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RoomCatogoryDaoImpl implements RoomCatogoryDao {

    @Override
    public boolean save(RoomCatogoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO room_catogory VALUES (?,?,?,?,?)",
                t.getRoomCatogoryId(),
                t.getRoomCatogoryName(),
                t.getFullBoardPrice(),
                t.getHalfBoardPrice(), // Corrected parameter order
                t.getBreadAndBreakfastPrice());
    }

    @Override
    public boolean update(RoomCatogoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE room_catogory SET RoomCatogoryName=?, FullBoardPrice=?, HalfBoardPrice=?, BreadAndBreakfastPrice=? WHERE RoomCatogoryID=?",
                t.getRoomCatogoryName(),
                t.getFullBoardPrice(),
                t.getHalfBoardPrice(),
                t.getBreadAndBreakfastPrice(),
                t.getRoomCatogoryId());
    }

    @Override
    public RoomCatogoryEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM room_catogory WHERE RoomCatogoryID = ?", id);
        RoomCatogoryEntity roomCatogoryEntity = null;
        
        if (rst.next()) {
            roomCatogoryEntity = new RoomCatogoryEntity(
                    rst.getString("RoomCatogoryID"),
                    rst.getString("RoomCatogoryName"),
                    rst.getDouble("FullBoardPrice"), // Assuming FullBoardPrice is of type double
                    rst.getDouble("HalfBoardPrice"),
                    rst.getDouble("BreadAndBreakfastPrice"));
        }
        
        // Close the ResultSet
        if (rst != null) {
            rst.close();
        }
        
        return roomCatogoryEntity;
    }

    @Override
    public List<RoomCatogoryEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM room_catogory");
        List<RoomCatogoryEntity> roomCatogoryEntities = new ArrayList<>();
        
        while (rst.next()) {
            roomCatogoryEntities.add(new RoomCatogoryEntity(rst.getString("RoomCatogoryID"), rst.getString("RoomCatogoryName"), rst.getDouble("FullBoardPrice"), rst.getDouble("HalfBoardPrice"), rst.getDouble("BreadAndBreakfastPrice")));
        }
        return roomCatogoryEntities;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM room_catogory WHERE RoomCatogoryID=?", id);
    }   
}
