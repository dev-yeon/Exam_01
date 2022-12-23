/* 12월 13일(화) 43기 1차 역량평가 DB 설계 */
DROP TABLE todolist;
DROP TABLE personal;
DROP SEQUENCE todolist_seq;


-- personal 테이블 생성하시오 (5점)
-- Code Here
--drop table personal;
  Create table personal
 (
 email varchar2(20) primary key,
 passwd varchar2(20) not null,
 usrname varchar2(20) not null
 );
 

 


-- todolist 테이블 생성하시오 (5점)
-- delete cascade, 잘 모르겠습니다.
  Create table todolist
 (
 seqno number primary key,
email varchar2(20) references personal(email) on delete cascade not null,
 regdate date default sysdate,
 todo varchar2(3000) default '할일 없음',
 importance varchar2(10) check(importance in('높음', '보통','낮음')),
 categories char(6)  default '개인' check(categories in ('개인' , '회사'))
 );


-- todolist_seq 시퀀스 객체를 생성하시오 (2점)
-- Code Here
--drop sequence todlist_seq;
create sequence todolist_seq;

 


