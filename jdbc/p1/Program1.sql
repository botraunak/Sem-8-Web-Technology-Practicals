-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 16, 2017 at 03:25 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Program1`
--

-- --------------------------------------------------------

--
-- Table structure for table `Results`
--

CREATE TABLE `Results` (
  `id` int(11) NOT NULL,
  `subject` varchar(100) NOT NULL,
  `student_id` int(11) NOT NULL,
  `marks` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Results`
--

INSERT INTO `Results` (`id`, `subject`, `student_id`, `marks`) VALUES
(1, 'COMPUTER SCIENCE', 1, 90),
(2, 'ENGLISH', 1, 76),
(3, 'MATHS', 1, 65),
(4, 'COMPUTER SCIENCE', 2, 87),
(5, 'ENGLISH', 2, 78),
(6, 'MATHS', 2, 100),
(7, 'COMPUTER SCIENCE', 3, 76),
(8, 'ENGLISH', 3, 76),
(9, 'MATHS', 3, 65);

-- --------------------------------------------------------

--
-- Table structure for table `Student`
--

CREATE TABLE `Student` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `rollno` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Student`
--

INSERT INTO `Student` (`id`, `name`, `rollno`) VALUES
(1, 'Raunak Sett', 1302038),
(2, 'Shashi Jangra', 1302076),
(3, 'Aman Yadav', 1302007),
(4, 'Preeti Yadav', 1302061),
(5, 'Anurag Mishra', 1302035),
(6, 'Ridhima Kalra', 1302014);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Results`
--
ALTER TABLE `Results`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `Student`
--
ALTER TABLE `Student`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Results`
--
ALTER TABLE `Results`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `Student`
--
ALTER TABLE `Student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
