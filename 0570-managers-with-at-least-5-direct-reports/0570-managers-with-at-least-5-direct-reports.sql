/* Write your PL/SQL query statement below */
select name
  from (
      select e.name as name
           , count(e.id) as reportCount
        from employee e
           , (select managerId from employee) m
       where e.id = m.managerId 
       group by e.id, e.name
        )
where reportCount >= 5

