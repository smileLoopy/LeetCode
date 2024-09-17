/* Write your PL/SQL query statement below */
SELECT TO_CHAR(trans_date, 'YYYY-MM') AS month
     , country as country
     , count(*) as trans_count
     , sum(case when state = 'approved' then 1 else 0 end) as approved_count
     , sum(amount) as trans_total_amount
     , sum(case when state = 'approved' then amount else 0 end) as approved_total_amount
  FROM transactions
GROUP BY TO_CHAR(trans_date, 'YYYY-MM'), country
