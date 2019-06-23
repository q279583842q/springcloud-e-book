package com.bobo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.pojo.Orders;
import com.bobo.pojo.Product;
import com.bobo.pojo.Trade;
import com.bobo.pojo.User;
import com.bobo.service.ConsumerOrderService;
import com.bobo.service.ConsumerProductService;
import com.bobo.service.ConsumerTradeService;
import com.bobo.service.ConsumerUserService;

/**
 * 创建订单
 * 
 * @author dengp
 *
 */
@RestController
public class ConsumerController {

	@Autowired
	private ConsumerOrderService orderService;

	@Autowired
	private ConsumerProductService productService;

	@Autowired
	private ConsumerTradeService tradeService;

	@Autowired
	private ConsumerUserService userService;

	/**
	 * 模拟内容： 登录 查看产品 下订单
	 *  1.测试登录 账号 admin admin 
	 *  2.查看所有产品列表 
	 *  3.选第一款产品，下订单
	 *  4.实现订单交易支付
	 *  5.查看所有的订单信息
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public List<Orders> createOrder() {
		// 测试登录 账号： 用户名：admin 密码：admin
		Integer userid = this.login();
		System.out.println(userid);
		// 查询所有商品
		List<Product> products = this.productService.findAll();
		
		  for (Product product : products) {
			  System.out.println(product.getName()); 
		  }
		 
		// 选第一款商品 下订单
		Product product = products.get(0);
		// 创建订单
		Orders orders = new Orders();
		// 订单ID
		Integer orderId = 1011;
		orders.setId(orderId);
		orders.setUserId(userid);
		orders.setProductId(product.getId());
		orders.setPrice(product.getPrice());
		orders.setCreateTime(new Date());
		// '删除标志，默认0不删除，1删除
		orders.setDeleted((byte) 0);
		// 调用Order服务持久化订单
		Integer oId = this.orderService.addOrder(orders);
		System.out.println(oId);

		// 订单的交易支付
		Trade trade = new Trade();
		trade.setUserId(userid);
		trade.setOrderId(oId);
		trade.setPrice(orders.getPrice());
		trade.setPayStatus((byte) 4);// '1 未付款 2 付款中 3 付款失败 4 付款完成'
		trade.setPayType((byte) 4); // '支付类型:1-支付宝支付，2-网银在线，3-银联，4-微信支付',
		trade.setGatewayPayNum(new Date().getTime() + "");// '网关支付流水号',
		trade.setGatewayPayPrice(orders.getPrice());
		trade.setGatewayPayTime(new Date());
		trade.setDeleted((byte) 0);
		this.tradeService.addTrade(trade);

		// 查询所有订单并返回
		List<Orders> list = this.orderService.findAll();

		return list;
	}

	/**
	 * 用户登录
	 */
	private Integer login() {
		String username = "admin";
		String password = "admin";
		User user = this.userService.login(username, password);
		if (user != null && user.getUserName().length() >= 0) {
			System.out.println("登录成功");
			return user.getId();
		}
		System.out.println("登录失败");
		return null;
	}
}
