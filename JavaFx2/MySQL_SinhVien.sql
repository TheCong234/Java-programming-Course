CREATE DATABASE  IF NOT EXISTS `qlsv`;
USE `qlsv`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: qlsv
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `lop`
--

DROP TABLE IF EXISTS `lop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lop` (
  `MaLop` int NOT NULL AUTO_INCREMENT,
  `TenLop` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`MaLop`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lop`
--

LOCK TABLES `lop` WRITE;
/*!40000 ALTER TABLE `lop` DISABLE KEYS */;
INSERT INTO `lop` VALUES (1,'DH13TH01'),(2,'HC14TH01'),(3,'DH14TH01');
/*!40000 ALTER TABLE `lop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sinhvien`
--

DROP TABLE IF EXISTS `sinhvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sinhvien` (
  `MSSV` varchar(15) NOT NULL,
  `Ho` varchar(30) DEFAULT NULL,
  `Ten` varchar(10) DEFAULT NULL,
  `NgaySinh` varchar(10) DEFAULT NULL,
  `GioiTinh` tinyint(1) DEFAULT '0',
  `MaLop` int DEFAULT NULL,
  PRIMARY KEY (`MSSV`),
  KEY `MaLop` (`MaLop`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinhvien`
--

LOCK TABLES `sinhvien` WRITE;
/*!40000 ALTER TABLE `sinhvien` DISABLE KEYS */;
INSERT INTO `sinhvien` VALUES ('0851010090','Ngô Văn','Hiểu','01/07/1990',1,2),('0851010145','Phùng Viết','Linh','01/08/1990',1,1),('1051010119','Phạm Tấn','Phong','01/04/1992',1,2),('1051010147','Phạm Thanh','Tâm','11/02/1992',1,2),('1151010039','Nguyễn Hoàng Khánh','Huy','30/10/1993',1,1),('1151010110','Nguyễn Ngũ Nhật','Thịnh','16/12/1993',1,2),('1151010145','Phan','Xuân','12/01/1993',1,1),('121C652039','Trần Nguyễn Phương','Khánh','14/05/1994',0,1),('1251010004','Huỳnh Ngô Duy','Anh','07/03/1994',1,1),('1351010014','Nguyễn Phạm Kim','Chi','18/05/1995',0,2),('1451010157','Lê','Quỳnh','06/09/1995',1,3),('1451010161','Lê Nguyễn Huỳnh','Sơn','30/10/1996',1,3),('1451010194','Nguyễn Hữu','Tình','28/09/1995',1,3),('1451010213','Đặng Thanh','Văn','18/12/1996',1,3),('1451010214','Phan Thị Tường','Vi','15/04/1996',0,3);
/*!40000 ALTER TABLE `sinhvien` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-20  8:46:02
