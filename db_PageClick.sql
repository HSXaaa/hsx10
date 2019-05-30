CREATE DATABASE db_PageClick;

USE `db_PageClick`;

DROP TABLE IF EXISTS `indexpage`;

CREATE TABLE `indexpage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `indexcount` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

insert  into `indexpage`(`id`,`indexcount`) values (1,1);

DROP TABLE IF EXISTS `websitepage`;

CREATE TABLE `websitepage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `websitecount` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

insert  into `websitepage`(`id`,`websitecount`) values (1,1);