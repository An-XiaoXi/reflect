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
	 * @param args  ����
	 * @throws Exception  ����Ļ���ʹ���쳣�׳��ˣ�ʵ�ʿ����У�����ʹ���쳣����
	 */
	public static void main(String[] args) throws Exception {
		
		// 1�� ��ȡ�����
		Class<?> zj = Class.forName("com.to.entity.zj_articles");
		
		
		// 2����ȡ���й������췽��
		Constructor<?>[] constructors = zj.getConstructors();
		
		System.out.println(Arrays.toString(constructors));
		
		
		// 3��ָ��������ȡ�������췽��
		Constructor<?> constructor = zj.getConstructor(String.class);
		
		System.out.println(constructor);
		
		
		// 4����ȡ����˽�й��췽��
		Constructor<?>[] declaredConstructors = zj.getDeclaredConstructors();
		
		System.out.println(Arrays.toString(declaredConstructors));
		
		
		// 5��ָ����ȡ˽�й��췽��
		Constructor<?> declaredConstructor = zj.getDeclaredConstructor(String.class,int.class);
	
		System.out.println(declaredConstructor);
		
	}

}
