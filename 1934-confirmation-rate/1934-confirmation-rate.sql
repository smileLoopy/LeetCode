/* Write your PL/SQL query statement below */
 select s.user_id
      , case when count(c.user_id) = 0 then 0.00 
        else round((sum(case when c.action = 'confirmed' then 1 else 0 end) / count(c.user_id)),2) end as confirmation_rate
   from signups s
      , confirmations c
 where s.user_id = c.user_id(+)
group by s.user_id