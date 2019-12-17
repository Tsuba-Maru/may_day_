# -- Table definitions

# --- !Ups

CREATE TABLE user (
    user_id int PRIMARY KEY AUTO_INCREMENT,
    user_name varchar(32) UNIQUE NOT NULL,
    password varchar(255) NOT NULL,
    is_active boolean default TRUE,
    created_at timestamp default CURRENT_TIMESTAMP() NOT NULL
);

CREATE TABLE list (
    list_id int PRIMARY KEY AUTO_INCREMENT,
    list_name varchar(32) NOT NULL,
    user_id int NOT NULL,
    genre_id int NOT NULL
);

CREATE TABLE link (
    task_id int NOT NULL,
    user_id int NOT NULL
);

CREATE TABLE task (
    task_id int PRIMARY KEY AUTO_INCREMENT,
    list_id int NOT NULL,
    name1 varchar(32) NOT NULL,
    name2 varchar(128),
    description varchar(255),
    deadline varchar(10),
    created_at timestamp default CURRENT_TIMESTAMP NOT NULL,
    is_done boolean default FALSE
);


# --- !Downs
DROP TABLE user;

DROP TABLE list;

DROP TABLE link;

DROP TABLE task;