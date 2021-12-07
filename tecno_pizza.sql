-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 07-Dez-2021 às 17:06
-- Versão do servidor: 10.4.21-MariaDB
-- versão do PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `tecno_pizza`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `pizzas`
--

CREATE TABLE `pizzas` (
  `ID` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `ingredientes` varchar(800) NOT NULL,
  `valor` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `pizzas`
--

INSERT INTO `pizzas` (`ID`, `nome`, `ingredientes`, `valor`) VALUES
(2, 'Calabresa', 'Calabresa,Catupiry,Presunto,Queijo,Farinha de trigo,Molho de tomate', 27.8),
(3, '2 Queijos', 'Farinha de trigo,Queijo europeu,Queijo suiço,Queijo,Molho de tomate', 30.5),
(4, ' Pizza de Peito de Peru', 'Molho de tomate,Peito de peru,Presunto,Queijo,Catupiry', 38),
(5, 'Pizza Leite', 'Leite,Farinha de trigo,Queijo,Presunto,Molho de tomate', 49);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `id` int(11) NOT NULL,
  `nome` varchar(250) NOT NULL,
  `marca` varchar(250) NOT NULL,
  `fornecedor` varchar(250) NOT NULL,
  `validade` varchar(10) NOT NULL,
  `codbarras` varchar(999) NOT NULL,
  `quantidade` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`id`, `nome`, `marca`, `fornecedor`, `validade`, `codbarras`, `quantidade`) VALUES
(1, 'Farinha de trigo', 'Dona Benta', 'Mercadinho Seu Zé', '25/08/2024', '1812636123719', 490),
(2, 'Catupiry', 'Jussara', 'Supermercado DIA', '12/08/1961', '5234123122131', 198),
(3, 'Molho de tomate', 'Heinz', 'Supermercado DIA', '19/11/2024', '0000000000001', 196),
(4, 'Queijo', 'Jussara', 'Jussara S.A', '21/02/2024', '0000000000002', 292),
(5, 'Presunto', 'Sadia', 'Mercadinho Seu Zé', '01/01/2023', '0000000000003', 989),
(6, 'Calabresa', 'S/M', 'Casa de Frios 01', '15/04/2022', '0000213101234', 26),
(7, 'Peito de peru', 'Aurora', 'Casa de Frios 02', '11/11/2024', '2010012301015', 168),
(8, 'Queijo suiço', 'S/M', 'bOA', '11/11/2027', '1134112112312', 192),
(9, 'Queijo europeu', 'sadfsf', 'sdssss', '24/02/2026', '1134112112312', 246),
(10, 'Leite', 'Jussara', 'Supermercado qualquer', '11/12/2025', '1231221312312', 98);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nome` varchar(250) NOT NULL,
  `email` varchar(100) NOT NULL,
  `senha` varchar(50) NOT NULL,
  `telefone` varchar(16) NOT NULL,
  `cargo` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`id`, `nome`, `email`, `senha`, `telefone`, `cargo`) VALUES
(1, 'Pedro', 'pedro@gmail.com', 'pedro123', '1231441234', 'Administrador'),
(7, 'Usuário', 'usuario@gmail.com', '123', '1231441234', 'Usuario');

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE `vendas` (
  `id` int(11) NOT NULL,
  `nome` varchar(250) NOT NULL,
  `valor` float NOT NULL,
  `quantidade` int(11) NOT NULL,
  `data` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `vendas`
--

INSERT INTO `vendas` (`id`, `nome`, `valor`, `quantidade`, `data`) VALUES
(1, 'Calabresa', 55.6, 2, 'Wed Nov 24 22:50:31 BRT 2021'),
(2, '2 Queijos', 30.5, 1, 'Wed Nov 24 23:00:52 BRT 2021'),
(3, 'Calabresa', 83.4, 3, 'Wed Nov 24 23:01:02 BRT 2021'),
(4, 'Calabresa', 27.8, 1, 'Wed Nov 24 23:01:56 BRT 2021'),
(5, '2 Queijos', 91.5, 3, 'Wed Nov 24 23:03:15 BRT 2021'),
(6, 'Calabresa', 27.8, 1, 'Wed Nov 24 23:03:37 BRT 2021'),
(7, 'Calabresa', 27.8, 1, 'Wed Nov 24 23:06:24 BRT 2021'),
(8, '2 Queijos', 30.5, 1, 'Wed Nov 24 23:06:35 BRT 2021'),
(9, 'Calabresa', 55.6, 2, 'Wed Nov 24 23:07:56 BRT 2021'),
(10, '2 Queijos', 30.5, 1, 'Wed Nov 24 23:07:56 BRT 2021'),
(11, ' Pizza de Peito de Peru', 76, 2, 'Sun Dec 05 19:46:28 BRT 2021'),
(12, ' Pizza de Peito de Peru', 228, 6, 'Sun Dec 05 19:54:23 BRT 2021'),
(13, ' Pizza de Peito de Peru', 228, 6, 'Sun Dec 05 19:55:40 BRT 2021'),
(14, 'Calabresa', 27.8, 1, 'Sun Dec 05 19:55:40 BRT 2021'),
(15, '2 Queijos', 91.5, 3, 'Sun Dec 05 19:55:40 BRT 2021'),
(16, 'Pizza Leite', 98, 2, 'Tue Dec 07 08:09:37 BRT 2021'),
(17, 'Calabresa', 27.8, 1, 'Tue Dec 07 08:09:37 BRT 2021');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `pizzas`
--
ALTER TABLE `pizzas`
  ADD PRIMARY KEY (`ID`);

--
-- Índices para tabela `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `pizzas`
--
ALTER TABLE `pizzas`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `produtos`
--
ALTER TABLE `produtos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `vendas`
--
ALTER TABLE `vendas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
