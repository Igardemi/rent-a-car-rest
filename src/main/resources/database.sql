INSERT INTO `vehicle` (`id`, `car_license`, `image`, `make`, `model`, `power`, `price_day`, `transmission`, `type`)
VALUES (NULL, '3243HYL', 'https://www.ford.es/content/dam/guxeu/global-shared/vehicle-images/nameplate-derivatives/focus/2022-lhd/ford-focus-st.png.renditions.original.png', 'Ford', 'Focus ST', '120', '12', 'Manual', 'Diesel'),
(NULL, '3245HNL', 'https://freepngimg.com/thumb/bmw/58056-car-bmw-m3-2017-x6-free-download-png-hq.png', 'BMW', 'M3', '150', '16', 'Manual', 'Gasolina'),
(NULL, '2045JLN', 'https://cars.usnews.com/static/images/Auto/izmo/i238999/2016_mercedes_benz_c_class_angularfront.jpg', 'Mercedes', 'Clase C', '140', '18', 'Automatico', 'Hybrido'),
(NULL, '2046BLN', 'https://pngimg.com/uploads/audi/audi_PNG1737.png', 'Audi', 'A1', '130', '12', 'Automatico', 'Hybrido'),
(NULL, '1426GHL', 'https://th.bing.com/th/id/R.37c65513d5ca0cb75ee5cfb8bbf730d7?rik=ojeOQTZYTmIpbA&pid=ImgRaw&r=0', 'Volkswagen', 'Beetle', '90', '10', 'Manual', 'Diesel'),
(NULL, '2024YJL', 'https://tecnoautos.com/wp-content/uploads/2010/10/mazda-cx-7-lat.jpg?fb01da', 'Mazda', 'Cx-7', '100', '10', 'Manual', 'Diesel'),
(NULL, '4894KNG', 'https://pepecarrenting.pepecar.com/sites/pepecarrenting.com/files/styles/image_w800/public/models/opel_20astraeditionhb6fb_lowaggressive_blanco-alpino.png?itok=CrtgnSW9', 'Opel', 'Corsa', '70', '8', 'Manual', 'Gasolina'),
(NULL, '9833SVF', 'https://th.bing.com/th/id/OIP.rqQn303eA1617INQZYP1MAHaEu?pid=ImgDet&rs=1', 'Seat', 'Leon', '105', '11', 'Manual', 'Diesel');


INSERT INTO `user` (`id`, `admin`, `born_date`, `date_license_valid`, `name`, `nif`, `surname`, `password`) VALUES
(NULL, true, '1987-09-07 16:27:50', '2035-09-07 00:00:00', 'Ivan', '24673833R', 'Garcia', 'password');

INSERT INTO `booking` (`id`, `finish_date`, `price`, `start_date`, `user`, `vehicle`) VALUES (NULL, '2023-04-28 16:31:56', '30', '2023-04-30 16:31:56', '1', '1');