/* Write your PL/SQL query statement below */
select r.contest_id
     , round(count(r.user_id) * 100 / (select count(user_id) from users), 2) as percentage
  from users u
     , register r
 where u.user_id = r.user_id
group by contest_id
order by percentage desc, contest_id
