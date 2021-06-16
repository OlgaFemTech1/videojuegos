DROP TABLE IF EXISTS games;

CREATE TABLE games (
                       id   BIGSERIAL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       platform VARCHAR(255) NOT NULL,
                       years NUMERIC NOT NULL,
                       pegi NUMERIC NOT NULL,
                       priceOriginal decimal(5,2)
);