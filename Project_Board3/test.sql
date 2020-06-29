
select * from board
select * from reply order by renum  desc
insert into reply(reNum, num, content, id, repRoot, repStep, repIndent) values (1,1,'11',null,1,0,0)


insert into reply (renum, num, id, content, writeday, repRoot, repStep, repIndent) values (47,7,null,null,null,43,1,1);

select * from (select rownum rnum, renum, num, content, id, writeday, repIndent, reproot, repstep from (select * from REPLY where num = 11 order by writeday desc, repRoot asc, repStep asc))


select * from (select rownum rnum, renum, num, content, id, writeday, repIndent, reproot, repstep,orgnum from (select * from REPLY where num = 17 order by  repRoot asc, repStep asc))
alter table reply add orgnum number(4) default 0;
ALTER TABLE test2 ADD address varchar2(100);
select repstep from reply where orgnum = 132

select * from 
(select rownum rnum, num, title,id, content, visible, writeday, money,category,location, readcnt from 
(select * from board where visible=1 order by num desc)
)
where rnum>=1 and rnum <=10

alter table reply add orgnum number(4) default 0
tc

select * from (select * from board where visible = 1 order by num desc) where title like '%2%' or content like '%2%'
select * from member
"select * from (select rownum rnum, num, title,id, content, visible, writeday, money,category,location, readcnt from (select * from (select * from board where visible=? order by num desc) where title like ? or content like ? ) ) where rnum>=? and rnum <=? ";

alter table reply add orgnum number(4) default 0
asasas
tl
select * from (select rownum rnum,num,id,title,writeday,money,category,location,readcnt,likes from (select*from board where writeday>sysdate-2 and visible = 1 order by likes Desc)) where rownum<18

select * from (select * from board where visible = 1 order by num desc) where title like '%1%' or location like '%1%'

"select * from (select rownum rnum, num, title,id, content, visible, writeday, money,category,location, readcnt from (select * from (select * from board where visible=? order by num desc)where title like ? or location like ?)) where rnum>=? and rnum <=?";



select * from board where  keyField  like '%2%' and visible = 1 order by num desc;

"select * from (select rownum rnum, num, title,id, content, visible, writeday, money,category,location, readcnt from (select * from (select * from board where visible=? order by num desc) where "+keyField+ "like ?)) where rnum>=? and rnum <=?";

insert into board 

select count(num) from board
title_content
"select count(num) from (select * from board where visible=? order by num desc) where title like ? or content like ?"

title_location
"select count(num) from (select * from board where visible=? order by num desc) where title like ? or location like ?";

"select count(num) from (select * from board where visible=? order by num desc) where 	"+keyField+ " like ?";


select * from ( select rownum rnum, num, title,id, writeday, money,category,location, readcnt,likes from ( select * from board where visible=? and location = ? order by num desc)) where rnum>=? and rnum <=?

select * from ( select rownum rnum, num, title,id, writeday, money,category,location, readcnt,likes from ( select * from board where visible=1 and location = '서울' and category = '가구_가전' order by num desc)) where rnum>=1 and rnum <=10
"select * from ( select rownum rnum, num, title,id, writeday, money,category,location, readcnt,likes from ( select * from board where visible=? and location = ? and category = ? order by num desc)) where rnum>=? and rnum <=?"
