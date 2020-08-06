package com.to.demo;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * 
 * Test refle Mechanism Demo1
 * 
 * @author To be happy oh
 *
 */
public class demo7 {
	
	/**
	 * @param args  参数
	 * @throws Exception  这里的话就使用异常抛出了，实际开发中，必须使用异常处理
	 */
	public static void main(String[] args) throws Exception {
		
		// 1、 获取类对象
		Class<?> zj = Class.forName("com.to.entity.zj_articles");
		
		
		// 2、获取所有公开构造方法
		Constructor<?>[] constructors = zj.getConstructors();
		
		System.out.println(Arrays.toString(constructors));
		
		
		// 3、指定参数获取公开构造方法
		Constructor<?> constructor = zj.getConstructor(String.class);
		
		System.out.println(constructor);
		
		
		// 4、获取所有私有构造方法
		Constructor<?>[] declaredConstructors = zj.getDeclaredConstructors();
		
		System.out.println(Arrays.toString(declaredConstructors));
		
		
		// 5、指定获取私有构造方法
		Constructor<?> declaredConstructor = zj.getDeclaredConstructor(String.class,int.class);
	
		System.out.println(declaredConstructor);
		
	}

}
