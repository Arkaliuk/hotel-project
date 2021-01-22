package com.hotel.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "hotel_room")
public class HotelRoom {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "type_room")
    @Enumerated(EnumType.STRING)
    private TypeRoom typeRoom;
    @Column(name = "class_room")
    @Enumerated(EnumType.STRING)
    private ClassRoom classRoom;
    @Column(name = "price")
    private int price;
}
