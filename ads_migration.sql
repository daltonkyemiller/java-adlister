USE adlister_db;
CREATE TABLE users
(
    id       INT AUTO_INCREMENT NOT NULL,
    username VARCHAR(25)        NOT NULL,
    email    VARCHAR(100)       NOT NULL,
    password VARCHAR(100)       NOT NULL,
    PRIMARY KEY (id)
);
CREATE TABLE ads
(
    id          INT AUTO_INCREMENT NOT NULL,
    user_id     INT                NOT NULL,
    title       VARCHAR(100)       NOT NULL,
    description TEXT               NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id)
);
