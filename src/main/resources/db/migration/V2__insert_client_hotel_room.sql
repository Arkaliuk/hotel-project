INSERT INTO client(first_name, last_name)
VALUES ('John', 'Stark');
INSERT INTO client(first_name, last_name)
VALUES ('Alex', 'Rodger');
INSERT INTO client(first_name, last_name)
VALUES ('Elise', 'Cooper');

INSERT INTO hotel_room(type_room, class_room, client_id, check_in, check_out, price)
VALUES ('SGL', 'LUX', 1, '2021-01-10', '2021-01-12', 1500);
INSERT INTO hotel_room(type_room, class_room, client_id, check_in, check_out, price)
VALUES ('DBL', 'LUX', 2, '2021-02-10', '2021-02-12', 3000);
INSERT INTO hotel_room(type_room, class_room, client_id, check_in, check_out, price)
VALUES ('SGL', 'LUX', 3, '2021-03-10', '2021-03-12', 1500);


INSERT INTO hotel_room(type_room, class_room, price)
VALUES ('SGL', 'LUX', 3000);
INSERT INTO hotel_room(type_room, class_room, price)
VALUES ('SGL', 'ECONOMY',  1000);
INSERT INTO hotel_room(type_room, class_room, price)
VALUES ('SGL', 'STANDARD',  1300);

INSERT INTO hotel_room(type_room, class_room, price)
VALUES ('DBL', 'LUX', 3000);
INSERT INTO hotel_room(type_room, class_room, price)
VALUES ('DBL', 'STANDARD', 2600);
INSERT INTO hotel_room(type_room, class_room, price)
VALUES ('DBL', 'ECONOMY', 2000);
