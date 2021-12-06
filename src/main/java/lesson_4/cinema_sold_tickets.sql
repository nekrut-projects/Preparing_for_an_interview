
DROP TABLE IF EXISTS `sold_tickets`;

CREATE TABLE `sold_tickets` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `ticket_id` int unsigned NOT NULL,
  `price` decimal(8,2) NOT NULL,
  `sold_date` date NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_sold_tickets_ticket_idx` (`ticket_id`),
  CONSTRAINT `fk_sold_tickets_ticket` FOREIGN KEY (`ticket_id`) REFERENCES `tickets` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

INSERT INTO `sold_tickets` VALUES (1,1,300.00,'2021-11-10'),(2,9,300.00,'2021-11-10'),(3,4,300.00,'2021-11-11'),(4,2,550.00,'2021-11-11'),(5,10,550.00,'2021-11-11'),(6,3,300.00,'2021-11-11'),(7,5,300.00,'2021-11-11'),(8,6,300.00,'2021-11-11'),(9,7,300.00,'2021-11-11'),(10,8,450.00,'2021-11-11');


