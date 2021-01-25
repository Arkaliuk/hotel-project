package com.hotel.repository;

import com.hotel.model.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface ReserveRepository extends JpaRepository<Reserve, Integer> {

    @Query("select r from Reserve r")
    List<Reserve> getAll();

    @Query("select r from Reserve r where r.client.id = ?1")
    List<Reserve> getReserveByClient(int clientId);

    @Query("select r from Reserve r where r.hotelRoom.id = ?1 " +
            "and (?2 not between r.checkIn and r.checkOut) and (?3 not between r.checkIn and r.checkOut) and r.checkIn <> ?2 and r.checkOut <> ?3")
    List<Reserve> getReserveByHotelRoomAndDates(int hotelRoomId,
                                                LocalDate checkIn,
                                                LocalDate checkOut);
}
