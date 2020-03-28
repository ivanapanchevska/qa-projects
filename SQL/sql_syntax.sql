# SELECT

SELECT * FROM customers WHERE contacttitle = "sales agent";

SELECT * FROM customers WHERE region <> "(NULL)";

SELECT unitprice, quantityperunit FROM products WHERE discontinued=0;

SELECT productname FROM products WHERE unitsinstock=0;

SELECT * FROM orders WHERE shipvia=1;

SELECT * FROM ORDERs WHERE shipvia=2;

SELECT * FROM orders WHERE shipvia=3;


# AND/OR, LIKE, BETWEEN, IN


SELECT * FROM `order details` WHERE unitprice BETWEEN 14 AND 50;

SELECT * FROM `order details` WHERE quantity BETWEEN 20 AND 45;

SELECT * FROM `order details` WHERE unitprice BETWEEN 14 AND 50 or quantity BETWEEN 20 AND 45; 

SELECT * FROM `order details` WHERE productid LIKE "3%";

SELECT * FROM `order details` WHERE productid LIKE "5_%";

SELECT * FROM `order details` WHERE productid LIKE "_";

SELECT * FROM `order details` WHERE (unitprice BETWEEN 14 AND 50 or quantity not BETWEEN 20 AND 45) AND productid LIKE "2%";

SELECT * FROM customers WHERE country IN ("germany", "france", "spain"); 

SELECT * FROM customers WHERE country IN ("germany", "france", "spain") AND city NOT IN ("Lyon", "Paris", "Madrid", "Berlin");


# MIN/MAX, AVG/COUNT


SELECT MIN(quantity) FROM `order details` WHERE unitprice BETWEEN 30 AND 50;

SELECT MIN(unitprice) FROM `order details` WHERE discount= "0.15";

SELECT MAX(freight) FROM orders WHERE shipcity IN("Madrid", "Boise", "Graz");

SELECT MAX(unitprice) FROM `order details`;

SELECT MAX(quantity) FROM `order details`;

SELECT (MAX(unitprice) * MAX(quantity)) FROM `order details`;

SELECT (min(unitprice) * min(quantity)) FROM `order details`;

SELECT AVG(freight) FROM orders WHERE customerid LIKE "a%";

SELECT COUNT(customerid) FROM customers WHERE country IN ("uk", "usa");

SELECT COUNT(customerid) FROM customers WHERE country not IN ("uk", "usa");


# INNER JOIN, LEFT/RIGHT

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

SELECT * FROM (select customers.CompanyName, customers.ContactName, customers.CustomerID, orders.OrderID
FROM customers
LEFT JOIN orders ON customers.CustomerID=orders.CustomerID
UNION
select customers.CompanyName, customers.ContactName, customers.CustomerID, orders.OrderID
FROM customers
right JOIN orders ON customers.CustomerID=orders.CustomerID) AS a;

SELECT * FROM (select customers.CompanyName, customers.ContactName, orders.OrderID
FROM customers
LEFT JOIN orders ON customers.CustomerID=orders.CustomerID
UNION
select customers.CompanyName, customers.ContactName, orders.OrderID
FROM customers
right JOIN orders ON customers.CustomerID=orders.CustomerID) AS a;