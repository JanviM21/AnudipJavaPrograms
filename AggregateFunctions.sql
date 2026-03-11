Enter password: **********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 18
Server version: 8.0.43 MySQL Community Server - GPL

Copyright (c) 2000, 2025, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| anp_d4848          |
| demo               |
| information_schema |
| janvi_db           |
| mysql              |
| performance_schema |
| prognozdb          |
| sqlquestions       |
| sys                |
+--------------------+
9 rows in set (0.00 sec)

mysql> use anp_d4848;
Database changed
mysql> CREATE TABLE Student (
    ->     id INT PRIMARY KEY,
    ->     name VARCHAR(10) NOT NULL,
    ->     address VARCHAR(10) NOT NULL,
    ->     age INT NOT NULL
    -> );
Query OK, 0 rows affected (0.03 sec)

mysql> DESC Student;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| id      | int         | NO   | PRI | NULL    |       |
| name    | varchar(10) | NO   |     | NULL    |       |
| address | varchar(10) | NO   |     | NULL    |       |
| age     | int         | NO   |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
4 rows in set (0.02 sec)

mysql> INSERT INTO Student VALUES (1, 'Amit', 'Mumbai', 21);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Student VALUES (2, 'Riya', 'Pune', 22);
Query OK, 1 row affected (0.00 sec)

mysql> INSERT INTO Student VALUES (3, 'Rahul', 'Nashik', 20);
Query OK, 1 row affected (0.00 sec)

mysql> INSERT INTO Student VALUES (4, 'Sneha', 'Thane', 23);
Query OK, 1 row affected (0.00 sec)

mysql> INSERT INTO Student VALUES (5, 'Janvi', 'Nagpur', 24);
Query OK, 1 row affected (0.00 sec)

mysql> Select * from Student;
+----+-------+---------+-----+
| id | name  | address | age |
+----+-------+---------+-----+
|  1 | Amit  | Mumbai  |  21 |
|  2 | Riya  | Pune    |  22 |
|  3 | Rahul | Nashik  |  20 |
|  4 | Sneha | Thane   |  23 |
|  5 | Janvi | Nagpur  |  24 |
+----+-------+---------+-----+
5 rows in set (0.00 sec)

mysql> SELECT SUM(age) AS Total_Age FROM Student;
+-----------+
| Total_Age |
+-----------+
|       110 |
+-----------+
1 row in set (0.00 sec)

mysql> SELECT AVG(age) AS Average_Age FROM Student;
+-------------+
| Average_Age |
+-------------+
|     22.0000 |
+-------------+
1 row in set (0.00 sec)

mysql> SELECT MIN(age) AS Minimum_Age FROM Student;
+-------------+
| Minimum_Age |
+-------------+
|          20 |
+-------------+
1 row in set (0.00 sec)

mysql> SELECT MAX(age) AS Maximum_Age FROM Student;
+-------------+
| Maximum_Age |
+-------------+
|          24 |
+-------------+
1 row in set (0.00 sec)

mysql> SELECT COUNT(age) AS Total_Students FROM Student;
+----------------+
| Total_Students |
+----------------+
|              5 |
+----------------+
1 row in set (0.00 sec)

mysql>