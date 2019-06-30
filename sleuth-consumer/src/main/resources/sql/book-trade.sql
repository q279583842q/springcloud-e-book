CREATE DATABASE;
USE `book-trade`;
DROP TABLE IF EXISTS `trade`;
CREATE TABLE `trade` (
 `id` INT(10) NOT NULL AUTO_INCREMENT COMMENT 'IID',
 `order_id` INT(10) NOT NULL COMMENT '订单 ID',
 `user_id` INT(10) NOT NULL COMMENT '用户 ID',
 `price` INT(10) NOT NULL COMMENT '支付价',
 `pay_status` TINYINT(4) NOT NULL COMMENT '1 未付款 2 付款中 3 付款失败 4 付款完成',
 `pay_type` TINYINT(4) NOT NULL COMMENT '支付类型:1-支付宝支付，2-网银在线，3-银联，4-微信支付',
 `gateway_pay_num` VARCHAR(30) DEFAULT NULL COMMENT '网关支付流水号',
 `gateway_pay_time` DATETIME DEFAULT NULL COMMENT '网关支付时间',
 `gateway_pay_price` INT(10) NOT NULL DEFAULT '0' COMMENT '网关实际支付金额',
 `deleted` TINYINT(4) UNSIGNED NOT NULL DEFAULT '0' COMMENT '删除标志，默认 0 不删除，1 删除',
 `create_time` datetime NOT NULL  COMMENT '创建时间',
 `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
 PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='交易';