
DROP TABLE IF EXISTS `days_types`;
CREATE TABLE `days_types` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `type` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

INSERT INTO `days_types` VALUES (1,'Будний день'),(2,'Праздничный день'),(3,'Выходной день');

