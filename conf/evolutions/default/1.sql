# -- Table definitions

# --- !Ups

CREATE TABLE user (
    userId int PRIMARY KEY AUTO_INCREMENT,
    userName varchar(32) UNIQUE NOT NULL,
    password varchar(255) NOT NULL,
    isActive boolean default TRUE,
    createdAt timestamp default CURRENT_TIMESTAMP() NOT NULL
);

CREATE TABLE list (
    listId int PRIMARY KEY AUTO_INCREMENT,
    listName varchar(32) NOT NULL,
    userId int NOT NULL,
    genreId int NOT NULL
);

CREATE TABLE link (
    taskId int NOT NULL,
    userId int NOT NULL
);

CREATE TABLE task (
    taskId int PRIMARY KEY AUTO_INCREMENT,
    listId int NOT NULL,
    name1 varchar(32) NOT NULL,
    name2 varchar(128),
    description varchar(255),
    deadline varchar(10),
    createdAt timestamp default CURRENT_TIMESTAMP NOT NULL,
    isDone boolean default FALSE
);


# --- !Downs
DROP TABLE user;

DROP TABLE list;

DROP TABLE link;

DROP TABLE task;