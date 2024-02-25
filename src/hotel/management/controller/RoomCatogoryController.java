/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.controller;

import hotel.management.dto.RoomCatogoryDto;
import hotel.management.service.ServiceFactory;
import hotel.management.service.custom.RoomCatogoryService;
import java.util.List;

/**
 *
 * @author Deshini
 */
public class RoomCatogoryController {
    
    private RoomCatogoryService roomCatogoryService = (RoomCatogoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOM_CATOGORY);

    public List<RoomCatogoryDto> getAllRoomCatogory()throws Exception {
        return roomCatogoryService.getAll();
    }

    public String addRoomCatogory(RoomCatogoryDto roomCatogoryDto)throws Exception {
        return roomCatogoryService.addRoomCatogory(roomCatogoryDto);
    }

    public String updateRoomCatogory(RoomCatogoryDto roomCatogoryDto)throws Exception {
        return roomCatogoryService.updateRoomCatogory(roomCatogoryDto);
    }

    public String deleteRoomCatogory(String roomCatogoryId)throws Exception {
        return roomCatogoryService.deleteRoomCatogory(roomCatogoryId);
    }

    public RoomCatogoryDto getRoomCatogory(String roomCatogoryId)throws Exception {
        return roomCatogoryService.getRoomCatogory(roomCatogoryId);
    }

    public List<RoomCatogoryDto> getRoomCatogory()throws Exception {
        return roomCatogoryService.getAllRoomCatogory();
    }
    
}
