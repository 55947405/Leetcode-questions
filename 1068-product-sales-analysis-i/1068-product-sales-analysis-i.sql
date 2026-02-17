select product_name,year,price
from Sales as st
left join
Product as p
on 
st.product_id = p.product_id
