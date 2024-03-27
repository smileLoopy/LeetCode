/* Write your PL/SQL query statement below */
select b.product_name
     , a.year
     , a.price
  from sales a
     , product b 
 where a.product_id = b.product_id 