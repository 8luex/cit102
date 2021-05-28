-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 28, 2021 at 04:50 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bluezocurry`
--

-- --------------------------------------------------------

--
-- Table structure for table `bluedetail`
--

CREATE TABLE `bluedetail` (
  `orderid` varchar(8) NOT NULL,
  `foodid` varchar(5) NOT NULL,
  `unit` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bluedetail`
--

INSERT INTO `bluedetail` (`orderid`, `foodid`, `unit`) VALUES
('97XUD3SK', 'F02', 1),
('97XUD3SK', 'F03', 1),
('97XUD3SK', 'F04', 1),
('97XUD3SK', 'F05', 1),
('97XUD3SK', 'F06', 1),
('97XUD3SK', 'F07', 1),
('97XUD3SK', 'F08', 1),
('FSQASX92', 'F01', 1),
('FSQASX92', 'F02', 2),
('FSQASX92', 'F05', 2),
('FSQASX92', 'F08', 2),
('V5FS989A', 'F01', 0),
('V5FS989A', 'F02', 0),
('V5FS989A', 'F03', 1),
('V5FS989A', 'F04', 0),
('V5FS989A', 'F05', 0),
('V5FS989A', 'F06', 1),
('V5FS989A', 'F07', 0),
('V5FS989A', 'F08', 0),
('LOGRI4R0', 'F01', 0),
('LOGRI4R0', 'F02', 1),
('LOGRI4R0', 'F03', 0),
('LOGRI4R0', 'F04', 0),
('LOGRI4R0', 'F05', 1),
('LOGRI4R0', 'F06', 0),
('LOGRI4R0', 'F07', 1),
('LOGRI4R0', 'F08', 0),
('0YDYAX3A', 'F01', 0),
('0YDYAX3A', 'F02', 1),
('0YDYAX3A', 'F03', 0),
('0YDYAX3A', 'F04', 1),
('0YDYAX3A', 'F05', 1),
('0YDYAX3A', 'F06', 0),
('0YDYAX3A', 'F07', 0),
('0YDYAX3A', 'F08', 0),
('78U62S0E', 'F01', 1),
('78U62S0E', 'F02', 0),
('78U62S0E', 'F03', 0),
('78U62S0E', 'F04', 0),
('78U62S0E', 'F05', 0),
('78U62S0E', 'F06', 1),
('78U62S0E', 'F07', 0),
('78U62S0E', 'F08', 1),
('Z3NO4E2Y', 'F01', 0),
('Z3NO4E2Y', 'F02', 1),
('Z3NO4E2Y', 'F03', 0),
('Z3NO4E2Y', 'F04', 0),
('Z3NO4E2Y', 'F05', 1),
('Z3NO4E2Y', 'F06', 1),
('Z3NO4E2Y', 'F07', 0),
('Z3NO4E2Y', 'F08', 0),
('ZG8JC6M9', 'F01', 0),
('ZG8JC6M9', 'F02', 1),
('ZG8JC6M9', 'F03', 0),
('ZG8JC6M9', 'F04', 0),
('ZG8JC6M9', 'F05', 0),
('ZG8JC6M9', 'F06', 1),
('ZG8JC6M9', 'F07', 1),
('ZG8JC6M9', 'F08', 0),
('2FPM0QJ9', 'F01', 0),
('2FPM0QJ9', 'F02', 1),
('2FPM0QJ9', 'F04', 1),
('2FPM0QJ9', 'F05', 0),
('2FPM0QJ9', 'F06', 0),
('2FPM0QJ9', 'F07', 0),
('2FPM0QJ9', 'F08', 0),
('MKHXQXEG', 'F01', 2),
('MKHXQXEG', 'F03', 0),
('MKHXQXEG', 'F04', 2),
('MKHXQXEG', 'F05', 0),
('MKHXQXEG', 'F06', 0),
('MKHXQXEG', 'F07', 0),
('MKHXQXEG', 'F08', 0),
('BGWX9IZ8', 'F01', 0),
('BGWX9IZ8', 'F02', 0),
('BGWX9IZ8', 'F03', 1),
('BGWX9IZ8', 'F04', 2),
('BGWX9IZ8', 'F05', 0),
('BGWX9IZ8', 'F06', 0),
('BGWX9IZ8', 'F07', 0),
('BGWX9IZ8', 'F08', 2),
('0GMDUSSU', 'F01', 0),
('0GMDUSSU', 'F02', 1),
('0GMDUSSU', 'F03', 1),
('0GMDUSSU', 'F04', 1),
('0GMDUSSU', 'F05', 1),
('0GMDUSSU', 'F06', 0),
('0GMDUSSU', 'F07', 0),
('0GMDUSSU', 'F08', 1),
('YJUSVN5W', 'F01', 2),
('YJUSVN5W', 'F02', 0),
('YJUSVN5W', 'F03', 0),
('YJUSVN5W', 'F04', 0),
('YJUSVN5W', 'F05', 0),
('YJUSVN5W', 'F06', 2),
('YJUSVN5W', 'F07', 0),
('YJUSVN5W', 'F08', 2),
('UPJH4X36', 'F01', 0),
('UPJH4X36', 'F02', 1),
('UPJH4X36', 'F03', 1),
('UPJH4X36', 'F04', 2),
('UPJH4X36', 'F05', 1),
('UPJH4X36', 'F06', 0),
('UPJH4X36', 'F07', 2),
('UPJH4X36', 'F08', 2),
('U7HTJZZY', 'F01', 1),
('U7HTJZZY', 'F02', 0),
('U7HTJZZY', 'F03', 0),
('U7HTJZZY', 'F04', 1),
('U7HTJZZY', 'F05', 0),
('U7HTJZZY', 'F06', 0),
('U7HTJZZY', 'F07', 0),
('U7HTJZZY', 'F08', 0),
('A4RQ21U1', 'F01', 0),
('A4RQ21U1', 'F02', 0),
('A4RQ21U1', 'F03', 1),
('A4RQ21U1', 'F04', 0),
('A4RQ21U1', 'F05', 1),
('A4RQ21U1', 'F06', 1),
('A4RQ21U1', 'F07', 0),
('A4RQ21U1', 'F08', 0),
('5CSJSXIO', 'F01', 2),
('5CSJSXIO', 'F02', 2),
('5CSJSXIO', 'F03', 2),
('5CSJSXIO', 'F04', 4),
('5CSJSXIO', 'F05', 0),
('5CSJSXIO', 'F06', 0),
('5CSJSXIO', 'F07', 0),
('5CSJSXIO', 'F08', 0),
('OAIEHSZZ', 'F01', 0),
('OAIEHSZZ', 'F02', 0),
('OAIEHSZZ', 'F03', 1),
('OAIEHSZZ', 'F04', 0),
('OAIEHSZZ', 'F05', 1),
('OAIEHSZZ', 'F06', 1),
('OAIEHSZZ', 'F07', 0),
('OAIEHSZZ', 'F08', 0),
('V8OQKIBT', 'F01', 0),
('V8OQKIBT', 'F02', 1),
('V8OQKIBT', 'F03', 2),
('V8OQKIBT', 'F04', 1),
('V8OQKIBT', 'F05', 2),
('V8OQKIBT', 'F06', 0),
('V8OQKIBT', 'F07', 0),
('V8OQKIBT', 'F08', 0),
('D36J1OAH', 'F01', 0),
('D36J1OAH', 'F02', 2),
('D36J1OAH', 'F03', 1),
('D36J1OAH', 'F04', 3),
('D36J1OAH', 'F05', 0),
('D36J1OAH', 'F06', 0),
('D36J1OAH', 'F07', 1),
('D36J1OAH', 'F08', 3),
('4S97AORM', 'F01', 0),
('4S97AORM', 'F02', 3),
('4S97AORM', 'F03', 0),
('4S97AORM', 'F04', 1),
('4S97AORM', 'F05', 1),
('4S97AORM', 'F06', 0),
('4S97AORM', 'F07', 0),
('4S97AORM', 'F08', 0),
('O0ON86GV', 'F01', 4),
('O0ON86GV', 'F02', 4),
('O0ON86GV', 'F03', 3),
('O0ON86GV', 'F04', 3),
('O0ON86GV', 'F05', 3),
('O0ON86GV', 'F06', 0),
('O0ON86GV', 'F07', 3),
('O0ON86GV', 'F08', 0),
('NN08BM6W', 'F01', 1),
('NN08BM6W', 'F02', 3),
('NN08BM6W', 'F03', 0),
('NN08BM6W', 'F04', 3),
('NN08BM6W', 'F05', 2),
('NN08BM6W', 'F06', 2),
('NN08BM6W', 'F07', 1),
('NN08BM6W', 'F08', 1),
('5M8SQGW9', 'F01', 0),
('5M8SQGW9', 'F02', 0),
('5M8SQGW9', 'F03', 1),
('5M8SQGW9', 'F04', 3),
('5M8SQGW9', 'F05', 3),
('5M8SQGW9', 'F06', 0),
('5M8SQGW9', 'F07', 0),
('5M8SQGW9', 'F08', 0),
('M3KQPJYA', 'F01', 0),
('M3KQPJYA', 'F02', 1),
('M3KQPJYA', 'F03', 0),
('M3KQPJYA', 'F04', 1),
('M3KQPJYA', 'F05', 0),
('M3KQPJYA', 'F06', 0),
('M3KQPJYA', 'F07', 0),
('M3KQPJYA', 'F08', 0),
('N2DUVMST', 'F01', 1),
('N2DUVMST', 'F02', 2),
('N2DUVMST', 'F03', 2),
('N2DUVMST', 'F04', 0),
('N2DUVMST', 'F05', 1),
('N2DUVMST', 'F06', 0),
('N2DUVMST', 'F07', 0),
('N2DUVMST', 'F08', 0),
('0H6YDLDR', 'F01', 0),
('0H6YDLDR', 'F02', 0),
('0H6YDLDR', 'F03', 0),
('0H6YDLDR', 'F04', 1),
('0H6YDLDR', 'F06', 2),
('0H6YDLDR', 'F07', 0),
('0H6YDLDR', 'F08', 0),
('PRG3UW2B', 'F01', 0),
('PRG3UW2B', 'F02', 1),
('PRG3UW2B', 'F03', 1),
('PRG3UW2B', 'F04', 2),
('PRG3UW2B', 'F05', 0),
('PRG3UW2B', 'F06', 0),
('PRG3UW2B', 'F07', 2),
('PRG3UW2B', 'F08', 0),
('GGFRSTYC', 'F01', 0),
('GGFRSTYC', 'F02', 1),
('GGFRSTYC', 'F03', 1),
('GGFRSTYC', 'F04', 1),
('GGFRSTYC', 'F05', 0),
('GGFRSTYC', 'F06', 1),
('GGFRSTYC', 'F07', 0),
('GGFRSTYC', 'F08', 3),
('RUE6L4C7', 'F01', 2),
('RUE6L4C7', 'F02', 2),
('RUE6L4C7', 'F03', 1),
('RUE6L4C7', 'F04', 0),
('RUE6L4C7', 'F06', 0),
('RUE6L4C7', 'F07', 2),
('RUE6L4C7', 'F08', 0),
('VE9607RQ', 'F01', 0),
('VE9607RQ', 'F02', 1),
('VE9607RQ', 'F03', 0),
('VE9607RQ', 'F04', 4),
('VE9607RQ', 'F05', 2),
('VE9607RQ', 'F06', 1),
('VE9607RQ', 'F07', 0),
('VE9607RQ', 'F08', 0),
('YS6DGYT3', 'F01', 0),
('YS6DGYT3', 'F02', 1),
('YS6DGYT3', 'F03', 0),
('YS6DGYT3', 'F04', 2),
('YS6DGYT3', 'F05', 1),
('YS6DGYT3', 'F07', 0),
('YS6DGYT3', 'F08', 0),
('2YER21IZ', 'F01', 0),
('2YER21IZ', 'F02', 0),
('2YER21IZ', 'F03', 0),
('2YER21IZ', 'F04', 2),
('2YER21IZ', 'F05', 0),
('2YER21IZ', 'F06', 0),
('2YER21IZ', 'F07', 0),
('2YER21IZ', 'F08', 0);

