CREATE DATABASE  `book-order`;
USE `book-order`;
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
 `id` INT(10) NOT NULL AUTO_INCREMENT,
 `product_id` INT(10) NOT NULL DEFAULT '0' COMMENT '产品 ID',
 `price` INT(10) DEFAULT '0' COMMENT '价格',
 `user_id` INT(10) DEFAULT '0' COMMENT '用户账号 ID',
 `trade_id` INT(10) DEFAULT '0' COMMENT '交易号 ID',
 `trade_status` TINYINT(1) DEFAULT '0' COMMENT '支付状态 0=未支付 1=已支付',
 `deleted` TINYINT(4) UNSIGNED NOT NULL DEFAULT '0' COMMENT '删除标志，默认 0 不删除，1 删除',
 `create_time` datetime NOT NULL  COMMENT '创建时间',
 `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;