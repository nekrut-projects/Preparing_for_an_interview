
DROP TABLE IF EXISTS `films_schedule`;

CREATE TABLE `films_schedule` (
  `current_date` date NOT NULL,
  `film_id` int unsigned NOT NULL,
  `show_time_id` int unsigned NOT NULL,
  `remaining_tickets` int NOT NULL,
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_film_schedule_film_idx` (`film_id`),
  KEY `fk_film_schedule_show_time_idx` (`show_time_id`),
  CONSTRAINT `fk_film_schedule_film` FOREIGN KEY (`film_id`) REFERENCES `films` (`id`),
  CONSTRAINT `fk_film_schedule_show_time` FOREIGN KEY (`show_time_id`) REFERENCES `show_time` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

INSERT INTO `films_schedule` VALUES ('2021-11-11',1,1,50,1),('2021-11-11',5,10,30,2),('2021-11-11',4,5,28,3),('2021-11-11',1,3,23,4),('2021-11-11',2,3,23,5),('2021-11-11',3,8,10,6),('2021-11-11',3,5,12,7),('2021-11-10',1,1,2,9);

