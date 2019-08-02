## 学习Spring Boot 

## 资料
[Spring Guide文档](https://spring.io/guides)  
[Bootstrap 文档](https://v3.bootcss.com)   
[Github OAuth API Doc](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)  
[OKHttp Doc](https://square.github.io/okhttp/)            
[MySQL教程](https://www.runoob.com/mysql/mysql-tutorial.html)   
[Spring 使用文档](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)            
[Flyway](https://flywaydb.org/getstarted/firststeps/maven)  
[Lombok](https://projectlombok.org/) 使用时需要在IDEA中添加plugin Lombok  

 
 
 
 ## 工具
 [Visual Paradigm 画时序图](https://www.visual-paradigm.com/cn/)
 
 
 ## 快捷键
 alt + ins  快速生成set get方法    
 ctrl + E   切换到最近编辑的一个窗口
 
 
 
 ## 脚本
 ```sql
 create table USER
 (
 	ID int auto_increment,
 	ACCOUNT_ID VARCHAR(100),
 	NAME VARCHAR(50),
 	TOKEN CHAR,
 	GMT_CREATE BIGINT,
 	GMT_MODIFIED BIGINT,
 	constraint USER_PK
 		primary key (ID)
 );
```
```shell script
mvn flyway:migrate
```
 
