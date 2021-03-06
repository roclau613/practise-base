建表：
CREATE TABLE students
(sno VARCHAR(3) NOT NULL,
sname VARCHAR(4) NOT NULL,
ssex VARCHAR(2) NOT NULL,
sbirthday DATETIME,
class VARCHAR(5));

CREATE TABLE courses
(cno VARCHAR(5) NOT NULL,
cname VARCHAR(10) NOT NULL,
tno VARCHAR(10) NOT NULL)

CREATE TABLE scores
(sno VARCHAR(3) NOT NULL,
cno VARCHAR(5) NOT NULL,
degree NUMERIC(10, 1) NOT NULL);

CREATE TABLE teachers
(tno VARCHAR(3) NOT NULL,
tname VARCHAR(4) NOT NULL, tsex VARCHAR(2) NOT NULL,
tbirthday DATETIME NOT NULL, prof VARCHAR(6),
depart VARCHAR(10) NOT NULL);

create table grade(low number(3,0),upp number(3),rank char(1));

插入数据：
INSERT INTO STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) VALUES (108 ,‘曾华’ ,‘男’ ,‘1977-09-01’,95033);
INSERT INTO STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) VALUES (105 ,‘匡明’ ,‘男’ ,‘1975-10-02’,95031);
INSERT INTO STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) VALUES (107 ,‘王丽’ ,‘女’ ,‘1976-01-23’,95033);
INSERT INTO STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) VALUES (101 ,‘李军’ ,‘男’ ,‘1976-02-20’,95033);
INSERT INTO STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) VALUES (109 ,‘王芳’ ,‘女’ ,‘1975-02-10’,95031);
INSERT INTO STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) VALUES (103 ,‘陆君’ ,‘男’ ,‘1974-06-03’,95031);

INSERT INTO COURSES(CNO,CNAME,TNO)VALUES (‘3-105’ ,‘计算机导论’,825);
INSERT INTO COURSES(CNO,CNAME,TNO)VALUES (‘3-245’ ,‘操作系统’ ,804);
INSERT INTO COURSES(CNO,CNAME,TNO)VALUES (‘6-166’ ,‘数据电路’ ,856);
INSERT INTO COURSES(CNO,CNAME,TNO)VALUES (‘9-888’ ,‘高等数学’ ,100);

INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (103,‘3-245’,86);
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (105,‘3-245’,75);
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (109,‘3-245’,68);
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (103,‘3-105’,92);
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (105,‘3-105’,88);
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (109,‘3-105’,76);
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (101,‘3-105’,64);
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (107,‘3-105’,91);
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (108,‘3-105’,78);
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (101,‘6-166’,85);
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (107,‘6-106’,79);
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (108,‘6-166’,81);

INSERT INTO TEACHERS(TNO,TNAME,TSEX,TBIRTHDAY,PROF,DEPART) VALUES (804,‘李诚’,‘男’,‘1958-12-02’,‘副教授’,‘计算机系’);
INSERT INTO TEACHERS(TNO,TNAME,TSEX,TBIRTHDAY,PROF,DEPART) VALUES (856,‘张旭’,‘男’,‘1969-03-12’,‘讲师’,‘电子工程系’);
INSERT INTO TEACHERS(TNO,TNAME,TSEX,TBIRTHDAY,PROF,DEPART) VALUES (825,‘王萍’,‘女’,‘1972-05-05’,‘助教’,‘计算机系’);
INSERT INTO TEACHERS(TNO,TNAME,TSEX,TBIRTHDAY,PROF,DEPART) VALUES (831,‘刘冰’,‘女’,‘1977-08-14’,‘助教’,‘电子工程系’);

insert into grade values(90,100,’A’);
insert into grade values(80,89,’B’);
insert into grade values(70,79,’C’);
insert into grade values(60,69,’D’);
insert into grade values(0,59,’E’);

题目：
Subject1：查询Student表中的所有记录的Sname、Ssex和Class列。
Subject2：查询教师所有的单位即不重复的Depart列。
Subject3：查询Student表的所有记录。
Subject4：查询Score表中成绩在60到80之间的所有记录。
Subject5：查询Score表中成绩为85，86或88的记录。
Subject6：查询Student表中“95031”班或性别为“女”的同学记录。
Subject7：以Class降序查询Student表的所有记录。
Subject8：以Cno升序、Degree降序查询Score表的所有记录。
Subject9：查询“95031”班的学生人数。
Subject10：查询Score表中的最高分的学生学号和课程号。
Subject11：查询‘3-105’号课程的平均分。
Subject12：查询Score表中至少有5名学生选修的并以3开头的课程的平均分数。
Subject13：查询最低分大于70，最高分小于90的Sno列。
Subject14：查询所有学生的Sname、Cno和Degree列。
Subject15：查询所有学生的Sno、Cname和Degree列。
Subject16：查询所有学生的Sname、Cname和Degree列。
Subject17：查询“95033”班所选课程的平均分。
Subject18：查询选修“3-105”课程的成绩高于“109”号同学成绩的所有同学的记录。
Subject19：查询score中选学一门以上课程的同学中分数为非最高分成绩的记录。
Subject20：查询成绩高于学号为“109”、课程号为“3-105”的成绩的所有记录。
Subject21：查询和学号为108的同学同年出生的所有学生的Sno、Sname和Sbirthday列。
Subject22：查询“张旭“教师任课的学生成绩。
Subject23：查询选修某课程的同学人数多于5人的教师姓名。
Subject24：查询95033班和95031班全体学生的记录。
Subject25：查询存在有85分以上成绩的课程Cno.
Subject26：查询出“计算机系“教师所教课程的成绩表。
Subject27：查询“计算机系”与“电子工程系“不同职称的教师的Tname和Prof。
Subject28：查询选修编号为“3-105“课程且成绩至少高于选修编号为“3-245”的同学的Cno、Sno和Degree,并按Degree从高到低次序排序。
Subject29：查询选修编号为“3-105”且成绩高于选修编号为“3-245”课程的同学的Cno、Sno和Degree.
Subject30：查询所有教师和同学的name、sex和birthday.
Subject31：查询所有“女”教师和“女”同学的name、sex和birthday.
Subject32：查询成绩比该课程平均成绩低的同学的成绩表。
Subject33：查询所有任课教师的Tname和Depart.
Subject34：查询所有未讲课的教师的Tname和Depart.
Subject35： 查询至少有2名男生的班号。
Subject36：查询Student表中不姓“王”的同学记录。
Subject37：查询Student表中每个学生的姓名和年龄。
Subject38：查询Student表中最大和最小的Sbirthday日期值。
Subject39：以班号和年龄从大到小的顺序查询Student表中的全部记录。
Subject40：查询“男”教师及其所上的课程。
Subject41：查询最高分同学的Sno、Cno和Degree列。
Subject42：查询和“李军”同性别的所有同学的Sname.
Subject43：查询和“李军”同性别并同班的同学Sname.
Subject44：查询所有选修“计算机导论”课程的“男”同学的成绩表
