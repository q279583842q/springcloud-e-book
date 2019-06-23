package com.bobo.zuul.fallback;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

/**
 * 商品服务的服务降级的工具类
 * 
 * @author dengp
 *
 */
@Component
public class ProviderProductFallback implements ZuulFallbackProvider {

	@Override
	public ClientHttpResponse fallbackResponse() {
		// TODO Auto-generated method stub
		return new ClientHttpResponse() {
			
			/**
			 * 设置相关的header信息
			 */
			@Override
			public HttpHeaders getHeaders() {
				HttpHeaders header = new HttpHeaders();
				// 返回json数据
				MediaType mt = new MediaType("application","json",Charset.forName("utf-8"));
				header.setContentType(mt);
				return header;
			}
			/**
			 * 设置响应的内容
			 */
			@Override
			public InputStream getBody() throws IOException {
				
				return new ByteArrayInputStream("product服务不可用，请于管理员联系!".getBytes());
			}
			
			/**
			 * 返回状态码
			 */
			@Override
			public String getStatusText() throws IOException {
				// TODO Auto-generated method stub
				return this.getStatusCode().getReasonPhrase();
			}
			
			@Override
			public HttpStatus getStatusCode() throws IOException {
				// TODO Auto-generated method stub
				return HttpStatus.OK;
			}
			
			@Override
			public int getRawStatusCode() throws IOException {
				// TODO Auto-generated method stub
				return this.getStatusCode().value();
			}
			
			@Override
			public void close() {
				
			}
		};
	}

	/**
	 * 对哪个服务做降级处理
	 */
	@Override
	public String getRoute() {

		return "e-book-product";
	}

}
