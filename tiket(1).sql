-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 26, 2019 at 02:30 PM
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
-- Table structure for table `tiket`
--

CREATE TABLE `tiket` (
  `kode_pesawat` varchar(10) NOT NULL,
  `nama_pesawat` varchar(20) NOT NULL,
  `kelas_pesawat` varchar(10) NOT NULL,
  `harga_tiket` int(100) NOT NULL,
  `jumlah_tiket` int(100) NOT NULL,
  `total_bayar` int(100) NOT NULL,
  `uang_bayar` int(100) NOT NULL,
  `uang_kembali` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tiket`
--

INSERT INTO `tiket` (`kode_pesawat`, `nama_pesawat`, `kelas_pesawat`, `harga_tiket`, `jumlah_tiket`, `total_bayar`, `uang_bayar`, `uang_kembali`) VALUES
('MPT', 'Merpati', 'Kelas 1', 1500000, 1, 1500000, 2000000, 500000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
