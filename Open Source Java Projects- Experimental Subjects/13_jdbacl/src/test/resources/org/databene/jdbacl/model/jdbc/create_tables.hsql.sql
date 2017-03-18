create table T1 (
  ID        int         generated by default as identity (start with 1) not null,
  NAMESPACE varchar(30) not null,
  NAME      varchar(30) not null,
  NICKNAME  varchar(30),
  constraint T1_PK      primary key (ID),
  constraint T1_NAME_UK unique (NAMESPACE, NAME) 
);
create index T1_NICKNAME on T1 (NICKNAME);
insert into T1 values (1, 'ns', 'name', 'nick');