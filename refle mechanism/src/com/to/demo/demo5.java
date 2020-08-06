package com.to.demo;

import java.util.Date;

import com.to.entity.zj_articles;

/**
 * 
 * Test refle Mechanism Demo5
 * 
 * @author To be happy oh
 *
 */
public class demo5 {
	
	/**
	 * @param args  参数
	 * @throws Exception  这里的话就使用异常抛出了，实际开发中，必须使用异常处理
	 */
	public static void main(String[] args) throws Exception {
		
		// 1、 获取类对象
		Class<?> obj = Class.forName("com.to.entity.zj_articles");
		
		// 2、实例化对象，这里需要给对象进行强制转换
		zj_articles zj = (zj_articles) obj.newInstance();
		
		
		// 3、属性赋值
		zj.setArticle_id(1); // 设置 ID
		zj.setArticle_date(new Date(System.currentTimeMillis())); // 设置时间

		
		// 4、输出对象信息
		System.out.println(zj);
	}

}
