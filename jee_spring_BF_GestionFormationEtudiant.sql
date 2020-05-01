CREATE DATABASE IF NOT EXISTS jee_spring_BF_GestionFormationEtudiant;
USE jee_spring_BF_GestionFormationEtudiant;

DROP TABLE IF EXISTS `etudiant`;
CREATE TABLE IF NOT EXISTS `etudiant` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `date_naissance` datetime(6) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `id_formation` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK48lh2xw851xlbpsjj3xakx3yg` (`id_formation`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`id`, `date_naissance`, `nom`, `prenom`, `id_formation`) VALUES
(1, '2019-12-24 20:09:02.567000', 'DIOUF', 'Mame Abdou', 1),
(3, '2019-12-24 20:09:02.580000', 'DIOUF', 'Mame Abdou', 1),
(5, '2019-12-24 20:09:02.592000', 'DIOUF', 'Mame Abdou', 3),
(7, '2019-12-24 20:09:02.600000', 'DIOUF', 'Mame Abdou', 3),
(9, '2019-12-24 20:09:02.607000', 'DIOUF', 'Mame Abdou', 3),
(11, '2019-12-24 20:09:02.616000', 'DIOUF', 'Mame Abdou', 7),
(13, '2019-12-24 20:09:02.624000', 'DIOUF', 'Mame Abdou', 7),
(15, '2019-12-24 20:09:02.631000', 'DIOUF', 'Mame Abdou', 7);

-- --------------------------------------------------------

--
-- Structure de la table `formation`
--

DROP TABLE IF EXISTS `formation`;
CREATE TABLE IF NOT EXISTS `formation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `duree` int(11) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `formation`
--

INSERT INTO `formation` (`id`, `duree`, `nom`) VALUES
(1, 30, 'PHP/SYMFONY 4'),
(3, 30, 'PHP/LARAVEL 6'),
(5, 30, 'JS/ANGULAR'),
(7, 30, 'JAVA JEE/SPRING');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD CONSTRAINT `FK48lh2xw851xlbpsjj3xakx3yg` FOREIGN KEY (`id_formation`) REFERENCES `formation` (`id`);
COMMIT;

