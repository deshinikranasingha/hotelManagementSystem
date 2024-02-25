/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotel.management.service.custom;

import hotel.management.dto.RoomCatogoryDto;
import hotel.management.service.SuperService;
import java.util.List;

/**
 *
 * @author Deshini
 */
public interface RoomCatogoryService extends SuperService{
    
    public List<RoomCatogoryDto> getAll() throws Exception;

    public String addRoomCatogory(RoomCatogoryDto roomCatogoryDto) throws Exception;
    
    public String updateRoomCatogory(RoomCatogoryDto roomCatogoryDto) throws Exception;
    
    public String deleteRoomCatogory(String roomCatogoryId) throws Exception;

    public RoomCatogoryDto getRoomCatogory(String roomCatogoryId) throws Exception;

    public List<RoomCatogoryDto> getAllRoomCatogory()throws Exception;
    
}
