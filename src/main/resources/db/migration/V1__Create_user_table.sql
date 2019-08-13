create table USER
 (
 	ID BIGINT auto_increment,
 	ACCOUNT_ID VARCHAR(100),
 	NAME VARCHAR(50),
 	TOKEN CHAR,
 	BIO varchar(256),
 	AVATAR_URL varchar(100),
 	GMT_CREATE BIGINT,
 	GMT_MODIFIED BIGINT,
 	constraint USER_PK
 		primary key (ID)
 );