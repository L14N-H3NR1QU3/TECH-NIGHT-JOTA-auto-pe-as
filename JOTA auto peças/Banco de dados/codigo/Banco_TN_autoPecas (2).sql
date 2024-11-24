-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: jotaautopecas
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

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
-- Table structure for table `carros`
--

DROP TABLE IF EXISTS `carros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carros` (
  `id_carros` int(11) NOT NULL AUTO_INCREMENT,
  `placa_carro` varchar(7) DEFAULT NULL,
  `modelo_carro` varchar(40) DEFAULT NULL,
  `data_entrada_carro` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_carros`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carros`
--

LOCK TABLES `carros` WRITE;
/*!40000 ALTER TABLE `carros` DISABLE KEYS */;
/*!40000 ALTER TABLE `carros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome_cliente` varchar(50) DEFAULT NULL,
  `CPF_cliente` varchar(11) DEFAULT NULL,
  `email_cliente` varchar(50) DEFAULT NULL,
  `Telefone_cliente` varchar(11) DEFAULT NULL,
  `bairro_cliente` varchar(50) DEFAULT NULL,
  `rua_cliente` varchar(50) DEFAULT NULL,
  `ID_carro_Cliente` int(11) DEFAULT NULL,
  `placa_carro_cliente` varchar(7) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`),
  KEY `ID_carro_Cliente` (`ID_carro_Cliente`),
  CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`ID_carro_Cliente`) REFERENCES `carros` (`id_carros`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estoque`
--

DROP TABLE IF EXISTS `estoque`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estoque` (
  `id_estoque` int(11) NOT NULL AUTO_INCREMENT,
  `id_pecas_estoque` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_estoque`),
  KEY `id_pecas_estoque` (`id_pecas_estoque`),
  CONSTRAINT `estoque_ibfk_1` FOREIGN KEY (`id_pecas_estoque`) REFERENCES `pecas` (`id_pecas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estoque`
--

LOCK TABLES `estoque` WRITE;
/*!40000 ALTER TABLE `estoque` DISABLE KEYS */;
/*!40000 ALTER TABLE `estoque` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fornecedor`
--

DROP TABLE IF EXISTS `fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedor` (
  `id_fornecedor` int(11) NOT NULL AUTO_INCREMENT,
  `Nome_fornecedor` varchar(50) DEFAULT NULL,
  `Telefone_fornecedor` varchar(11) DEFAULT NULL,
  `Email_fornecedor` varchar(50) DEFAULT NULL,
  `cidade_fornecedor` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_fornecedor`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedor`
--

LOCK TABLES `fornecedor` WRITE;
/*!40000 ALTER TABLE `fornecedor` DISABLE KEYS */;
INSERT INTO `fornecedor` VALUES (1,'Pedro','0','Naopossui@gmail.com','Sim'),(2,'Pedro','123456789','Naopossui@gmail.com','Sim'),(3,'Pedro','3456700','Naopossui@gmail.com','Sim'),(4,'Pepsi','2278957831','naotem@gmail.com','Nao');
/*!40000 ALTER TABLE `fornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario` (
  `id_funcionario` int(11) NOT NULL AUTO_INCREMENT,
  `nome_funcionario` varchar(50) DEFAULT NULL,
  `CPF_Funcionario` varchar(11) DEFAULT NULL,
  `cidade_funcionario` varchar(50) DEFAULT NULL,
  `Bairro_funcionario` varchar(50) DEFAULT NULL,
  `email_funcionario` varchar(50) DEFAULT NULL,
  `senha_funcionario` int(15) DEFAULT NULL,
  `id_cliente_funcionario` int(11) DEFAULT NULL,
  `id_fornecedor_funcionario` int(11) DEFAULT NULL,
  `id_pecas_funcionario` int(11) DEFAULT NULL,
  `id_pedidos_funcionario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_funcionario`),
  KEY `id_cliente_funcionario` (`id_cliente_funcionario`),
  KEY `id_fornecedor_funcionario` (`id_fornecedor_funcionario`),
  KEY `id_pecas_funcionario` (`id_pecas_funcionario`),
  KEY `id_pedidos_funcionario` (`id_pedidos_funcionario`),
  CONSTRAINT `funcionario_ibfk_1` FOREIGN KEY (`id_cliente_funcionario`) REFERENCES `cliente` (`id_cliente`),
  CONSTRAINT `funcionario_ibfk_2` FOREIGN KEY (`id_fornecedor_funcionario`) REFERENCES `fornecedor` (`id_fornecedor`),
  CONSTRAINT `funcionario_ibfk_3` FOREIGN KEY (`id_pecas_funcionario`) REFERENCES `pecas` (`id_pecas`),
  CONSTRAINT `funcionario_ibfk_4` FOREIGN KEY (`id_pedidos_funcionario`) REFERENCES `pedidos` (`id_pedidos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pecas`
--

DROP TABLE IF EXISTS `pecas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pecas` (
  `id_pecas` int(11) NOT NULL AUTO_INCREMENT,
  `nome_pecas` varchar(50) DEFAULT NULL,
  `tipo_pecas` varchar(50) DEFAULT NULL,
  `qtd_pecas` int(4) DEFAULT NULL,
  `preco_peca` double(6,2) DEFAULT NULL,
  PRIMARY KEY (`id_pecas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pecas`
--

LOCK TABLES `pecas` WRITE;
/*!40000 ALTER TABLE `pecas` DISABLE KEYS */;
/*!40000 ALTER TABLE `pecas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos` (
  `nome_cliente` varchar(50) DEFAULT NULL,
  `email_cliente` varchar(50) DEFAULT NULL,
  `Telefone_cliente` varchar(11) DEFAULT NULL,
  `Local_estab` varchar(50) DEFAULT NULL,
  `ID_cliente_pedidos` int(11) DEFAULT NULL,
  `id_pedidos` int(11) NOT NULL AUTO_INCREMENT,
  `descricao_pedidos` varchar(300) DEFAULT NULL,
  `precoT` double(8,2) DEFAULT NULL,
  `data_entrega` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_pedidos`),
  KEY `ID_cliente_pedidos` (`ID_cliente_pedidos`),
  CONSTRAINT `pedidos_ibfk_1` FOREIGN KEY (`ID_cliente_pedidos`) REFERENCES `cliente` (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pesquisa`
--

DROP TABLE IF EXISTS `pesquisa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pesquisa` (
  `id_pesquisa` int(11) NOT NULL AUTO_INCREMENT,
  `id_pesquisa_cliente` int(11) DEFAULT NULL,
  `id_pesquisa_fornecedor` int(11) DEFAULT NULL,
  `id_pesquisa_funcionario` int(11) DEFAULT NULL,
  `id_pesquisa_pecas` int(11) DEFAULT NULL,
  `id_pesquisa_pedidos` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_pesquisa`),
  KEY `id_pesquisa_cliente` (`id_pesquisa_cliente`),
  KEY `id_pesquisa_fornecedor` (`id_pesquisa_fornecedor`),
  KEY `id_pesquisa_funcionario` (`id_pesquisa_funcionario`),
  KEY `id_pesquisa_pecas` (`id_pesquisa_pecas`),
  KEY `id_pesquisa_pedidos` (`id_pesquisa_pedidos`),
  CONSTRAINT `pesquisa_ibfk_1` FOREIGN KEY (`id_pesquisa_cliente`) REFERENCES `cliente` (`id_cliente`),
  CONSTRAINT `pesquisa_ibfk_2` FOREIGN KEY (`id_pesquisa_fornecedor`) REFERENCES `fornecedor` (`id_fornecedor`),
  CONSTRAINT `pesquisa_ibfk_3` FOREIGN KEY (`id_pesquisa_funcionario`) REFERENCES `funcionario` (`id_funcionario`),
  CONSTRAINT `pesquisa_ibfk_4` FOREIGN KEY (`id_pesquisa_pecas`) REFERENCES `pecas` (`id_pecas`),
  CONSTRAINT `pesquisa_ibfk_5` FOREIGN KEY (`id_pesquisa_pedidos`) REFERENCES `pedidos` (`id_pedidos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pesquisa`
--

LOCK TABLES `pesquisa` WRITE;
/*!40000 ALTER TABLE `pesquisa` DISABLE KEYS */;
/*!40000 ALTER TABLE `pesquisa` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-24 16:41:26
