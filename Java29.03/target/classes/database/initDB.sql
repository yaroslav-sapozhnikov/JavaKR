CREATE TABLE IF NOT EXISTS users
(
    id    BIGSERIAL PRIMARY KEY ,
    login VARCHAR(50) NOT NULL ,
    first_name  VARCHAR(50) NOT NULL ,
    last_name VARCHAR(50) NOT NULL ,
    birthday DATE ,
    created DATE ,
    updated DATE
);