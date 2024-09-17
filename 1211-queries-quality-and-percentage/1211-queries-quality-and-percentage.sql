/* Write your PL/SQL query statement below */

select query_name
     , round(sum(rating / position) / count(*), 2) as quality
     , round(count(case when rating < 3 then 1 end) / count(*) * 100, 2) as poor_query_percentage
  from Queries 
 where query_name is not null
group by query_name
