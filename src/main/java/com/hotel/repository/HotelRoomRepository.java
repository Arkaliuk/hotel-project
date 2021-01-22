package com.hotel.repository;

import com.hotel.model.ClassRoom;
import com.hotel.model.HotelRoom;
import com.hotel.model.TypeRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HotelRoomRepository extends JpaRepository<HotelRoom, Integer> {

    @Query("select hr from HotelRoom hr")
    List<HotelRoom> getAll();

    @Query("select hr from HotelRoom hr where hr.price <= ?1")
    List<HotelRoom> getHotelRoomByPriceAndClient(int price);

    @Query("select hr from HotelRoom hr where hr.typeRoom = ?1 and hr.classRoom = ?2 and hr.price <= ?3")
    List<HotelRoom> getHotelRoomByPriceAndClassRoomAndTypeRoomAndClient(TypeRoom typeRoom, ClassRoom classRoom, int price);
}
