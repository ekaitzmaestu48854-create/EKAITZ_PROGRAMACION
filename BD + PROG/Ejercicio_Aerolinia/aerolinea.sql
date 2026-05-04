-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 06-03-2026 a las 12:56:21
-- Versión del servidor: 5.6.13
-- Versión de PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `aerolinea`
--
CREATE DATABASE IF NOT EXISTS `aerolinea` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `aerolinea`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasajeros`
--

CREATE TABLE IF NOT EXISTS `pasajeros` (
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `cod_vuelo` varchar(10) NOT NULL,
  PRIMARY KEY (`dni`),
  KEY `cod_vuelo` (`cod_vuelo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vuelos`
--

CREATE TABLE IF NOT EXISTS `vuelos` (
  `cod_vuelo` varchar(10) NOT NULL,
  `fecha_salida` date NOT NULL,
  `destino` varchar(50) NOT NULL,
  `procedencia` varchar(50) NOT NULL,
  PRIMARY KEY (`cod_vuelo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pasajeros`
--
ALTER TABLE `pasajeros`
  ADD CONSTRAINT `pas_codvuelo_fk` FOREIGN KEY (`cod_vuelo`) REFERENCES `vuelos` (`cod_vuelo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
