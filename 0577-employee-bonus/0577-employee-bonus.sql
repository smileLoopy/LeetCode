/* Write your PL/SQL query statement below */
select e.name
     , b.bonus
  from employee e
     , bonus b
where e.empId = b.empId(+)
  and (b.bonus < 1000 or b.bonus is null)
  