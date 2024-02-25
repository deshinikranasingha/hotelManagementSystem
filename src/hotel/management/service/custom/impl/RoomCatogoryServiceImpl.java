/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.service.custom.impl;

import hotel.management.dao.DaoFactory;
import hotel.management.dao.custom.RoomCatogoryDao;
import hotel.management.dto.RoomCatogoryDto;
import hotel.management.entity.RoomCatogoryEntity;
import hotel.management.service.custom.RoomCatogoryService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deshini
 */
public class RoomCatogoryServiceImpl implements RoomCatogoryService{
    
    private RoomCatogoryDao roomCatogoryDao = (RoomCatogoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ROOM_CATOGORY);

    @Override
    public List<RoomCatogoryDto> getAll() throws Exception {
        List<RoomCatogoryDto> roomCatogoryDtos = new ArrayList<>();
        List<RoomCatogoryEntity> roomCatogoryEntities = roomCatogoryDao.getAll();
        for (RoomCatogoryEntity entity : roomCatogoryEntities) {roomCatogoryDtos.add(new RoomCatogoryDto(entity.getRoomCatogoryId(), entity.getRoomCatogoryName(), entity.getFullBoardPrice(), entity.getHalfBoardPrice(),entity.getBreadAndBreakfastPrice()));
        }
        return roomCatogoryDtos;
    }

    @Override
    public String addRoomCatogory(RoomCatogoryDto roomCatogoryDto) throws Exception {
        RoomCatogoryEntity roomCatogoryEntity = new RoomCatogoryEntity(roomCatogoryDto.getRoomCatogoryId(), roomCatogoryDto.getRoomCatogoryName(), roomCatogoryDto.getFullBoardPrice(), roomCatogoryDto.getHalfBoardPrice(), roomCatogoryDto.getBreadAndBreakfastPrice());

        if (roomCatogoryDao.save(roomCatogoryEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }

    }

    @Override
    public String updateRoomCatogory(RoomCatogoryDto roomCatogoryDto) throws Exception {
         RoomCatogoryEntity roomCatogoryEntity = new RoomCatogoryEntity(roomCatogoryDto.getRoomCatogoryId(), roomCatogoryDto.getRoomCatogoryName(), roomCatogoryDto.getFullBoardPrice(), roomCatogoryDto.getHalfBoardPrice(), roomCatogoryDto.getBreadAndBreakfastPrice());


        if (roomCatogoryDao.update(roomCatogoryEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteRoomCatogory(String roomCatogoryId) throws Exception {
         if (roomCatogoryDao.delete(roomCatogoryId)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }


    @Override
    public RoomCatogoryDto getRoomCatogory(String roomCatogoryId)throws Exception{
        RoomCatogoryEntity roomCatogoryEntity = roomCatogoryDao.get(roomCatogoryId);
        if (roomCatogoryEntity != null) {
            return new RoomCatogoryDto(roomCatogoryEntity.getRoomCatogoryId(), roomCatogoryEntity.getRoomCatogoryName(), roomCatogoryEntity.getFullBoardPrice(), roomCatogoryEntity.getHalfBoardPrice(), roomCatogoryEntity.getBreadAndBreakfastPrice());
        }
        return null;
    }

    @Override
    public List<RoomCatogoryDto> getAllRoomCatogory() throws Exception {
        List<RoomCatogoryDto> roomCatogoryDtos = new ArrayList<>();
        List<RoomCatogoryEntity> roomCatogoryEntities = roomCatogoryDao.getAll();
        for (RoomCatogoryEntity entity : roomCatogoryEntities) {roomCatogoryDtos.add(new RoomCatogoryDto(entity.getRoomCatogoryId(), entity.getRoomCatogoryName(), entity.getFullBoardPrice(), entity.getHalfBoardPrice(),entity.getBreadAndBreakfastPrice()));
        }
        return roomCatogoryDtos;
    }
}
