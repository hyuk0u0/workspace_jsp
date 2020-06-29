select * from 
(select rownum rnum, num, title,id, content, visible, writeday, money,category,location, readcnt from 
(select * from board where visible=1 order by num desc)
)
where rnum>=1 and rnum <=10


tc

select * from (select * from board where visible = 1 order by num desc) where title like '%2%' or content like '%2%'


"select * from (select rownum rnum, num, title,id, content, visible, writeday, money,category,location, readcnt from (select * from (select * from board where visible=? order by num desc) where title like ? or content like ? ) ) where rnum>=? and rnum <=? ";


asasas
tl

select * from (select * from board where visible = 1 order by num desc) where title like '%1%' or location like '%1%'

"select * from (select rownum rnum, num, title,id, content, visible, writeday, money,category,location, readcnt from (select * from (select * from board where visible=? order by num desc)where title like ? or location like ?)) where rnum>=? and rnum <=?";



select * from board where  keyField  like '%2%' and visible = 1 order by num desc;

"select * from (select rownum rnum, num, title,id, content, visible, writeday, money,category,location, readcnt from (select * from (select * from board where visible=? order by num desc) where "+keyField+ "like ?)) where rnum>=? and rnum <=?";



select count(num) from board
title_content
"select count(num) from (select * from board where visible=? order by num desc) where title like ? or content like ?"

title_location
"select count(num) from (select * from board where visible=? order by num desc) where title like ? or location like ?";

"select count(num) from (select * from board where visible=? order by num desc) where 	"+keyField+ " like ?";