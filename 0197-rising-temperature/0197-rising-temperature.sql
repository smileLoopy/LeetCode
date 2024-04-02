/* Write your PL/SQL query statement below */
select id
from (
    select id, 
           temperature, 
           recordDate,
           lag(temperature) over (order by to_date(w.recordDate, 'YYYY-MM-DD')) as prev_temperature,
           lag(to_date(w.recordDate, 'YYYY-MM-DD')) over (order by to_date(w.recordDate, 'YYYY-MM-DD')) as prev_date
    from weather w
)
where to_date(recordDate, 'YYYY-MM-DD') = prev_date + 1 and temperature > prev_temperature;