-- --------------------------------------------------------

--
-- Table structure for table `bluefood`
--

CREATE TABLE `bluefood` (
  `foodid` varchar(5) NOT NULL,
  `foodname` varchar(50) NOT NULL,
  `price` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bluefood`
--

INSERT INTO `bluefood` (`foodid`, `foodname`, `price`) VALUES
('F01', 'Water', 10),
('F02', 'Pepsi', 25),
('F03', 'Tea', 30),
('F04', 'Curry Rice', 80),
('F05', 'Miso Soup', 20),
('F06', 'Omelette', 50),
('F07', 'Salad', 45),
('F08', 'Kimchi', 30);

-- --------------------------------------------------------

--
-- Table structure for table `blueorder`
--

CREATE TABLE `blueorder` (
  `orderid` varchar(8) NOT NULL,
  `orderdate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `blueorder`
--

INSERT INTO `blueorder` (`orderid`, `orderdate`) VALUES
('0GMDUSSU', '2021-03-05'),
('0H6YDLDR', '2021-04-06'),
('0YDYAX3A', '2021-03-15'),
('2FPM0QJ9', '2021-03-05'),
('2HKH7I05', '2021-03-16'),
('2SWKS9EJ', '2021-03-16'),
('2YER21IZ', '2021-05-28'),
('4S46L21D', '2021-03-16'),
('4S97AORM', '2021-03-20'),
('5CSJSXIO', '2021-03-18'),
('5M8SQGW9', '2021-03-24'),
('78U62S0E', '2021-03-15'),
('97XUD3SK', '2021-03-06'),
('A4RQ21U1', '2021-03-17'),
('BGWX9IZ8', '2021-03-16'),
('D36J1OAH', '2021-03-20'),
('FSQASX92', '2021-03-06'),
('GGFRSTYC', '2021-04-25'),
('LOGRI4R0', '2021-03-06'),
('M3KQPJYA', '2021-03-28'),
('MK5IH2H1', '2021-03-13'),
('MKHXQXEG', '2021-03-16'),
('N2DUVMST', '2021-04-05'),
('NN08BM6W', '2021-03-20'),
('O0ON86GV', '2021-03-20'),
('OAIEHSZZ', '2021-03-18'),
('PRG3UW2B', '2021-04-25'),
('RUE6L4C7', '2021-04-25'),
('U7HTJZZY', '2021-03-16'),
('UPJH4X36', '2021-03-10'),
('V5FS989A', '2021-03-06'),
('V8OQKIBT', '2021-03-19'),
('VE9607RQ', '2021-04-27'),
('YJUSVN5W', '2021-03-16'),
('YS6DGYT3', '2021-04-28'),
('Z0NHLRA1', '2021-03-12'),
('Z3NO4E2Y', '2021-03-12'),
('ZG8JC6M9', '2021-03-16');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bluedetail`
--
ALTER TABLE `bluedetail`
  ADD KEY `orderid` (`orderid`,`foodid`),
  ADD KEY `foodid` (`foodid`);

--
-- Indexes for table `bluefood`
--
ALTER TABLE `bluefood`
  ADD PRIMARY KEY (`foodid`);

--
-- Indexes for table `blueorder`
--
ALTER TABLE `blueorder`
  ADD PRIMARY KEY (`orderid`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bluedetail`
--
ALTER TABLE `bluedetail`
  ADD CONSTRAINT `bluedetail_ibfk_1` FOREIGN KEY (`orderid`) REFERENCES `blueorder` (`orderid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `bluedetail_ibfk_2` FOREIGN KEY (`foodid`) REFERENCES `bluefood` (`foodid`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
