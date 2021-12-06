
DROP TABLE IF EXISTS `prices`;

CREATE TABLE `prices` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `price` decimal(8,2) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

INSERT INTO `prices` VALUES (1,300.00),(2,350.00),(3,450.00),(4,550.00);


