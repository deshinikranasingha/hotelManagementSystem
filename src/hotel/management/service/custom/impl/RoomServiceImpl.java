/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.service.custom.impl;

import hotel.management.dao.CrudUtil;
import hotel.management.dao.DaoFactory;
import hotel.management.dao.custom.RoomDao;
import hotel.management.dto.RoomDto;
import hotel.management.entity.CustomerEntity;
import hotel.management.entity.RoomEntity;
import hotel.management.service.custom.RoomService;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deshini
 */
public class RoomServiceImpl implements RoomService{
    
    private RoomDao roomDao = (RoomDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ROOM);

    @Override
    public List<RoomDto> getAll() throws Exception {
        List<RoomDto> roomDtos = new ArrayList<>();
        List<RoomEntity> roomEntities = roomDao.getAll();
        for (RoomEntity roomEntity : roomEntities) {
            roomDtos.add(new RoomDto(roomEntity.getRoomId(),roomEntity.getFloor(),roomEntity.getFloorArea(),roomEntity.isBed(),roomEntity.isTable(),roomEntity.isCoffeeKit(),roomEntity.getBedType(),roomEntity.isAc(),roomEntity.isNonAc(),roomEntity.getRoomCatogory()));
        }
        return roomDtos;
    }

    @Override
    public String addRoom(RoomDto roomDto) throws Exception {
        RoomEntity roomEntity = new RoomEntity(roomDto.getRoomId(),roomDto.getFloor(),roomDto.getFloorArea(),roomDto.isBed(),roomDto.isTable(),roomDto.isCoffeeKit(),roomDto.getBedType(),roomDto.isAc(),roomDto.isNonAc(),roomDto.getRoomCatogory());

        if (roomDao.save(roomEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }

    }

    @Override
    public String updateRoom(RoomDto roomDto) throws Exception {
        RoomEntity roomEntity = new RoomEntity(roomDto.getRoomId(),roomDto.getFloor(),roomDto.getFloorArea(),roomDto.isBed(),roomDto.isTable(),roomDto.isCoffeeKit(),roomDto.getBedType(),roomDto.isAc(),roomDto.isNonAc(),roomDto.getRoomCatogory());

        if (roomDao.update(roomEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteRoom(String roomId) throws Exception {
        if (roomDao.delete(roomId)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public RoomDto getRoom(String roomId) throws Exception {
        RoomEntity roomEntity = roomDao.get(roomId);
        if (roomEntity != null) {
            return new RoomDto(roomEntity.getRoomId(),roomEntity.getFloor(),roomEntity.getFloorArea(),roomEntity.isBed(),roomEntity.isTable(),roomEntity.isCoffeeKit(),roomEntity.getBedType(),roomEntity.isAc(),roomEntity.isNonAc(),roomEntity.getRoomCatogory());
        }
        return null;
    }

    @Override
    public List<RoomDto> getRoomsFromSpecificCategory(String category) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
