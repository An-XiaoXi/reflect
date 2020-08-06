package com.to.demo;

import java.lang.reflect.Field;

/**
 * 
 * Test refle Mechanism Demo6
 * 
 * @author To be happy oh
 *
 */
public class demo6 {
	
	/**
	 * @param args  参数
	 * @throws Exception  这里的话就使用异常抛出了，实际开发中，必须使用异常处理
	 */
	public static void main(String[] args) throws Exception {
		
		// 1、 获取类对象
		Class<?> obj = Class.forName("com.to.entity.zj_articles");
		
		// 2、实例化对象
		Object newInstance = obj.newInstance();
		
		// 3、使用  Field 获取共有属性方法，DeclaredField 获取私有属性方法
		Field article_id = obj.getDeclaredField("article_id"); // 私有属性
		Field BQ = obj.getField("BQ"); // 共有属性
		
		
		// 4、注意这一点，私有属性必须要解锁
		article_id.setAccessible(true);
		BQ.setAccessible(true);
		
		
		// 5、设置属性值
		article_id.set(newInstance, 1);
		BQ.set(newInstance, "Java");

		
		// 6、使用属性获取值
		int Id = (Integer)article_id.get(newInstance);
		String bq = (String)BQ.get(newInstance);
		
		System.out.println(Id);
		System.out.println(bq);
	}

}
