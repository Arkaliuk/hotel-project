CREATE table client
(
    id         serial primary key,
    first_name varchar(100),
    last_name  varchar(100)
);

CREATE TYPE type AS ENUM ('SGL', 'DBL');
CREATE TYPE class AS ENUM ('LUX', 'STANDARD','ECONOMY');

CREATE table hotel_room
(
    id         serial primary key,
    type_room  type,
    class_room class,
    client_id  int references client (id),
    check_in   date,
    check_out  date,
    price      int
);

