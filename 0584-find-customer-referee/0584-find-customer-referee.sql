/* Write your PL/SQL query statement below */
select name as name
  from Customer
 where referee_id != 2
    or referee_id is null;