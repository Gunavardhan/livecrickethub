-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 19, 2018 at 07:39 AM
-- Server version: 10.1.24-MariaDB
-- PHP Version: 7.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `livecricket`
--

-- --------------------------------------------------------

--
-- Table structure for table `reg_player`
--

CREATE TABLE `reg_player` (
  `palyerId` varchar(40) NOT NULL,
  `playerName` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `mobile` varchar(40) NOT NULL,
  `matches` varchar(40) NOT NULL,
  `centuries` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reg_player`
--

INSERT INTO `reg_player` (`palyerId`, `playerName`, `email`, `mobile`, `matches`, `centuries`) VALUES
('MSD@123', 'Mahi', 'dhoni@gmail.com', '9492205320', '320', '11'),
('Pujara@123', 'Pujara', 'pujara@gmail.com', '7858855533', '48', '14'),
('Virat123', 'Virat', 'virat@gmail.com', '9949026410', '230', '35');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `reg_player`
--
ALTER TABLE `reg_player`
  ADD PRIMARY KEY (`email`),
  ADD UNIQUE KEY `mobile` (`mobile`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
