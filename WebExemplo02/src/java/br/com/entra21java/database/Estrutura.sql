DROP DATABASE IF EXISTS exemplo_web_01;
CREATE DATABASE IF NOT EXISTS exemplo_web_01;
USE exemplo_web_01;

CREATE TABLE alimentos(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100),
	preco DOUBLE,
	quantidade SMALLINT,
	descricao VARCHAR(100)
	);

INSERT INTO alimentos(nome, preco, quantidade) VALUES
("Brigadeiro Fit", 5.50, 10),
("Fit Ovo", 22.50, 1),
("Panqueca Sem Glúten", 13.90, 2),
("Protobar - Barra de Proteína", 8.50, 7);