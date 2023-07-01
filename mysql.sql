CREATE DATABASE CSD;

USE CSD ;
CREATE TABLE STUDENT(ID INT PRIMARY KEY, NAME VARCHAR(10), GPA INT);

SELECT*FROM STUDENT;
DESCRIBE STUDENT;
ALTER TABLE STUDENT ADD DEPARTMENT VARCHAR(10);
ALTER TABLE STUDENT DROP DEPARTMENT;
INSERT INTO STUDENT (ID,NAME) VALUES(3,"JEBA");
SELECT ID,NAME FROM STUDENT;
CREATE TABLE EMPLOYEE(EM_ID INT PRIMARY KEY,EM_NAME VARCHAR(20),JOB_DEP VARCHAR(30),SALARY INT);
INSERT INTO  EMPLOYEE
VALUES (1, 'John Doe', 'Manager', 5000);
INSERT INTO employee 
VALUES (2, 'Jane Smith',"tester",10000);
INSERT INTO employee 
VALUES
    (3, 'Michael Johnson', 'Developer', 6000),
    (4, 'Emily Anderson', 'Analyst', 4500),
    (5, 'David Lee', 'Designer', 4000);
    INSERT INTO employee
VALUES (6, 'Sarah Brown', 'Assistant', 3500);
INSERT INTO employee 
VALUES (7, 'Robert Wilson',  'HR', NULL);


select * from employee;
select * from employee where em_id=1;
show tables;
select em_id,em_name from employee where salary>=5000;
select * from employee where em_name like 'j%';
show databases;
use csd;
show tables;
UPDATE employee 
SET JOB_DEP='hr'
WHERE em_id=1;
;
select *from employee;
delete from employee where em_id=7; 

