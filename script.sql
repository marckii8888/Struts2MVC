DROP DATABASE IF EXISTS customers;

CREATE DATABASE customers;

USE customers;

DROP TABLE IF EXISTS users;

CREATE TABLE users(
SNO INT UNSIGNED NOT NULL AUTO_INCREMENT,
PRIMARY KEY (SNO),
userName VARCHAR(30) NOT NULL,
password VARCHAR(30) NOT NULL,
UNIQUE KEY (userName));

INSERT INTO users VALUES (1, 'username', 'password');
INSERT INTO users VALUES (2, 'dummy123', '1234');
INSERT INTO users VALUES (3, 'admin', 'pass');
