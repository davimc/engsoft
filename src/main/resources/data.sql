DROP TABLE IF EXISTS IMOVEIS;

CREATE TABLE IMOVEIS (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  cpf VARCHAR(250) NOT NULL,
  tel1 VARCHAR(25) NOT NULL,
  tel2 VARCHAR(25),
  email VARCHAR(100),
  nascimento DATE
);


INSERT INTO billionaires (name, cpf, tel1,tel2,email,nascimento) VALUES
  ('Aliko', '12345678912', '12345678', '98764532','davimatosc@hotmail.com','02-06-1995'),
  ('Lotus', '09876543211', '12357653', '13876640','algo@hotmail.com','03-12-1990'),
  ('Fartus', '1556478765', '12536743', '50583060','davimatosc@gmail.com','31-01-2000'),