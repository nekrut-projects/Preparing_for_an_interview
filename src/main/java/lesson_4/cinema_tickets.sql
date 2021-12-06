
DROP TABLE IF EXISTS `tickets`;

CREATE TABLE `tickets` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `film_id` int unsigned NOT NULL,
  `show_date` date NOT NULL,
  `show_time_id` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_tickets_show_time_idx` (`show_time_id`),
  KEY `fk_tickets_film_idx` (`film_id`),
  CONSTRAINT `fk_tickets_film` FOREIGN KEY (`film_id`) REFERENCES `films` (`id`),
  CONSTRAINT `fk_tickets_show_time` FOREIGN KEY (`show_time_id`) REFERENCES `show_time` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

INSERT INTO `tickets` VALUES (1,1,'2021-11-11',1),(2,5,'2021-11-11',10),(3,4,'2021-11-11',5),(4,1,'2021-11-11',3),(5,1,'2021-11-11',3),(6,1,'2021-11-11',1),(7,1,'2021-11-11',1),(8,3,'2021-11-11',8),(9,3,'2021-11-11',8),(10,3,'2021-11-11',8);


