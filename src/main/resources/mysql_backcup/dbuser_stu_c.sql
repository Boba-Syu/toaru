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
-- Table structure for table `stu_c`
--

DROP TABLE IF EXISTS `stu_c`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stu_c` (
  `Cname` varchar(90) NOT NULL,
  `Csex` varchar(90) DEFAULT NULL,
  `Cschool` varchar(90) DEFAULT NULL,
  `Clevel` varchar(90) DEFAULT NULL,
  `Cpower` varchar(90) DEFAULT NULL,
  `Cgrade` varchar(90) DEFAULT NULL,
  PRIMARY KEY (`Cname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stu_c`
--

LOCK TABLES `stu_c` WRITE;
/*!40000 ALTER TABLE `stu_c` DISABLE KEYS */;
INSERT INTO `stu_c` VALUES ('一方通行','未知','LV5','长点上机学园','矢量操纵','高一'),('上条当麻','男','LV0','第七学区某高中','幻想杀手','高二'),('佐天泪子','女','LV0','栅川中学','空力使','初一'),('初春饰利','女','LV1','栅川中学','恒温保存','初一'),('削板军霸','男','LV5','--','念动炮弹','--'),('土御门元春','男','LV0','第七学区某高中','肉体再生','高二'),('垣根帝督','男','LV5','--','未元物质','--'),('婚后光子','女','LV4','常盘台中学','空力使','初一'),('御坂妹妹','女','LV2','--','缺陷电气','--'),('御坂美琴','女','LV5','常盘台中学','超电磁炮','初二'),('最后之作','女','LV3','--','缺陷电气','--'),('泡浮万彬','女','LV3','常盘台中学','流体反发','初一'),('泷壶理后','女','LV4','--','能力追踪','--'),('湾内绢保','女','LV3','常盘台中学','水流操作','初一'),('番外个体','女','LV4','--','发电能力','--'),('白井黑子','女','LV4','常盘台中学','空间移动','初一'),('结标淡希','女','LV4','--','坐标移动','--'),('绢旗最爱','女','LV4','--','氮气装甲','--'),('茵蒂克丝','女','LV0','--','禁书目录','--'),('铃科百合子','女','LV5','长点上机学园','矢量操纵','高一'),('食蜂操祈','女','LV5','常盘台中学','心理掌握','初二'),('麦野沈利','女','LV5','--','原子崩坏','--');
/*!40000 ALTER TABLE `stu_c` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-25 17:19:21
