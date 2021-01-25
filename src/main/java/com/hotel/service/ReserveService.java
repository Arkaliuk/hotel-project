package com.hotel.service;

import com.hotel.model.Reserve;
import com.hotel.repository.ReserveRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReserveService {

    private ReserveRepository reserveRepository;

    public ReserveService(ReserveRepository reserveRepository) {
        this.reserveRepository = reserveRepository;
    }

    public List<Reserve> getReserve(int clientId) {
        return reserveRepository.getReserveByClient(clientId);
    }

    public Reserve addReserve(Reserve reserve) {
        return reserveRepository.save(reserve);
    }

    public Reserve check(Reserve reserve) throws Exception {
        List<Reserve> reservedHotelRooms = reserveRepository.getReserveByHotelRoomAndDates(reserve.getHotelRoom().getId(), reserve.getCheckIn(), reserve.getCheckOut());
        for (Reserve existingReservation : reservedHotelRooms) {
            if (reserve.getCheckIn().isBefore(existingReservation.getCheckIn()) && reserve.getCheckOut().isAfter(existingReservation.getCheckOut())) {
                throw new Exception("Enter another date");
            }
        }
        return addReserve(reserve);
    }
}
