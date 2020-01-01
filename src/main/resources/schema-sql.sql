
DROP TABLE IF EXISTS `springdt`.`comment`;
CREATE TABLE `comment` (
  `id` bigint(20) NOT NULL,
  `last_modified_date` time DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `creation_date` time DEFAULT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `body` varchar(255) DEFAULT NULL,
  `link_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


DROP TABLE IF EXISTS `springdt`.`link`;

CREATE TABLE `link` (
  `id` bigint(20) NOT NULL,
  `last_modified_date` time DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `creation_date` time DEFAULT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
