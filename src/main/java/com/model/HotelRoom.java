package com.model;

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
    private TypeRoom typeRoom;
    @Column(name = "class_room")
    private ClassRoom classRoom;
    @ManyToOne(fetch = FetchType.EAGER)
    private Client client;
    @Column(name = "check_in")
    private LocalDate checkIn;
    @Column(name = "check_out")
    private LocalDate checkOut;
    @Column(name = "price")
    private int price;
}
