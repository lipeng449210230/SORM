/*
Navicat MySQL Data Transfer

Source Server         : lip
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : sorm

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2017-03-18 21:09:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `empname` varchar(40) NOT NULL,
  `salary` double DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `age` int(5) DEFAULT NULL,
  `deptid` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES ('1', 'lip', '30000', '1991-01-02', '20', '1');
INSERT INTO `emp` VALUES ('2', 'tp', '300000', '1994-01-02', '16', '2');
INSERT INTO `emp` VALUES ('3', 'ch', '40000', '1991-01-02', '20', '3');
