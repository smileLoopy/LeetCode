/* Write your PL/SQL query statement below */
select x.student_id
     , min(x.student_name) as student_name
     , y.subject_name
     , (select count(*)
          from examinations z
         where z.student_id = x.student_id
           and z.subject_name = y.subject_name) as attended_exams
  from students x
     , subjects y
group by x.student_id, y.subject_name
order by x.student_id, y.subject_name