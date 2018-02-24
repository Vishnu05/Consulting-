-- MySQL dump 10.13  Distrib 5.7.20, for Win32 (AMD64)
--
-- Host: localhost    Database: document
-- ------------------------------------------------------
-- Server version	5.7.20-log

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
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `client` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `companyname` varchar(50) DEFAULT NULL,
  `directorname` varchar(50) DEFAULT NULL,
  `directorspancard` varchar(50) DEFAULT NULL,
  `companypancard` varchar(50) DEFAULT NULL,
  `directoraadharno` varchar(50) DEFAULT NULL,
  `companygstnumber` varchar(50) DEFAULT NULL,
  `contactpersonname` varchar(50) DEFAULT NULL,
  `contactpersonmobile` varchar(50) DEFAULT NULL,
  `contactpersonemail` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (3,'Shiva','jhdsjkwsd','asdasd','asdasd','asdasd','sadsad','sadasd','asdasd','123'),(4,'ertretre','ertewrtert','reterterterwt','ewetertwrtrwt','retrteterte','tertertretert','erterterter','tertertertert','eterterter'),(5,'weewfew','fwefwefwef','ewfewf','fwefwefw','fwefwe','wefewfwe','fewfewfewfw','efwfw','wefwefw'),(6,'egegg','egegerg','gegrg','gregg','gg','egegeg','regregr','gerge','gegrg');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `aadharNo` varchar(45) DEFAULT NULL,
  `panNo` varchar(45) DEFAULT NULL,
  `photo` blob,
  `mobileNo` varchar(45) DEFAULT NULL,
  `otherContactNo` varchar(45) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `Address` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (6,'Lakshminarasimhan','Krishnamurthy','sdasdsd','sadsadasdas',NULL,'+971562759208','asdsads','2017-12-07','klnarasimhan13@gmail.com',NULL),(7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2017-12-09',NULL,NULL),(8,'sfbsffv','vdvsvdssvs','herhrh','gfghhh',NULL,'hehehreh','ehrherh','2017-12-10','vsdvsdvsvsv@gmail.com',NULL);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `services`
--

DROP TABLE IF EXISTS `services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `services` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `serviceName` varchar(100) DEFAULT NULL,
  `serviceCategory` varchar(100) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `serviceDescription` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `services`
--

LOCK TABLES `services` WRITE;
/*!40000 ALTER TABLE `services` DISABLE KEYS */;
INSERT INTO `services` VALUES (1,' cx xc cx ','B',NULL,NULL),(2,' zx x zx xz','B',NULL,NULL),(3,'rtwett','A',NULL,NULL),(4,'ewfewfwf','',NULL,'ewfewfew'),(5,'dsfdfdffda','',NULL,'afafasfasf'),(6,'fdfbfb','',NULL,'dfbdfbdf');
/*!40000 ALTER TABLE `services` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicescategory`
--

DROP TABLE IF EXISTS `servicescategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servicescategory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `servicecategoryname` varchar(100) DEFAULT NULL,
  `servicecategorydescription` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicescategory`
--

LOCK TABLES `servicescategory` WRITE;
/*!40000 ALTER TABLE `servicescategory` DISABLE KEYS */;
INSERT INTO `servicescategory` VALUES (1,'',''),(4,'jbjnjk','jbjlj'),(5,'dsfsff','dsfdsfds'),(6,'dfggd','dgfdgd');
/*!40000 ALTER TABLE `servicescategory` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-11 16:47:40
