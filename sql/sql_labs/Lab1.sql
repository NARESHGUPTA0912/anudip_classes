
-- 1. Employee Department Salary
SELECT
    department,
    COUNT(*) AS employee_count,
    AVG(salary) AS average_salary
FROM employee
GROUP BY department;


-- 2. Departments with High Average Salary
SELECT
    department,
    AVG(salary) AS average_salary
FROM employee
GROUP BY department
HAVING AVG(salary) > 40000;


-- 3. Customer and Orders
SELECT
    c.customer_name,
    c.city,
    o.order_id,
    o.amount
FROM customer c
INNER JOIN orders o
    ON c.customer_id = o.customer_id;


-- 4. Total Purchase by Each Customer
SELECT
    c.customer_id,
    c.customer_name,
    SUM(o.amount) AS total_purchase
FROM customer c
INNER JOIN orders o
    ON c.customer_id = o.customer_id
GROUP BY 
    c.customer_id,
    c.customer_name
ORDER BY total_purchase DESC;


-- 5. Find Valuable Customers
SELECT
    c.customer_name,
    c.city,
    SUM(o.amount) AS total_amount_spent
FROM customer c
INNER JOIN orders o
    ON c.customer_id = o.customer_id
GROUP BY 
    c.customer_id,
    c.customer_name,
    c.city
HAVING SUM(o.amount) > 50000;