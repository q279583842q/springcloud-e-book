package com.bobo.zuul.filter;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * 自定义网关过滤器
 * @author dengp
 *
 */
@Component
public class LogFilter extends ZuulFilter{
	
	private Logger logger = LoggerFactory.getLogger(LogFilter.class);

	/**
	 * 过滤方法
	 */
	@Override
	public Object run() {
		// 获取Request上下文
		RequestContext rc = RequestContext.getCurrentContext();
		HttpServletRequest request = rc.getRequest();
		logger.info("LogFilter .... 请求的路径是{},请求提交的方式是{}", request.getRequestURL().toString(),request.getMethod());
		return null;
	}

	/**
	 * 是否开启过滤:默认false
	 */
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * 多个过滤器中的执行顺序，数值越小，优先级越高
	 */
	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 过滤器的类型
	 */
	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
