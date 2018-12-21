-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 21, 2018 at 07:00 AM
-- Server version: 10.1.33-MariaDB
-- PHP Version: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `zak`
--

-- --------------------------------------------------------

--
-- Table structure for table `farmingstat`
--

CREATE TABLE `farmingstat` (
  `id` int(11) NOT NULL,
  `sFarm_Item` varchar(30) NOT NULL,
  `sFarm_Vari` varchar(30) NOT NULL,
  `Nongin` varchar(30) NOT NULL,
  `Hold` int(11) NOT NULL,
  `Farm_Loc` varchar(150) NOT NULL,
  `Farm_Size` int(11) NOT NULL,
  `Ceo_tel` varchar(20) NOT NULL,
  `Ceo_educ` varchar(30) NOT NULL,
  `Nong_empl` int(11) NOT NULL,
  `Class_jak` varchar(20) NOT NULL,
  `Tech_cmpy` varchar(30) NOT NULL,
  `Cmpy_tel` varchar(20) NOT NULL,
  `Hous_name` varchar(20) NOT NULL,
  `Hous_type` int(11) NOT NULL,
  `Hous_mo` int(11) NOT NULL,
  `Hous_size` int(11) NOT NULL,
  `Hous_cnt` int(11) NOT NULL,
  `Nong_Meth` varchar(30) NOT NULL,
  `Nong_etc` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `workdiary`
--

CREATE TABLE `workdiary` (
  `id` int(11) NOT NULL,
  `Hous_Name` varchar(30) NOT NULL,
  `WorkDiary` varchar(20) NOT NULL,
  `Work_time` varchar(20) NOT NULL,
  `Work_man` varchar(20) NOT NULL,
  `Work_empl` int(11) NOT NULL,
  `Work_cont1` varchar(50) NOT NULL,
  `Work_cont2` varchar(50) NOT NULL,
  `Work_cont3` varchar(50) NOT NULL,
  `Work_cont4` varchar(50) NOT NULL,
  `Work_cont5` varchar(50) NOT NULL,
  `Work_contetc` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `workdiary`
--

INSERT INTO `workdiary` (`id`, `Hous_Name`, `WorkDiary`, `Work_time`, `Work_man`, `Work_empl`, `Work_cont1`, `Work_cont2`, `Work_cont3`, `Work_cont4`, `Work_cont5`, `Work_contetc`) VALUES
(1, 'xyz', 'xyz', 'xyz', 'xyz', 1, 'xyz', 'xyz', 'xyz', 'xyz', 'xyz', 'xyz'),
(2, 'xyz', 'xyz', 'xyz', 'xyz', 1, 'xyz', 'xyz', 'xyz', 'xyz', 'xyz', 'xyz'),
(3, 'xyz', 'xyz', 'xyz', 'xyz', 1, 'xyz', 'xyz', 'xyz', 'xyz', 'xyz', 'xyz'),
(4, 'xyz', 'xyz', 'xyz', 'xyz', 1, 'xyz', 'xyz', 'xyz', 'xyz', 'xyz', 'xyz'),
(5, 'xyz', 'xyz', 'xyz', 'xyz', 1, 'xyz', 'xyz', 'xyz', 'xyz', 'xyz', 'xyz'),
(6, 'xyz', 'xyz', 'xyz', 'xyz', 1, 'xyz', 'xyz', 'xyz', 'xyz', 'xyz', 'xyz'),
(7, 'xyz', 'xyz', 'xyz', 'xyz', 1, 'xyz', 'xyz', 'xyz', 'xyz', 'xyz', 'xyz'),
(8, 'xyz', 'xyz', 'xyz', 'xyz', 1, 'xyz', 'xyz', 'xyz', 'xyz', 'xyz', 'xyz'),
(9, 'xyz', 'xyz', 'xyz', 'xyz', 1, 'xyz', 'xyz', 'xyz', 'xyz', 'xyz', 'xyz'),
(10, 'xyz', 'xyz', 'xyz', 'xyz', 1, 'xyz', 'xyz', 'xyz', 'xyz', 'xyz', 'xyz'),
(11, 'xyz', 'xyz', 'xyz', 'xyz', 1, 'xyz', 'xyz', 'xyz', 'xyz', 'xyz', 'xyz'),
(12, 'xyz', 'xyz', 'xyz', 'xyz', 1, 'xyz', 'xyz', 'xyz', 'xyz', 'xyz', 'xyz');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `farmingstat`
--
ALTER TABLE `farmingstat`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `workdiary`
--
ALTER TABLE `workdiary`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `farmingstat`
--
ALTER TABLE `farmingstat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `workdiary`
--
ALTER TABLE `workdiary`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
