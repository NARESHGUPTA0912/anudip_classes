use anudip_db;
create table emp
(empNo int primary key, empName varchar(20), 
address varchar(20), course varchar(10));

Insert into emp (empNo, empName, address, course) values (6, "Prince Gupta", "Ghaziabad", "BBA");
select * from emp;  

select * from emp where empNo between 1 and 3;
truncate table emp;

delete from emp where empName = "Naresh Gupta";
set sql_safe_updates=1;
-- used to stop delete and update 
select @@sql_safe_updates;

SHOW VARIABLES LIKE 'sql_safe_updates';

SELECT @@SESSION.sql_safe_updates;
