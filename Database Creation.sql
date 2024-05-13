CREATE TABLE users
(
    username    VARCHAR2 (50) PRIMARY KEY,
    password    VARCHAR2 (50),
    email       VARCHAR2 (50),
    phone       VARCHAR2 (50),
    balance     NUMBER (5)
);


CREATE TABLE items
(
    id          NUMBER (4) PRIMARY KEY,
    name        VARCHAR2 (50),
    category    VARCHAR2 (50),
    price       NUMBER (5)
);


CREATE TABLE friends
(
    username       VARCHAR2 (50),
    friend_name    VARCHAR2 (50),
    PRIMARY KEY (username, friend_name),
    CONSTRAINT fk1 FOREIGN KEY (username) REFERENCES users (username),
    CONSTRAINT fk2 FOREIGN KEY (friend_name) REFERENCES users (username)
);

CREATE TABLE user_items
(
    username      VARCHAR2 (50),
    id            NUMBER (4),
    date_added    DATE,
    paid          NUMBER (4),
    PRIMARY KEY (username, id),
    CONSTRAINT fk3 FOREIGN KEY (username) REFERENCES users (username),
    CONSTRAINT fk4 FOREIGN KEY (id) REFERENCES items (id)
);

select * from user_tables
where TABLE_NAME = 'USERS';

select * from users;