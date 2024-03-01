/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.controller;

import hotel.management.dto.RoomDto;
import hotel.management.service.ServiceFactory;
import hotel.management.service.custom.RoomService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deshini
 */
public class RoomController {
    
    private RoomService roomService = (RoomService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOM);

    public List<RoomDto> getAllRooms() throws Exception {
        return roomService.getAll();
    }

    public String deleteRoom(String roomId) throws Exception {
        return roomService.deleteRoom(roomId);
    }

    public RoomDto getRoom(String roomId) throws Exception {
        return roomService.getRoom(roomId);
    }

    public String addRoom(RoomDto roomDto) throws Exception {
        return roomService.addRoom(roomDto);
    }

    public String updateRoom(RoomDto roomDto) throws Exception {
        return roomService.updateRoom(roomDto);
    }

    public List<RoomDto> getRoom() throws Exception{
        return roomService.getAll();
    }

    public List<RoomDto> getRoomsFromSpecificCategory(String category) throws Exception{
        return roomService.getRoomsFromSpecificCategory(category);
    }
    
}
