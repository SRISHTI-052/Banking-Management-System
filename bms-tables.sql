create database bankmanagementsystem;

use bankmanagementsystem;

create table signup(formNumber varchar(20), name varchar(20),Father_name varchar(20),Date_Of_Birth varchar(20),Gender varchar(20),Email varchar(30),Marital varchar(20),Address varchar(50),City varchar(20),State varchar(20),PinCode varchar(20));

create table signuptwo(formNumber varchar(20), religion varchar(20), category varchar(20), income varchar(20), education varchar(20), occupation varchar(20), pan varchar(20), adhar varchar(20), seniorcitizen varchar(20), existingaccount varchar(20));

create table signupthree( formNumber varchar(20), accountType varchar(40), cardNumber varchar(25), pin varchar(10), facilities varchar(200));

create table login( formNumber varchar(20), cardNumber varchar(25), pin varchar(10));

create table bank(pin varchar(20), date varchar(50), type varchar(20), amount varchar(10));

show tables;

select * from signup;
select * from signuptwo;
select * from signupthree;
select * from login;
select * from bank;