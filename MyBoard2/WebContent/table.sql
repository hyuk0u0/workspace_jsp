
create table board(
num number(4) primary key,
id varchar2(21) references member(id),
title varchar2(81) not null,
content varchar2(3000),
readcnt number(4),
writeday date default sysdate,
money number(8) default 0,
category varchar2(21),
location varchar2(21),
likes number(4) default 0
);

create table member(
id varchar2(21) primary key,
pw varchar2(21) not null,
name varchar2(21) not null,
nickname varchar2(60) not null,
contact varchar2(11) not null,
location varchar2(21) not null,
birthdate number(8) not null,
gender varchar2(6) not null,
joinday date default sysdate
);

create table memberCopy(
id varchar2(21) primary key,
pw varchar2(21) not null,
name varchar2(21) not null,
nickname varchar2(60) not null,
contact varchar2(11) not null,
location varchar2(21) not null,
birthdate number(8) not null,
gender varchar2(6) not null,
joinday date default sysdate
);

create table likeList(
likeNum number(4) primary key,
num number(4) references board(num),
id varchar2(21) references member(id)
);

create table reply(
renum number(4) primary key,
num number(4) references board(num),
content varchar2(1000),
id varchar2(21) references member(id),
writeday date default sysdate,
repRoot  number(4),
repStep number(4),
repIndent number(4)
);

create table NoticeBoard(
num number(4) primary key,
id varchar2(21) references member(id),
title varchar2(81) not null,
content varchar2(3000),
readcnt number(4),
writeday date default sysdate,
money number(8) default 0,
category varchar2(21),
location varchar2(21)
);

create table attfile(
attNum number(4) primary key,
num number(4) references board(num),
attPath varchar2(1000)
);

create table board(
num number(4) primary key,
id varchar2(21) references member(id),
title varchar2(81) not null,
content varchar2(3000),
readcnt number(4),
writeday date default sysdate,
money number(8) default 0,
category varchar2(21),
location varchar2(21),
likes number(4) default 0,
visible number(1) default 1
);
