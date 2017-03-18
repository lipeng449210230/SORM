/*
Navicat MySQL Data Transfer

Source Server         : lip
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : sorm

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2017-03-18 21:09:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `dname` varchar(40) NOT NULL,
  `address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '移动审批', '武汉');
INSERT INTO `dept` VALUES ('2', '工作流', '北京');
INSERT INTO `dept` VALUES ('3', '项目组', '上海');
