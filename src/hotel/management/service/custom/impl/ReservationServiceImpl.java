/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.service.custom.impl;

import hotel.management.dao.DaoFactory;
import hotel.management.dao.custom.ReservationDao;
import hotel.management.dto.ReservationDto;
import hotel.management.entity.ReservationEntity;
import hotel.management.service.custom.ReservationService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deshini
 */
public class ReservationServiceImpl implements ReservationService{
    
    private ReservationDao reservationDao = (ReservationDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.RESERVATION);

    @Override
    public List<ReservationDto> getAllReservations() throws Exception{
        List<ReservationDto> reservationDtos = new ArrayList<>();
        List<ReservationEntity> reservationEntities = reservationDao.getAll();
        for (ReservationEntity entity : reservationEntities) {reservationDtos.add(new ReservationDto(
                entity.getReservationId(), 
                entity.getCustomerId(),
                entity.getRoomCatogory(), 
                entity.getRoomNumber(),
                entity.isFullBoard(),
                entity.isHalfBoard(),
                entity.isBreadAndBreakfast(),
                entity.getArrivalDate(),
                entity.getDepartureDate()));
        }
        return reservationDtos;
    }

    @Override
    public String confirm(ReservationDto dto) throws Exception{
        ReservationEntity entity = new ReservationEntity(
                dto.getReservationId(), 
                dto.getCustomerId(),
                dto.getRomCatogory(),
                dto.getRoomNumber(),
                dto.isFullBoard(),
                dto.isHalfBoard(),
                dto.isBreadAndBreakfast(),
                dto.getArrivalDate(),
                dto.getDepartureDate());

        if (reservationDao.save(entity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public String cancleReservation(String reservationId) throws Exception{
        if (reservationDao.delete(reservationId)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public ReservationDto getReservation(String reservationId) throws Exception {
        ReservationEntity entity = reservationDao.get(reservationId);
        if (entity != null) {
            return new ReservationDto(
                    entity.getReservationId(),
                    entity.getCustomerId(),
                    entity.getRoomCatogory(),
                    entity.getRoomNumber(),
                    entity.isFullBoard(),
                    entity.isHalfBoard(),
                    entity.isBreadAndBreakfast(),
                    entity.getArrivalDate(),
                    entity.getDepartureDate());
        }
        return null;
    }

}
