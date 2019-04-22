# --- !Ups

create table if not exists test
(
    id  varchar(255) primary key
);

# --- !Downs

drop table test;