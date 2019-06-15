-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 15, 2019 at 07:09 AM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(20) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `uname` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `fname`, `lname`, `uname`, `pass`) VALUES
(1, 'adminnnn', 'mimin', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `tiket_ka`
--

CREATE TABLE `tiket_ka` (
  `no_kursi` int(10) NOT NULL,
  `nama_penum` varchar(100) NOT NULL,
  `jurusan` varchar(100) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `harga_tiket` int(100) NOT NULL,
  `jlh_beli` int(100) NOT NULL,
  `total_bayar` int(100) NOT NULL,
  `uang_bayar` int(100) NOT NULL,
  `uang_kembali` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tiket_kapal`
--

CREATE TABLE `tiket_kapal` (
  `no_kapal` int(100) NOT NULL,
  `no_deck` int(10) NOT NULL,
  `nama_penumpang` varchar(100) NOT NULL,
  `jumlah_tiket` varchar(100) NOT NULL,
  `harga_tiket` varchar(100) NOT NULL,
  `harga_total` varchar(100) NOT NULL,
  `tujuan_pelayaran` varchar(50) NOT NULL,
  `uang_bayarr` varchar(100) NOT NULL,
  `uang_kembali` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tiket_pesawat`
--

CREATE TABLE `tiket_pesawat` (
  `kode_pesawat` varchar(10) NOT NULL,
  `nama_pesawat` varchar(20) NOT NULL,
  `berangkat_dari` varchar(100) NOT NULL,
  `tujuan_pesawat` varchar(100) NOT NULL,
  `kelas_pesawat` varchar(10) NOT NULL,
  `harga_tiket` int(100) NOT NULL,
  `jumlah_tiket` int(100) NOT NULL,
  `total_bayar` int(100) NOT NULL,
  `uang_bayar` int(100) NOT NULL,
  `uang_kembali` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tiket_ka`
--
ALTER TABLE `tiket_ka`
  ADD PRIMARY KEY (`no_kursi`);

--
-- Indexes for table `tiket_kapal`
--
ALTER TABLE `tiket_kapal`
  ADD PRIMARY KEY (`no_kapal`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=82;
--
-- AUTO_INCREMENT for table `tiket_ka`
--
ALTER TABLE `tiket_ka`
  MODIFY `no_kursi` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tiket_kapal`
--
ALTER TABLE `tiket_kapal`
  MODIFY `no_kapal` int(100) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
