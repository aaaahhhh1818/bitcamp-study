drop table insa;

create table insa (
  sabun number(4) not null  primary key , 
      name  varchar(10) not null ,
      buse  varchar(20) not null  
 );

commit;

insert into insa(sabun,name,buse) values( 1100, 'aaa', 'ggg');
insert into insa(sabun,name,buse) values( 2200, 'bbb', 'xxxx');
insert into insa(sabun,name,buse) values( 3300, 'ccc', 'vvvv');
insert into insa(sabun,name,buse) values( 4400, 'ddd', 'bbbbb');
insert into insa(sabun,name,buse) values( 5500, 'eee', 'wwww');

commit;
select * from insa;