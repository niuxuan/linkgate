#CREATE DATABASE linkgate;

use linkgate;

CREATE TABLE t_linkmapping(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
url varchar(1000) not null,
code varchar(20) not null,
bizGroup int not null default 0,
tag varchar(50),
createtime datetime
)

