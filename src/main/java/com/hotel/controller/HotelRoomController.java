package com.hotel.controller;


import com.hotel.model.ClassRoom;
import com.hotel.model.HotelRoom;
import com.hotel.model.TypeRoom;
import com.hotel.service.HotelRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/hotel")
public class HotelRoomController {

    private HotelRoomService hotelRoomService;

    @Autowired
    public HotelRoomController(HotelRoomService hotelRoomService) {
        this.hotelRoomService = hotelRoomService;
    }


    @CrossOrigin
    @GetMapping("/rooms")
    public List<HotelRoom> getAllRooms() {
        return hotelRoomService.getAllRooms();
    }

    @CrossOrigin
    @GetMapping("price")
    public List<HotelRoom> getRoomsByPrice(@RequestParam int price) {
        return hotelRoomService.getFreeRoomByPriceAndClient(price);
    }

    @CrossOrigin
    @GetMapping("room")
    public List<HotelRoom> getRoomsByPriceAndTypeAndClass(@RequestParam("type") TypeRoom typeRoom,
                                                          @RequestParam("class") ClassRoom classRoom,
                                                          @RequestParam("price") int price) {
        return hotelRoomService.getFreeRoomByTypeAndClassAndClientAndPrice(typeRoom, classRoom, price);
    }
}
