INSERT INTO `vehicle` (`id`, `car_license`, `image`, `make`, `model`, `power`, `price_day`, `transmission`, `type`)
VALUES (NULL, '3243HYL', 'https://www.ford.es/content/dam/guxeu/global-shared/vehicle-images/nameplate-derivatives/focus/2022-lhd/ford-focus-st.png.renditions.original.png', 'Ford', 'Focus ST', '120', '12.00', 'Manual', '2'),
(NULL, '3245HNL', 'https://th.bing.com/th/id/R.e307d8526cee1913310b44dfd4bfd44d?rik=iTGfRwjJysS1KQ&pid=ImgRaw&r=0', 'BMW', 'M3', '150', '16.00', 'Manual', '3'),
(NULL, '2045JLN', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdiIG8YHyv_UBmKqSGjpzo01vfgD2fFc2oXg&usqp=CAU', 'Mercedes', 'Clase C', '140', '18.00', 'Automatica', '1');



INSERT INTO `user` (`id`, `admin`, `born_date`, `date_license_valid`, `name`, `nif`, `surname`) VALUES
(NULL, true, '1987-09-07 16:27:50', '2035-09-07 00:00:00', 'Ivan', '24673833R', 'Garcia');

INSERT INTO `booking` (`id`, `finish_date`, `price`, `start_date`, `user`, `vehicle`) VALUES (NULL, '2023-04-28 16:31:56', '30', '2023-04-30 16:31:56', '1', '1');