CREATE table client
(
    id         serial primary key,
    first_name varchar(100),
    last_name  varchar(100)
);

CREATE table hotel_room
(
    id         serial primary key,
    type_room  varchar(20),
    class_room varchar(20),
    price      int
);

create table reserve
(
    id            serial primary key,
    client_id     int references client (id),
    hotel_room_id int references hotel_room (id),
    check_in      date,
    check_out     date
)



