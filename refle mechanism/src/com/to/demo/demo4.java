package com.to.demo;

import java.lang.reflect.Field;
import java.util.Arrays;

import com.to.entity.zj_articles;

/**
 * 
 * Test refle Mechanism Get Property . . .
 * 
 * @author To be happy oh
 *
 */
public class demo4 {

	/**
	 * @param args 参数
	 * @throws Exception 这里的话就使用异常抛出了，实际开发中，必须使用异常处理
	 */
	public static void main(String[] args) throws Exception {
		
		// 1、实例化一个对象，储存堆（元空间） 里
		zj_articles zj = new zj_articles();

		// 2、获取 object 对象
		Class<? extends zj_articles> obj = zj.getClass();
		
		// 4、获取所有公开的属性集合
		Field[] fields = obj.getFields();
		
		System.out.println(Arrays.toString(fields));
		
		// 5、指定获取公开的属性
		Field BQ = obj.getField("BQ");
		
		System.out.println(BQ);
		
		// 6、获取所有私有属性集合
		Field[] DeclaredFields = obj.getDeclaredFields();
		
		System.out.println(Arrays.toString(DeclaredFields));
		
		// 7、获取私有属性
		Field article_id = obj.getDeclaredField("article_id");
		
		System.out.println(article_id);
	}
}
