-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: dbuser
-- ------------------------------------------------------
-- Server version	5.6.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `stu_m`
--

DROP TABLE IF EXISTS `stu_m`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stu_m` (
  `mane` varchar(25) NOT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `h` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`mane`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stu_m`
--

LOCK TABLES `stu_m` WRITE;
/*!40000 ALTER TABLE `stu_m` DISABLE KEYS */;
INSERT INTO `stu_m` VALUES ('丽多薇雅·萝莲洁蒂','女','罗马正教'),('五和','女','英国清教'),('亚雷斯塔','--','学园都市'),('前方之风','女','罗马正教'),('史提尔·马格努斯','男','英国清教'),('右方之火','男','罗马正教'),('后方之水','男','罗马正教'),('埃斯特尔·罗森塔尔','女','自由魔法师'),('姬神沙秋','女','学园都市'),('左方之地','男','罗马正教'),('建宫斋字','男','英国清教'),('欧提努斯','男','魔术结社'),('欧莉安娜·汤姆森','女','自由魔法师'),('海原光贵','男','学园都市'),('神裂火织','女','英国清教'),('茵蒂克丝','女','英国清教'),('莎夏·克洛伊洁芙','女','俄罗斯成教'),('萝拉·斯图亚特','女','英国清教'),('蕾莎','女','魔术结社'),('蕾薇妮雅·柏德蔚','女','魔术结社'),('雪梨·克伦威尔','女','俄罗斯成教');
/*!40000 ALTER TABLE `stu_m` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-25 17:19:22
