/*
SQLyog Enterprise - MySQL GUI v7.14 
MySQL - 5.5.5-10.1.16-MariaDB : Database - db_jilbabfik
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_jilbabfik` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_jilbabfik`;

/*Table structure for table `tbl_barang` */

DROP TABLE IF EXISTS `tbl_barang`;

CREATE TABLE `tbl_barang` (
  `IdJilbab` int(5) NOT NULL AUTO_INCREMENT,
  `KodeJilbab` varchar(10) DEFAULT NULL,
  `MerkJilbab` varchar(35) DEFAULT NULL,
  `WarnaJilbab` varchar(35) DEFAULT NULL,
  `JenisKain` varchar(35) DEFAULT NULL,
  `HargaJilbab` int(15) DEFAULT NULL,
  `StokJilbab` int(15) DEFAULT NULL,
  PRIMARY KEY (`IdJilbab`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_barang` */

insert  into `tbl_barang`(`IdJilbab`,`KodeJilbab`,`MerkJilbab`,`WarnaJilbab`,`JenisKain`,`HargaJilbab`,`StokJilbab`) values (1,'DW05','rfd','hijau','sutra',30000,40),(2,'ANK01','raysaa','hijau','sutra',100000,80);

/*Table structure for table `tbl_login` */

DROP TABLE IF EXISTS `tbl_login`;

CREATE TABLE `tbl_login` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `usernama` varchar(35) DEFAULT NULL,
  `password` varchar(35) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_login` */

insert  into `tbl_login`(`id`,`usernama`,`password`) values (1,'fikri','fikri');

/*Table structure for table `tbl_pembeli` */

DROP TABLE IF EXISTS `tbl_pembeli`;

CREATE TABLE `tbl_pembeli` (
  `idPembeli` int(5) NOT NULL AUTO_INCREMENT,
  `KodePembeli` varchar(10) DEFAULT NULL,
  `NamaPembeli` varchar(25) DEFAULT NULL,
  `NomorTeleponPembeli` varchar(13) DEFAULT NULL,
  `AlamatPembeli` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idPembeli`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_pembeli` */

insert  into `tbl_pembeli`(`idPembeli`,`KodePembeli`,`NamaPembeli`,`NomorTeleponPembeli`,`AlamatPembeli`) values (1,'DW01','Fikri','082280452567','kotabumi'),(3,'DW01','Fikri','082280452567','kotabumi');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
