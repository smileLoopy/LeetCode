/* Write your PL/SQL query statement below */
select machine_id
     , round(avg(endTime - startTime),3) as processing_time
  from (
        select machine_id
             , process_id
             , min(case when activity_type = 'start' then timestamp end) as startTime
             , max(case when activity_type = 'end' then timestamp end) as endTime
          from activity
        group by machine_id, process_id
       ) x
group by machine_id
order by machine_id
