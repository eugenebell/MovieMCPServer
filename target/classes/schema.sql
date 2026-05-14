create table if not exists movie
(
    id serial primary key,
    title varchar(255) not null,
    description text not null,
    rating numeric(3, 1) check (rating >= 0 and rating <= 10)
);

create table if not exists actor
(
    id serial primary key,
    name varchar(255) not null
);

create table if not exists movie_actor
(
    movie_id integer not null references movie(id),
    actor_id integer not null references actor(id),
    primary key (movie_id, actor_id)
);
