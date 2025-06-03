-- Question 1
SELECT COUNT(*) AS total_suppliers FROM suppliers;

-- Question 2
SELECT SUM(salary) AS total_salary FROM employees;

-- Question 3
SELECT MIN(unitprice) AS cheapest_price FROM products;

-- Question 4
SELECT AVG(unitprice) AS average_price FROM products;

-- Question 5
SELECT MAX(unitprice) AS most_expensive_price FROM products;

-- Question 6
SELECT supplierid, COUNT(*) AS number_of_items
FROM products
GROUP BY supplierid;

-- Question 7
SELECT categoryid, AVG(unitprice) AS average_price
FROM products
GROUP BY categoryid;

-- Question 8
SELECT supplierid, COUNT(*) AS number_of_items
FROM products
GROUP BY supplierid
HAVING COUNT(*) >= 5;

-- Question 9
SELECT productid, productname, 
       unitprice * unitsinstock AS inventory_value
FROM products
ORDER BY inventory_value DESC, productname;