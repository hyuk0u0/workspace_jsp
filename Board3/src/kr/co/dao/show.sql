



select * from (select rownum rnum, num, title, writer, writeday, readcnt from (select * from board order by repRoot desc, repStep asc)) where rnum >= ? and rnum <= ?
select * from (select rownum rnum, num, title, writer, writeday, readcnt from (select * from board order by repRoot desc, repStep asc))  where rnum >= 10 and rnum <= 20
delete from board where num = 122