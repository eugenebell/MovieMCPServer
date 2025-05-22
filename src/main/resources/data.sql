INSERT INTO movie (title,description,rating) VALUES ('Thunderbolts', 'A group of anti-heroes are recruited to go on a mission that could save the world.', 7.5);
INSERT INTO movie (title,description,rating) VALUES ('The Marvels', 'Carol Danvers, Kamala Khan, and Monica Rambeau team up to save the universe.', 7.0);   
INSERT INTO movie (title,description,rating) VALUES ('Aquaman and the Lost Kingdom', 'Aquaman must forge an uneasy alliance with an unlikely ally to protect Atlantis.', 6.8);
INSERT INTO movie (title,description,rating) VALUES ('Dune: Part Two', 'The epic conclusion of the Dune saga, where Paul Atreides faces new challenges.', 8.5);

INSERT INTO movie (title,description,rating) VALUES ('Killers of the Flower Moon', 'A true crime drama about the Osage murders in the 1920s.', 8.2);
INSERT INTO movie (title,description,rating) VALUES ('Napoleon', 'A historical drama about the rise and fall of Napoleon Bonaparte.', 7.8);
INSERT INTO movie (title,description,rating) VALUES ('The Hunger Games: The Ballad of Songbirds and Snakes', 'A prequel to the Hunger Games series, focusing on a young Coriolanus Snow.', 7.5);
INSERT INTO movie (title,description,rating) VALUES ('The Marvels', 'A sequel to Captain Marvel, featuring Carol Danvers and her allies.', 7.0);
INSERT INTO movie (title,description,rating) VALUES ('The Flash', 'Barry Allen uses his super-speed powers to change the past.', 6.5);
INSERT INTO movie (title,description,rating) VALUES ('Mission: Impossible - Dead Reckoning Part One', 'Ethan Hunt and his team embark on a dangerous mission to track down a powerful weapon.', 8.0);
INSERT INTO movie (title,description,rating) VALUES ('Oppenheimer', 'A biopic about J. Robert Oppenheimer and the creation of the atomic bomb.', 8.4);
INSERT INTO movie (title,description,rating) VALUES ('Barbie', 'A doll comes to life and embarks on a journey of self-discovery.', 7.5);

-- Insert actors
INSERT INTO actor (name) VALUES ('Chris Hemsworth');
INSERT INTO actor (name) VALUES ('Brie Larson');
INSERT INTO actor (name) VALUES ('Jason Momoa');
INSERT INTO actor (name) VALUES ('Timothée Chalamet');
INSERT INTO actor (name) VALUES ('Leonardo DiCaprio');
INSERT INTO actor (name) VALUES ('Joaquin Phoenix');
INSERT INTO actor (name) VALUES ('Rachel Zegler');
INSERT INTO actor (name) VALUES ('Ezra Miller');
INSERT INTO actor (name) VALUES ('Tom Cruise');
INSERT INTO actor (name) VALUES ('Cillian Murphy');
INSERT INTO actor (name) VALUES ('Margot Robbie');

-- Associate actors with movies (example associations)
INSERT INTO movie_actor (movie_id, actor_id) VALUES (1, 1); -- Thunderbolts: Chris Hemsworth
INSERT INTO movie_actor (movie_id, actor_id) VALUES (2, 2); -- The Marvels: Brie Larson
INSERT INTO movie_actor (movie_id, actor_id) VALUES (3, 3); -- Aquaman: Jason Momoa
INSERT INTO movie_actor (movie_id, actor_id) VALUES (4, 4); -- Dune: Timothée Chalamet
INSERT INTO movie_actor (movie_id, actor_id) VALUES (5, 5); -- Killers of the Flower Moon: Leonardo DiCaprio
INSERT INTO movie_actor (movie_id, actor_id) VALUES (6, 6); -- Napoleon: Joaquin Phoenix
INSERT INTO movie_actor (movie_id, actor_id) VALUES (7, 7); -- Hunger Games: Rachel Zegler
INSERT INTO movie_actor (movie_id, actor_id) VALUES (9, 8); -- The Flash: Ezra Miller
INSERT INTO movie_actor (movie_id, actor_id) VALUES (10, 9); -- Mission Impossible: Tom Cruise
INSERT INTO movie_actor (movie_id, actor_id) VALUES (11, 10); -- Oppenheimer: Cillian Murphy
INSERT INTO movie_actor (movie_id, actor_id) VALUES (12, 11); -- Barbie: Margot Robbie
