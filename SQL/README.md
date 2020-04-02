# SQL Syntax

All mandatory SQL syntax queries are tried here.

northwindmysqldatabase.sql is playground database, where i tried all SQL queries
sql_syntax.sql is example of trained SQL queries

Example of common used SQL queries:

```
#Select with conditions

SELECT * FROM customers WHERE contacttitle = "sales agent";

SELECT unitprice, quantityperunit FROM products WHERE discontinued=0;

SELECT productname FROM products WHERE unitsinstock=0;



#Select AND/OR, Between, IN

SELECT * FROM `order details` WHERE unitprice BETWEEN 14 AND 50;

SELECT * FROM `order details` WHERE unitprice BETWEEN 14 AND 50 or quantity BETWEEN 20 AND 45; 

SELECT * FROM `order details` WHERE productid LIKE "5_%";

SELECT * FROM `order details` WHERE (unitprice BETWEEN 14 AND 50 or quantity not BETWEEN 20 AND 45) AND productid LIKE "2%";

SELECT * FROM customers WHERE country IN ("germany", "france", "spain") AND city NOT IN ("Lyon", "Paris", "Madrid", "Berlin");



# Select MIN/MAX, AVG/COUNT

SELECT MIN(quantity) FROM `order details` WHERE unitprice BETWEEN 30 AND 50;

SELECT MAX(freight) FROM orders WHERE shipcity IN("Madrid", "Boise", "Graz");

SELECT AVG(freight) FROM orders WHERE customerid LIKE "a%";

SELECT COUNT(customerid) FROM customers WHERE country IN ("uk", "usa");



# Select Inner Join Left/Right

SELECT orders.OrderID, orders.CustomerID, orders.EmployeeID, `order details`.productid, `order details`.quantity
FROM orders
join `order details` ON orders.OrderID=`order details`.orderid;

SELECT customers.CompanyName, orders.OrderID
FROM customers
LEFT JOIN orders ON customers.CustomerID=orders.CustomerID
order BY customers.CompanyName;

SELECT orders.OrderID, orders.OrderDate, employees.EmployeeID, employees.LastName, employees.FirstName
FROM orders
RIGHT JOIN employees ON orders.EmployeeID=employees.EmployeeID
order BY employees.EmployeeID;
```