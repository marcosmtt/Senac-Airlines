-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 07-Dez-2017 às 10:31
-- Versão do servidor: 10.1.26-MariaDB
-- PHP Version: 7.1.9

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `senacairlines`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `avioes`
--

CREATE TABLE `avioes` (
  `id` int(11) NOT NULL,
  `capacidade` int(11) DEFAULT NULL,
  `empresa` varchar(255) DEFAULT NULL,
  `modelo` varchar(255) DEFAULT NULL,
  `velocidade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `avioes`
--

INSERT INTO `avioes` (`id`, `capacidade`, `empresa`, `modelo`, `velocidade`) VALUES
(71, 120, 'AZUL', 'ATR 42-500', 8500),
(73, 120, 'AZUL', 'ATR 42-500', 15000),
(74, 120, 'AZUL', 'ATR 42-500', 30000),
(75, 120, 'AZUL', 'ATR 42-500', 40000),
(76, 120, 'AZUL', 'ATR 42-500', 50000);

-- --------------------------------------------------------

--
-- Estrutura da tabela `bagagens`
--

CREATE TABLE `bagagens` (
  `id` int(11) NOT NULL,
  `clienteId` int(11) NOT NULL,
  `foiEncaminhada` tinyint(1) NOT NULL,
  `vooId` int(11) NOT NULL,
  `peso` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `bagagens`
--

INSERT INTO `bagagens` (`id`, `clienteId`, `foiEncaminhada`, `vooId`, `peso`) VALUES
(1, 1, 0, 1, 5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `bagagenslist`
--

CREATE TABLE `bagagenslist` (
  `id` int(11) NOT NULL,
  `vooId` int(11) NOT NULL,
  `bagagemId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `bagagenslist`
--

INSERT INTO `bagagenslist` (`id`, `vooId`, `bagagemId`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `rg` varchar(15) NOT NULL,
  `passageiro` varchar(20) NOT NULL DEFAULT 'não',
  `passaporte` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`id`, `nome`, `rg`, `passageiro`, `passaporte`) VALUES
(104, 'Cliente1', '12124124123', 'sim', 'DF847J2L'),
(106, 'Cliente2', '12124124123', 'sim', 'AIE41UFI'),
(108, 'Cliente3', '12124124123', 'sim', 'ASD00591'),
(109, 'Cliente4', '12124124123', 'sim', '124124124');

-- --------------------------------------------------------

--
-- Estrutura da tabela `destino`
--

CREATE TABLE `destino` (
  `id` bigint(20) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `distancia` double DEFAULT NULL,
  `pais` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `destino`
--

INSERT INTO `destino` (`id`, `nome`, `distancia`, `pais`, `cidade`) VALUES
(1, 'Aeroporto Porto Alegre', 254, 'Brasil', 'Porto Alegre'),
(2, 'Aeroporto de Guarulhos', 1300, 'Brasil', 'São Paulo');

-- --------------------------------------------------------

--
-- Estrutura da tabela `passageiroslist`
--

CREATE TABLE `passageiroslist` (
  `id` int(11) NOT NULL,
  `clienteId` int(11) NOT NULL,
  `vooId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `passageiroslist`
--

INSERT INTO `passageiroslist` (`id`, `clienteId`, `vooId`) VALUES
(1216, 104, 33),
(1217, 104, 33),
(1218, 104, 33),
(1219, 106, 34),
(1220, 109, 34),
(1221, 109, 34),
(1222, 109, 34),
(1223, 109, 34),
(1224, 108, 34),
(1225, 108, 34),
(1226, 108, 34),
(1227, 106, 35),
(1228, 106, 35),
(1229, 106, 35),
(1230, 109, 35),
(1231, 109, 35),
(1232, 109, 35),
(1233, 106, 35),
(1234, 109, 35),
(1235, 109, 35),
(1236, 109, 35),
(1237, 109, 35),
(1238, 108, 35),
(1239, 108, 35),
(1240, 108, 35),
(1241, 106, 36),
(1242, 106, 36),
(1243, 106, 36),
(1244, 106, 36),
(1245, 106, 36),
(1262, 109, 32),
(1263, 109, 32),
(1264, 109, 32),
(1265, 109, 32),
(1266, 109, 32),
(1267, 109, 32),
(1268, 104, 31),
(1269, 104, 31),
(1270, 104, 31),
(1271, 104, 31),
(1272, 104, 31);

-- --------------------------------------------------------

--
-- Estrutura da tabela `voos`
--

CREATE TABLE `voos` (
  `id` int(11) NOT NULL,
  `aeroportoDestinoID` int(11) NOT NULL,
  `horaDecolagem` varchar(50) NOT NULL,
  `aviaoID` int(11) NOT NULL,
  `status` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `voos`
--

INSERT INTO `voos` (`id`, `aeroportoDestinoID`, `horaDecolagem`, `aviaoID`, `status`) VALUES
(31, 1, '05:55', 71, 'decolou'),
(32, 1, '05:55', 73, 'decolou'),
(33, 1, '05:55', 74, 'decolou'),
(34, 1, '05:55', 75, 'decolou'),
(36, 1, '05:55', 76, 'decolou');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `avioes`
--
ALTER TABLE `avioes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bagagens`
--
ALTER TABLE `bagagens`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bagagenslist`
--
ALTER TABLE `bagagenslist`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `destino`
--
ALTER TABLE `destino`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `passageiroslist`
--
ALTER TABLE `passageiroslist`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `voos`
--
ALTER TABLE `voos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `avioes`
--
ALTER TABLE `avioes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=77;

--
-- AUTO_INCREMENT for table `bagagens`
--
ALTER TABLE `bagagens`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `bagagenslist`
--
ALTER TABLE `bagagenslist`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=116;

--
-- AUTO_INCREMENT for table `destino`
--
ALTER TABLE `destino`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `passageiroslist`
--
ALTER TABLE `passageiroslist`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1273;

--
-- AUTO_INCREMENT for table `voos`
--
ALTER TABLE `voos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
