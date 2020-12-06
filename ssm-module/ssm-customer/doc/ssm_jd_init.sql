#创建用户表
use ssm_jd;
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `user`;

CREATE TABLE user (
  id BIGINT(20) PRIMARY KEY NOT NULL COMMENT '主键',
  name VARCHAR(30) DEFAULT NULL COMMENT '姓名',
  age INT(11) DEFAULT NULL COMMENT '年龄',
  email VARCHAR(50) DEFAULT NULL COMMENT '邮箱',
  manager_id BIGINT(20) DEFAULT NULL COMMENT '直属上级id',
  create_time DATETIME DEFAULT NULL COMMENT '创建时间',
  CONSTRAINT manager_fk FOREIGN KEY (manager_id)
    REFERENCES user (id)
) ENGINE=INNODB CHARSET=UTF8;

#初始化数据：
INSERT INTO user (id, name, age, email, manager_id, create_time)
VALUES (1087982257332887553, '大boss', 40, 'boss@baomidou.com', NULL, '2019-01-11 14:20:20'),
       (2088248166370832385, '王1', 25, 'wtf@baomidou.com', 1087982257332887553
       , '2019-02-05 11:12:22'),
       (3088250446457389058, '李2', 25, 'lyw@baomidou.com', 1088248166370832385
       , '2019-02-14 08:31:16'),
       (4094590409767661570, '张3', 25, 'zjq@baomidou.com', 1088248166370832385
       , '2019-01-14 09:15:15'),
       (5088248166370832385, '王4', 25, 'wtf@baomidou.com', 1087982257332887553
       , '2019-02-05 11:12:22'),
       (6088250446457389058, '李5', 25, 'lyw@baomidou.com', 1088248166370832385
       , '2019-02-14 08:31:16'),
       (7094590409767661570, '张6', 25, 'zjq@baomidou.com', 1088248166370832385
       , '2019-01-14 09:15:15'),
       (8088248166370832385, '王7', 25, 'wtf@baomidou.com', 1087982257332887553
       , '2019-02-05 11:12:22'),
       (9088250446457389058, '李8', 28, 'lyw@baomidou.com', 1088248166370832385
       , '2019-02-14 08:31:16'),
       (1194590409767661570, '张9', 25, 'zjq@baomidou.com', 1088248166370832385
       , '2019-01-14 09:15:15'),
       (1288248166370832385, '王10', 25, 'wtf@baomidou.com', 1087982257332887553
       , '2019-02-05 11:12:22'),
       (1388250446457389058, '李11', 25, 'lyw@baomidou.com', 1088248166370832385
       , '2019-02-14 08:31:16'),
       (1494590409767661570, '张12', 31, 'zjq@baomidou.com', 1088248166370832385
       , '2019-01-14 09:15:15'),
       (1594592041087729666, '刘13', 32, 'lhm@baomidou.com', 1088248166370832385
       , '2019-01-14 09:48:16')

       (1688250446457389058, '李14', 25, 'lyw@baomidou.com', 1088248166370832385
       , '2019-02-14 08:31:16'),
       (1794590409767661570, '张15', 25, 'zjq@baomidou.com', 1088248166370832385
       , '2019-01-14 09:15:15'),
       (1894590409767661570, '张16', 25, 'zjq@baomidou.com', 1088248166370832385
       , '2019-01-14 09:15:15')

       ;