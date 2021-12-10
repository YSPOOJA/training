create database HR_Database;
use HR_Database;
create table Departments (
DEPARTMENT_ID INT(4) NOT NULL Primary Key,
DEPARTMENT_NAME VARCHAR(30) NOT NULL,
MANAGER_ID INT,
LOCATION_ID INT
);
insert into Departments values (1, 'chief', 7, 75);
select * from Departments;

use HR_Database;
create table Jobs (
JOB_ID  VARCHAR(10) NOT NULL Primary Key,
JOB_TITLE VARCHAR(35) NOT NULL,
MIN_SALARY INT,
MAX_SALARY INT
);
insert into Jobs values (77, 'manager', 25000, 50000);
select * from Jobs;

create table Regions (
REGION_ID INT NOT NULL Primary Key,
REGION_NAME VARCHAR(25) Unique
);
insert into Regions values (55, 'hyd');
select * from Regions;

create table Country (
COUNTRY_NAME CHAR(2) NOT NULL Primary Key,
COUNTRY_ID varchar(40),
REGION_ID INT 
);
insert into Country values ('ap', 99, 66);
select * from Country;

create table Employees (
EMPLOYEE_ID INT NOT NULL,
FIRST_NAME VARCHAR(20),
LAST_NAME VARCHAR(25) NOT NULL,
EMAIL VARCHAR(20) NOT NULL,
PHONE_INT VARCHAR(20),
HIRE_DATE DATE NOT NULL, 
JOB_ID VARCHAR(10) NOT NULL,
SALARY FLOAT NOT NULL,
COMMISSION_PCT FLOAT,
MANAGER_ID INT,
DEPARTMENT_ID INT
);
insert into Employees (EMPLOYEE_ID, FIRST_NAME, LAST_NAME) values (1, 'pooja', 'ys');

create table Locations (
LOCATION_ID INT(4) NOT NULL ,
STREET_ADDRESS VARCHAR(40),
POSTAL_CODE VARCHAR(12),
CITY VARCHAR(30) NOT NULL,
STATE_PROVINCE VARCHAR(25),
COUNTRY_ID CHAR(2)
);
insert into Locations values (12, 122, 5012, 'hyd', 'prov', 22);
select * from Locations;
