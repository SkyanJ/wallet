/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : question

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 18/05/2023 22:26:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bill
-- ----------------------------
DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill`  (
  `user_id` int NOT NULL,
  `detail` decimal(10, 2) NULL DEFAULT NULL,
  `time` datetime NULL DEFAULT NULL,
  `bill_id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`bill_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bill
-- ----------------------------
INSERT INTO `bill` VALUES (1, -100.00, '2023-05-18 22:02:39', 1);
INSERT INTO `bill` VALUES (1, 20.00, '2023-05-18 22:02:51', 2);
INSERT INTO `bill` VALUES (1, -100.00, '2023-05-18 22:24:30', 3);
INSERT INTO `bill` VALUES (1, 20.00, '2023-05-18 22:24:34', 4);

SET FOREIGN_KEY_CHECKS = 1;
