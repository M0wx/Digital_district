-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : sam. 15 avr. 2023 à 07:41
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `digitaldistrict`
--

-- --------------------------------------------------------

--
-- Structure de la table `historique`
--

DROP TABLE IF EXISTS `historique`;
CREATE TABLE IF NOT EXISTS `historique` (
  `username` varchar(50) NOT NULL,
  `evenement` varchar(250) NOT NULL,
  `datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `historique`
--

INSERT INTO `historique` (`username`, `evenement`, `datetime`) VALUES
('sitraka', 'connexion', '2023-04-13 17:09:43'),
('sitraka', 'inscription', '2023-04-13 17:12:03'),
('toky', 'inscription', '2023-04-13 17:12:18'),
('toky', 'residence', '2023-04-13 17:12:32'),
('sitraka', 'autorisation', '2023-04-13 17:13:01'),
('sitraka', 'residence certificat', '2023-04-13 17:13:23'),
('sitraka', 'fifindramonina', '2023-04-13 17:13:53'),
('sitraka', 'deconnexion', '2023-04-13 17:14:17'),
('bakoly', 'connexion', '2023-04-13 17:14:58'),
('bakoly', 'residence', '2023-04-13 17:15:15'),
('bakoly', 'residence', '2023-04-13 17:22:41'),
('bakoly', 'connexion', '2023-04-14 15:01:36'),
('Sitraka', 'connexion', '2023-04-14 15:02:29'),
('Mamy', 'connexion', '2023-04-14 15:02:47'),
('Toky', 'connexion', '2023-04-14 15:03:04');

-- --------------------------------------------------------

--
-- Structure de la table `people`
--

DROP TABLE IF EXISTS `people`;
CREATE TABLE IF NOT EXISTS `people` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `birthDate` varchar(12) NOT NULL,
  `birthPlace` varchar(50) NOT NULL,
  `CIN` varchar(16) NOT NULL,
  `address` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `people`
--

INSERT INTO `people` (`id`, `firstName`, `lastName`, `birthDate`, `birthPlace`, `CIN`, `address`) VALUES
(1, 'RATOVOMANALINA', 'Sitraka', '24/ 11/ 2001', 'AVARADOHA', '101 251 220 282', 'Ampanotokana'),
(7, 'RATOVOMANALINA', 'Toky Mamy', '08/ 03/ 2005', 'AVARADOHA', '301 251 220 382', 'Ampanotokana');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `CIN` varchar(16) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `name`, `CIN`, `password`) VALUES
(1, 'Sitraka', '101 251 220 282', 'digitaldistrict'),
(3, 'Mamy', '101 251 220 281', 'digitaldistricts');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
