INSERT INTO people (id, firstname, lastname, age) VALUES ((SELECT nextval('id_generator')), 'Espen', 'Johansen', 42);
INSERT INTO people (id, firstname, lastname, age) VALUES ((SELECT nextval('id_generator')), 'Julie', 'Johansen', 32);
INSERT INTO people (id, firstname, lastname, age) VALUES ((SELECT nextval('id_generator')), 'Jonathan', 'Johansen', 12);