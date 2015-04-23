CREATE TABLE sys_area
(
	id INT(10) NOT NULL AUTO_INCREMENT ,
	parent_id INT(10) NOT NULL  ,
	parent_ids VARCHAR(2000) NOT NULL  ,
	NAME VARCHAR(100) NOT NULL  ,
	sort DECIMAL(10,0) NOT NULL  ,
	CODE VARCHAR(100)  ,
	TYPE CHAR(1)  ,
	PRIMARY KEY (id)
) ;

CREATE TABLE sys_menu
(
	id INT(10) NOT NULL AUTO_INCREMENT,
	parent_id INT(10) NOT NULL ,
	parent_ids VARCHAR(2000) NOT NULL ,
	NAME VARCHAR(100) NOT NULL,
	sort DECIMAL(10,0) NOT NULL ,
	href VARCHAR(2000) ,
	permission VARCHAR(200) ,
	PRIMARY KEY (id)
) ;

CREATE TABLE sys_office
(
	id INT(10) NOT NULL AUTO_INCREMENT,
	parent_id VARCHAR(64) NOT NULL ,
	parent_ids VARCHAR(2000) NOT NULL ,
	NAME VARCHAR(100) NOT NULL ,
	sort DECIMAL(10,0) ,
	area_id INT(10) NOT NULL ,
	CODE VARCHAR(100) ,
	TYPE CHAR(1) NOT NULL ,
	grade CHAR(1) NOT NULL ,
	USEABLE VARCHAR(64) ,
	PRIMARY_PERSON INT(10) ,
	PRIMARY KEY (id)
) ;

CREATE TABLE sys_user
(
	id INT NOT NULL AUTO_INCREMENT,
	company_id INT(10) NOT NULL ,
	office_id INT(10) NOT NULL ,
	login_name VARCHAR(100) NOT NULL ,
	PASSWORD VARCHAR(100) ,
	NAME VARCHAR(100) NOT NULL ,
	user_type CHAR(1) ,
	login_flag VARCHAR(64) ,
	PRIMARY KEY (id)
) ;

CREATE TABLE sys_user_role
(	
	id INT(10) NOT NULL AUTO_INCREMENT,
	user_id INT(10) NOT NULL ,
	role_id INT(10) NOT NULL ,
	PRIMARY KEY (id)
);

CREATE TABLE sys_role_menu
(
	id INT(10) NOT NULL AUTO_INCREMENT,
	role_id INT(10) NOT NULL ,
	menu_id INT(10) NOT NULL ,
	PRIMARY KEY (id)
) ;


CREATE TABLE sys_role_office
(
	id INT(10) NOT NULL AUTO_INCREMENT,
	role_id INT(10) NOT NULL ,
	office_id INT(10) NOT NULL ,
	PRIMARY KEY (id)
) ;

CREATE TABLE sys_role
(
	id INT(10) NOT NULL AUTO_INCREMENT,
	office_id INT(10) NOT NULL ,
	NAME VARCHAR(100) NOT NULL ,
	role_type VARCHAR(255) ,
	data_scope CHAR(1) ,
	useable VARCHAR(64) ,
	PRIMARY KEY (id)
) ;
