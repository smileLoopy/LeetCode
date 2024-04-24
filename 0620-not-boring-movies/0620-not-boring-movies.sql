/* Write your PL/SQL query statement below */
select id
     , movie
     , description
     , rating
  from cinema
 where MOD(id, 2) = 1
   and description not in ('boring')
order by rating desc