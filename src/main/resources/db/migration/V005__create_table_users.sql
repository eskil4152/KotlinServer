CREATE TABLE users
(
    id INTEGER PRIMARY KEY,
    username VARCHAR(255),
    password VARCHAR(255),
    role_id INTEGER,
    FOREIGN KEY (role_id) REFERENCES roles(id)
);

create sequence user_id_generator;