create table user
 (
 	id bigint auto_increment,
 	account_id varchar(100),
 	name varchar(50),
 	token char,
 	bio varchar(256),
 	avatar_url varchar(100),
 	gmt_create bigint,
 	gmt_modified bigint,
 	constraint user_pk
 		primary key (id)
 );