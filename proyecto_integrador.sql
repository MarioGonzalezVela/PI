-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-05-2024 a las 11:40:22
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto_integrador`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `id_usuario` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`id_usuario`) VALUES
('001'),
('002'),
('003'),
('004'),
('005'),
('006'),
('007'),
('008'),
('009'),
('010');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `armamento`
--

CREATE TABLE `armamento` (
  `tipo` varchar(20) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `id_recurso` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `armamento`
--

INSERT INTO `armamento` (`tipo`, `cantidad`, `id_recurso`) VALUES
('Espada', 10, '001'),
('Escudo', 20, '002'),
('Arco', 30, '003'),
('Martillo', 40, '004'),
('Lanza', 50, '005'),
('Daga', 60, '006'),
('Hacha', 70, '007'),
('Ballesta', 80, '008'),
('Maza', 90, '009'),
('Espada láser', 100, '010');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recursos`
--

CREATE TABLE `recursos` (
  `id_recurso` varchar(7) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `habilidad` varchar(30) DEFAULT NULL,
  `modo` varchar(20) DEFAULT NULL,
  `id_superempresa` varchar(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `recursos`
--

INSERT INTO `recursos` (`id_recurso`, `nombre`, `habilidad`, `modo`, `id_superempresa`) VALUES
('001', 'Espada de fuego', 'Control del fuego', 'Combate', '001'),
('002', 'Escudo de luz', 'Escudo protector', 'Defensa', '002'),
('003', 'Arco de hielo', 'Manipulación del hielo', 'Combate a distancia', '003'),
('004', 'Martillo divino', 'Fuerza sobrehumana', 'Combate', '004'),
('005', 'Lanza eléctrica', 'Control eléctrico', 'Combate a distancia', '005'),
('006', 'Daga venenosa', 'Veneno paralizante', 'Sigilo', '006'),
('007', 'Hacha de viento', 'Manipulación del viento', 'Combate', '007'),
('008', 'Ballesta de sombras', 'Creación de sombras', 'Combate a distancia', '008'),
('009', 'Maza cósmica', 'Poder cósmico', 'Combate', '009'),
('010', 'Espada láser', 'Tecnología avanzada', 'Combate', '010');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `superempresa`
--

CREATE TABLE `superempresa` (
  `pais_sede` varchar(20) DEFAULT NULL,
  `id_usuario` varchar(7) NOT NULL,
  `id_administrador` varchar(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `superempresa`
--

INSERT INTO `superempresa` (`pais_sede`, `id_usuario`, `id_administrador`) VALUES
('España', '001', '001'),
('Francia', '002', '002'),
('Alemania', '003', '003'),
('Italia', '004', '004'),
('Reino Unido', '005', '005'),
('Portugal', '006', '006'),
('Países Bajos', '007', '007'),
('Bélgica', '008', '008'),
('Suecia', '009', '009'),
('Dinamarca', '010', '010');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `superheroe`
--

CREATE TABLE `superheroe` (
  `procedencia` varchar(40) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `id_recurso` varchar(7) NOT NULL,
  `id_superempresa` varchar(7) DEFAULT NULL,
  `id_administrador` varchar(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `superheroe`
--

INSERT INTO `superheroe` (`procedencia`, `edad`, `sexo`, `id_recurso`, `id_superempresa`, `id_administrador`) VALUES
('Marvel', 30, 'Masculino', '001', '001', '001'),
('DC', 35, 'Femenino', '002', '002', '002'),
('Marvel', 40, 'Masculino', '003', '003', '003'),
('DC', 45, 'Femenino', '004', '004', '004'),
('Marvel', 50, 'Masculino', '005', '005', '005'),
('DC', 55, 'Femenino', '006', '006', '006'),
('Marvel', 60, 'Masculino', '007', '007', '007'),
('DC', 65, 'Femenino', '008', '008', '008'),
('Marvel', 70, 'Masculino', '009', '009', '009'),
('DC', 75, 'Femenino', '010', '010', '010');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tecnologia`
--

CREATE TABLE `tecnologia` (
  `procedencia` varchar(40) DEFAULT NULL,
  `id_recurso` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `tecnologia`
--

INSERT INTO `tecnologia` (`procedencia`, `id_recurso`) VALUES
('Alienígena', '001'),
('Humana', '002'),
('Alienígena', '003'),
('Humana', '004'),
('Alienígena', '005'),
('Humana', '006'),
('Alienígena', '007'),
('Humana', '008'),
('Alienígena', '009'),
('Humana', '010');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` varchar(7) NOT NULL,
  `nickname` varchar(20) DEFAULT NULL,
  `contrasenya` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nickname`, `contrasenya`) VALUES
('001', 'alice91', 'pass123'),
('002', 'bob88', 'secret456'),
('003', 'charlie77', 'hidden789'),
('004', 'diana84', 'confidential012'),
('005', 'edward79', 'topsecret345'),
('006', 'frank82', 'classified678'),
('007', 'gina85', 'sensitive901'),
('008', 'henry80', 'privileged234'),
('009', 'irene87', 'secure567'),
('010', 'jack86', 'protected890');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Indices de la tabla `armamento`
--
ALTER TABLE `armamento`
  ADD PRIMARY KEY (`id_recurso`);

--
-- Indices de la tabla `recursos`
--
ALTER TABLE `recursos`
  ADD PRIMARY KEY (`id_recurso`),
  ADD KEY `id_superempresa` (`id_superempresa`);

--
-- Indices de la tabla `superempresa`
--
ALTER TABLE `superempresa`
  ADD PRIMARY KEY (`id_usuario`),
  ADD KEY `id_administrador` (`id_administrador`);

--
-- Indices de la tabla `superheroe`
--
ALTER TABLE `superheroe`
  ADD PRIMARY KEY (`id_recurso`),
  ADD KEY `id_superempresa` (`id_superempresa`),
  ADD KEY `id_administrador` (`id_administrador`);

--
-- Indices de la tabla `tecnologia`
--
ALTER TABLE `tecnologia`
  ADD PRIMARY KEY (`id_recurso`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD CONSTRAINT `administrador_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `armamento`
--
ALTER TABLE `armamento`
  ADD CONSTRAINT `armamento_ibfk_1` FOREIGN KEY (`id_recurso`) REFERENCES `recursos` (`id_recurso`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `recursos`
--
ALTER TABLE `recursos`
  ADD CONSTRAINT `recursos_ibfk_1` FOREIGN KEY (`id_superempresa`) REFERENCES `superempresa` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `superempresa`
--
ALTER TABLE `superempresa`
  ADD CONSTRAINT `superempresa_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `superempresa_ibfk_2` FOREIGN KEY (`id_administrador`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `superheroe`
--
ALTER TABLE `superheroe`
  ADD CONSTRAINT `superheroe_ibfk_1` FOREIGN KEY (`id_recurso`) REFERENCES `recursos` (`id_recurso`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `superheroe_ibfk_2` FOREIGN KEY (`id_superempresa`) REFERENCES `superempresa` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `superheroe_ibfk_3` FOREIGN KEY (`id_administrador`) REFERENCES `administrador` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `tecnologia`
--
ALTER TABLE `tecnologia`
  ADD CONSTRAINT `tecnologia_ibfk_1` FOREIGN KEY (`id_recurso`) REFERENCES `recursos` (`id_recurso`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
