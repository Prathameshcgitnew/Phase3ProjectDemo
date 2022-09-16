create database adminportal1;

use adminportal1;

drop table class;
CREATE TABLE `class` (
  `id` int NOT NULL auto_increment,
  `section` int NOT NULL,
  `teacher` varchar(30) NOT NULL,
  `subject` varchar(40) NOT NULL,
  `time` varchar(44) NOT NULL,
  primary key (id)) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `class` (`id`, `section`, `teacher`, `subject`, `time`) VALUES
(1, 1, 'Mahesh Joshi', 'Mathematics', '9:00'),
(2, 2, 'Dev Devang', 'English', '11:30');

select * from class;
create table subjects (	
id int not null , 
subjectname varchar(30) not null,
shortcut varchar(30) not null) engine=InnoDB default charset=utf8mb4;

INSERT INTO subjects (id,subjectname,shortcut)values
(1,'English','Eng'),
(2,'Mathematics','Maths');

create table teachers(id int not null, 
fname varchar(30) not null, 
lname varchar(30) not null,
 age int not null) engine=InnoDB default charset=utf8mb4;

insert into teachers(id,fname,lname,age)values(1,'Mahesh', 'Joshi',39),(2,'Dev','Devang',45);

select * from teachers;

drop table teachers;
create table students(id int not null , 
fname varchar(30) not null,
lname varchar(30) not null, 
age int not null); 

drop table students;

insert into students(id,fname,lname,age)values(1,'Amar','Raje',22),
(2,'Mahesh','Shingade',23),
(3,'Omkar','Bhosale',30),
(4,'Raju','Shrivastav',40),
(5,'Zashin','Javed',24);
Alter table students add column section int(20);

desc students;
select * from students;

update students set section=1 where id=1;
update students set section=2 where id=2;
update students set section=2 where id=3;
update students set section=1 where id=4;
update students set section=1 where id=5;
