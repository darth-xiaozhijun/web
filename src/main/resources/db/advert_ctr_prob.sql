/*
Navicat MySQL Data Transfer

Source Server         : 本地数据库
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : beifeng

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2019-10-17 20:04:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for advert_ctr_prob
-- ----------------------------
DROP TABLE IF EXISTS `advert_ctr_prob`;
CREATE TABLE `advert_ctr_prob` (
  `id` varchar(50) collate utf8_bin NOT NULL,
  `openId` varchar(50) collate utf8_bin default NULL,
  `data` varchar(255) collate utf8_bin default NULL COMMENT '传入或返回的字符串JSON',
  `flag` int(1) NOT NULL COMMENT '1-传入数据标记，0-返回数据标记',
  `at_created` datetime NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
