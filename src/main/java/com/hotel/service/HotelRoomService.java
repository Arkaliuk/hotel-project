package com.hotel.service;

import com.hotel.model.ClassRoom;
import com.hotel.model.HotelRoom;
import com.hotel.model.TypeRoom;
import com.hotel.repository.HotelRoomRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HotelRoomService {

    private HotelRoomRepository hotelRoomRepository;

    public HotelRoomService(HotelRoomRepository hotelRoomRepository) {
        this.hotelRoomRepository = hotelRoomRepository;
    }

    public List<HotelRoom> getAllRooms() {
        return hotelRoomRepository.getAll();
    }

    public List<HotelRoom> getFreeRoomByPriceAndClient(int price) {
        return hotelRoomRepository.getHotelRoomByPriceAndClient(price);
    }

    public List<HotelRoom> getFreeRoomByTypeAndClassAndClientAndPrice(TypeRoom typeRoom, ClassRoom classRoom, int price) {
        return hotelRoomRepository.getHotelRoomByPriceAndClassRoomAndTypeRoomAndClient(typeRoom, classRoom, price);
    }
}