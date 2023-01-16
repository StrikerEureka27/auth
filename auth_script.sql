/*
 By: StrikerEureka27
*/

SELECT UUID();


USE auth;
DROP TABLE `user`;
DROP TABLE `role`;
DROP TABLE krn_session;
DROP TABLE adm_session;

CREATE TABLE `adm_role` (
	`id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(150),
	`code` VARCHAR(10),
	PRIMARY KEY (`id`) 
);


CREATE TABLE `adm_user` (
	`id` INT UNSIGNED NOT NULL AUTO_INCREMENT, 
	`username` VARCHAR(150) NOT NULL UNIQUE,
	`name` VARCHAR(150),
	`last_name` VARCHAR(150),
	`password` VARCHAR(500) NOT NULL,
	`role` INT UNSIGNED NOT NULL, 
	`status` TINYINT DEFAULT 0, 
	`number` VARCHAR(8),
	`mail` VARCHAR(150), 
	`guid` VARCHAR(150) DEFAULT (UUID()),
	`creation_date` DATETIME DEFAULT CURRENT_TIMESTAMP(), 
	PRIMARY KEY (`id`), 
	FOREIGN KEY (`role`) REFERENCES `adm_role` (`id`)
);

ALTER TABLE adm_user MODIFY `password` VARCHAR(500); 
ALTER TABLE adm_user MODIFY `role` INT UNSIGNED; 

CREATE TABLE adm_session (
	`id` INT UNSIGNED NOT NULL AUTO_INCREMENT, 
	`secret_key` VARCHAR(200),
	PRIMARY KEY (`id`)
);


CREATE TABLE `krn_session` (
	`id` INT UNSIGNED NOT NULL AUTO_INCREMENT, 
	`user` INT UNSIGNED NOT NULL,
	`session` INT UNSIGNED, 
	`status` TINYINT DEFAULT 1, 
	`start_time` DATETIME DEFAULT CURRENT_TIMESTAMP(), 
	`end_time` DATETIME, 
	PRIMARY KEY (`id`),
	FOREIGN KEY (`user`) REFERENCES `adm_user` (`id`),
	FOREIGN KEY (`session`) REFERENCES `adm_session` (`id`)
);

CREATE TABLE `aud_type` (
	`id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(250), 
	`code` VARCHAR(10),
	PRIMARY KEY (`id`)
);


CREATE TABLE `aud_user` (
	`id` INT NOT NULL AUTO_INCREMENT, 
	`type` INT UNSIGNED, 
	`creation_time` DATETIME DEFAULT CURRENT_TIMESTAMP(),
	`observation` VARCHAR(200),
	PRIMARY KEY (`id`),
	FOREIGN KEY (`type`) REFERENCES `aud_type` (`id`)		
);












