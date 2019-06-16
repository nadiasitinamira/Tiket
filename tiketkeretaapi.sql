-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2019 at 05:36 PM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tiket`
--

-- --------------------------------------------------------

--
-- Table structure for table `tiketkeretaapi`
--

CREATE TABLE `tiketkeretaapi` (
  `jurusan` varchar(100) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `harga` int(100) NOT NULL,
  `nomor_kursi` int(20) NOT NULL,
  `nama_penumpang` varchar(100) NOT NULL,
  `jumlah_beli` int(100) NOT NULL,
  `total_bayar` int(100) NOT NULL,
  `uang_bayar` int(100) NOT NULL,
  `uang_kembali` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tiketkeretaapi`
--

INSERT INTO `tiketkeretaapi` (`jurusan`, `jenis`, `harga`, `nomor_kursi`, `nama_penumpang`, `jumlah_beli`, `total_bayar`, `uang_bayar`, `uang_kembali`) VALUES
('Bandar Kalipah', 'Eksekutif', 300000, 1, '1', 1, 300000, 1111111, 811111),
('Bandar Kalipah', 'Eksekutif', 290000, 1, '1', 1, 290000, 11111111, 10821111),
('Binjai', 'Eksekutif', 15000, 1, '1', 1, 15000, 111111, 96111);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
