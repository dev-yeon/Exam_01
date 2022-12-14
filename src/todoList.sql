/* 12�� 13��(ȭ) 43�� 1�� ������ DB ���� */
DROP TABLE todolist;
DROP TABLE personal;
DROP SEQUENCE todolist_seq;


-- personal ���̺� �����Ͻÿ� (5��)
-- Code Here

DROP TABLE personal;
CREATE TABLE personal (
        email VARCHAR2(20) PRIMARY KEY,
        passwd VARCHAR2(20)NOT NULL,
        usrname VARCHAR2(20) NOT NULL
);


-- todolist ���̺� �����Ͻÿ� (5��)
-- Code Here
DROP TABLE todolist;
CREATE TABLE todolist (
        seqno NUMBER PRIMARY KEY,
        email VARCHAR2(20)  NOT NULL REFERENCES  personal(email) ON DELETE CASCADE,
        regdate DATE default sysdate,
        todo VARCHAR2(3000) default '���� ����',
        importance VARCHAR2(10) CHECK (importance IN('����','����','����')),
        categories CHAR(6) default '����' CHECK (categories IN('����', 'ȸ��'))
);



-- todolist_seq ������ ��ü�� �����Ͻÿ� (2��)
-- Code Here

DROP SEQUENCE todolist_seq;
CREATE SEQUENCE todolist_seq;

ROLLBACK;

