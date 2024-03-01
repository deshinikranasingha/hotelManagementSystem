/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotel.management.service.custom;

import hotel.management.dto.RoomDto;
import hotel.management.service.SuperService;
import java.util.List;

/**
 *
 * @author Deshini
 */
public interface RoomService extends SuperService{
    
    public List<RoomDto> getAll() throws Exception;

    public String addRoom(RoomDto roomDto) throws Exception;
    
    public String updateRoom(RoomDto roomDto) throws Exception;
    
    public String deleteRoom(String roomId) throws Exception;

    RoomDto getRoom(String roomId) throws Exception;

    public List<RoomDto> getRoomsFromSpecificCategory(String category);
    
}
