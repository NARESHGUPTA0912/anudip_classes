-- // 1
Select e.emp_name, d.dept_name, e.salary 
from employees e Inner Join departments d On e.dept_id = d.dept_id;

-- // 2
Select c.customer_name, o.order_id, o.product, o.amount
from cutsomers c left join orders o On c.customers_id = o.customer_id;

-- // 3
Select c.course_name, s.student_name
from students s Right Join courses c On s.course_id = c.course_id;

-- // 4
select customer_id, customer_name, city 
from online_customers Union
select customer_id, customer_name, city 
from offline_customers;

-- // with dup.
select customer_id, customer_name, city 
from online_customers Union All
select customer_id, customer_name, city 
from offline_customers;

-- // 5
select e.emp_name, e.department, p.project_name 
from employees e Join projects p On e.emp_id = p.emp_id;