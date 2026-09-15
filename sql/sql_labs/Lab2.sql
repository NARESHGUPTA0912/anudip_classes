-- 1. Employees Earning More Than Average
SELECT 
    emp_id,
    emp_name,
    department,
    salary
FROM employee
WHERE salary > (
    SELECT AVG(salary)
    FROM employee
);


-- 2. Highest Paid Employee
SELECT 
    emp_name,
    department,
    salary
FROM employee
WHERE salary = (
    SELECT MAX(salary)
    FROM employee
);


-- 3. Products Costlier Than Average
SELECT 
    product_id,
    product_name,
    category,
    price
FROM product
WHERE price > (
    SELECT AVG(price)
    FROM product
);


-- 4. Employees from a Particular Department
SELECT 
    emp_id,
    emp_name,
    department_id,
    salary
FROM employee
WHERE department_id = (
    SELECT department_id
    FROM department
    WHERE department_name = 'IT'
);


-- 5. Second Highest Salary
SELECT 
    emp_name,
    department,
    salary
FROM employee
WHERE salary = (
    SELECT MAX(salary)
    FROM employee
    WHERE salary < (
        SELECT MAX(salary)
        FROM employee
    )
);