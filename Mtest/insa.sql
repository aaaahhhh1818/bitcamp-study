drop table insa;

create table board(
  code number(4) not null primary key ,
  write varchar(10) not null ,
  title varchar(20) not null ,
  content varchar(60) not null ,
  email varchar(20) not null ,
  cnt number(3) not null ,
  wdate date not null ,
  img varchar(30) not null ,
  pwd varchar(20) not null ,
  sns varchar(30) not null 
);
