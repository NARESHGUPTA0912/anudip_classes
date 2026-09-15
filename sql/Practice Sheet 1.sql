use anudip_db;
create table employee (empId int primary key, firtsName varchar(20), lastName varchar(20), position varchar(20), salary int, HireDate Date, Department varchar(20));
insert into employee (empId, firtsName, lastNAme, position, salary, HireDate, Department) values (10, "Susan", "Davis", "Sales Executive", 50000, "2022-12-05", "Sales");
select * from employee;
Alter table employee Rename Column firtsName To firstName;
SELECT @@sql_mode;


-- 1 
insert into employee (empId, firtsName, lastNAme, position, salary, HireDate, Department) values (11, "Mark", "Evans", "Project Manager", 90000, '2026-06-01', "Product");
-- 2
insert into employee (empId, firtsName, lastNAme, position, salary, HireDate, Department) values (12, "Anna", "Wilson", "IT Analyst", 58000, "2023-03-15", "IT");
-- 3
select * from employee where department = "sales";
-- 4
select firstName, LastName, salary from employee;
-- 5
select * from employee where salary > 60000 and department = "HR";
-- 6
select firstName, Position from employee where hiredate between '2022-01-01' and '2023-01-01';
-- 7
select * from employee where lastNAme = "Smith";
-- 8
select * from employee where hiredate < '2020-01-01';
-- 9
select * from employee where salary > 60000 and department = "IT";
-- 10
select * from employee where department = "Finance" OR department = "Marketing";
-- 11
select * from employee where hiredate < '2022-01-01';
-- 12
select * from employee where department = "Sales" and salary between 45000 and 60000;
-- 13
select * from employee where department = "HR" and (position = "HR Manager" OR salary > 80000 );
-- 14
select * from employee where department NOT IN ("Sales", "IT");
-- 15
select * from employee where position IN ("Developer", "Accountant", "IT Support"); 
-- 16
select * from employee where hiredate between '2021-01-01' and '2023-12-31';
-- 17
delete from employee where empId = 9 OR empId = 10;
-- 18
select * from employee where (department = "HR" and salary < 50000) OR Position = "Manager";

-- copy table from one db to another db
RENAME TABLE anudip_db.employee TO business_db.employees;

