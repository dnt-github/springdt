INSERT INTO `springdt`.`link` (`id`, `last_modified_date`, `created_by`, `creation_date`, `last_modified_by`,
`title`, `url`)
VALUES(1, now(), 'Dong Truong',now(), null, 'Getting stared with spring boot 2','https://therealdanvega.com/spring-boot-2');

INSERT INTO `springdt`.`comment`(`id`,`last_modified_date`,`created_by`,`creation_date`,`last_modified_by`,
`body`,`link_id`)
VALUES (1, NOW(), 'Dong Truong',now(),'', 'What an awesome idea for a cource',1 );