INSERT INTO users (id, username, password, role_id) VALUES ((SELECT nextval('user_id_generator')), 'owner', 'password', 4); -- 'owner' role
INSERT INTO users (id, username, password, role_id) VALUES ((SELECT nextval('user_id_generator')), 'admin', 'password', 3); -- 'admin' role
INSERT INTO users (id, username, password, role_id) VALUES ((SELECT nextval('user_id_generator')), 'moderator', 'password', 2); -- 'moderator' role
INSERT INTO users (id, username, password, role_id) VALUES ((SELECT nextval('user_id_generator')), 'user', 'password', 1); -- 'user' role