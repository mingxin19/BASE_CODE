# --- !Ups

update projects set department_id = 1 where department_id is null;

# --- !Ups
delete from user;

insert into user (type, email,name,password,role) values ( 'a', 'admin@projects.com', 'Alice Admin', 'password', 'admin' );

insert into user (type, email,name,password,role) values ( 'm', 'manager@projects.com', 'Bob Manager', 'password', 'manager' );

insert into user (type, email,name,password,role) values ( 'e', 'employee@projects.com', 'Charlie Employee', 'password', 'employee' );