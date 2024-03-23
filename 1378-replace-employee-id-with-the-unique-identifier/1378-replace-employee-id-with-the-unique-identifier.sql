/* Write your PL/SQL query statement below */
select eu.unique_id
     , e.name
  from EmployeeUNI eu
     , Employees e
 where e.id = eu.id (+)