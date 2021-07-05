drop table insa;

create table insa (
  sabun number (4) not null primary key ,
  name varchar (10) not null ,
  buse varchar (20) not null
);

commit;
desc insa
insert into insa(sabun, name, buse) values ( 990, 'dan', 'gugu' );
commit;
select sabun, name, buse from insa;