
DROP TABLE IF EXISTS `prices_tickets`;

CREATE TABLE `prices_tickets` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `day_type_id` int unsigned NOT NULL,
  `price_id` int unsigned NOT NULL,
  `show_time_id` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_prices_tickets_price_idx` (`price_id`),
  KEY `fk_prices_tickets_time_idx` (`show_time_id`),
  KEY `fk_prices_tickets_date_type_idx` (`day_type_id`),
  CONSTRAINT `fk_prices_tickets_date_type` FOREIGN KEY (`day_type_id`) REFERENCES `days_types` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_prices_tickets_price` FOREIGN KEY (`price_id`) REFERENCES `prices` (`id`),
  CONSTRAINT `fk_prices_tickets_time` FOREIGN KEY (`show_time_id`) REFERENCES `show_time` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

INSERT INTO `prices_tickets` VALUES (1,1,1,1),(3,1,4,10),(4,1,2,5);


