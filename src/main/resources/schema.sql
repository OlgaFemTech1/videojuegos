DROP TABLE IF EXISTS games;

CREATE TABLE games (
                       id   BIGSERIAL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       Platform VARCHAR(255) NOT NULL,
                       years NUMERIC NOT NULL,
);