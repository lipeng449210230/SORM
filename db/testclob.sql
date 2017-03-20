/*
Navicat MySQL Data Transfer

Source Server         : lip
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : sorm

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2017-03-20 21:10:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for testclob
-- ----------------------------
DROP TABLE IF EXISTS `testclob`;
CREATE TABLE `testclob` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `resume` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
