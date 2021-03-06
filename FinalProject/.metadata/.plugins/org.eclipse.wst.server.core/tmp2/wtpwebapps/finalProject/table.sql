DROP TABLE IF EXISTS tblMember;
/* 회원가입시 회원정보를 탐는 테이블 */
CREATE TABLE `tblMember` ( 
  `id` char(20) NOT NULL,
  `pwd` char(20) NOT NULL,
  `name` char(20) NOT NULL,
  `gender` char(1) NOT NULL,
  `birthday` char(6) NOT NULL,
  `email` char(30) NOT NULL,
  `zipcode` char(5) NOT NULL,
  `address` char(50) NOT NULL,
  `hobby` char(5) NOT NULL,
  `job` char(20) NOT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS tblZipcode;
/* 주소정보를 담고있는 테이블 */
CREATE TABLE `tblZipcode` ( 
  `zipcode` char(5) NOT NULL,
  `area1` char(10) DEFAULT NULL,
  `area2` char(20) DEFAULT NULL,
  `area3` char(100) DEFAULT NULL
);

DROP TABLE IF EXISTS tblBoard;

CREATE TABLE `tblBoard` (
	`num`               int(11)              NOT NULL  auto_increment  ,
	`name`              varchar(20)                    ,
	`subject`           varchar(50)                    ,
	`content`           text                           ,
	`pos`                smallint(7) unsigned           ,
	`ref`               smallint(7)                    ,
	`depth`             smallint(7) unsigned           ,
	`regdate`          date                           ,
	`pass`              varchar(15)                    ,
	`ip`                  varchar(15)                    ,
	`count`             smallint(7) unsigned           ,
	`filename`         varchar(30)                    ,
	`filesize`           int(11)                        ,
	PRIMARY KEY ( `num` )
);

insert tblBoard(name,content,subject,ref,pos,depth,regdate,pass,count,ip,filename,filesize)
values('aaa', 'bbb', 'ccc', 0, 0, 0, now(), '1111',0, '127.0.0.1', null, 0)