package com.hotel.service;

import com.hotel.model.Reserve;
import com.hotel.repository.ReserveRepository;
import org.springframework.stereotype.Service;
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

    public Reserve check(Reserve reserve) {
        List<Reserve> all = reserveRepository.getAll();
        for (Reserve reserveDB : all) {
            if (reserveDB.getHotelRoom().getId() == reserve.getHotelRoom().getId()) {
                if (reserve.getCheckIn().isAfter(reserveDB.getCheckIn()) && reserve.getCheckIn().isBefore(reserveDB.getCheckOut())) {
                    return null;
                }
                if (reserve.getCheckOut().isAfter(reserveDB.getCheckIn()) && reserve.getCheckOut().isBefore(reserveDB.getCheckOut())) {
                    return null;
                }
                if (reserve.getCheckIn().isBefore(reserveDB.getCheckIn()) && reserve.getCheckOut().isAfter(reserveDB.getCheckOut())) {
                    return null;
                }
            }
        }
        return addReserve(reserve);
    }
}
