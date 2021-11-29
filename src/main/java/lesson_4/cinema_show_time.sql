
DROP TABLE IF EXISTS `show_time`;

CREATE TABLE `show_time` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `time` decimal(4,2) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

INSERT INTO `show_time` VALUES (1,9.00),(2,10.00),(3,11.00),(4,12.00),(5,13.00),(6,14.00),(7,15.00),(8,16.00),(9,17.00),(10,18.00),(11,19.00),(12,20.00),(13,21.00),(14,22.00),(15,23.00),(16,24.00);


