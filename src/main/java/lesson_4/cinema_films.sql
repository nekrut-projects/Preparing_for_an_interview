
DROP TABLE IF EXISTS `films`;
CREATE TABLE `films` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `duration` decimal(4,2) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

INSERT INTO `films` VALUES (1,'Фильм_1',1.00),(2,'Фильм_2',1.50),(3,'Фильм_3',2.00),(4,'Фильм_4',1.50),(5,'Фильм_5',2.00);

