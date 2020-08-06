package com.to.demo;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * 
 * Test refle Mechanism Demo1
 * 
 * @author To be happy oh
 *
 */
public class demo8 {

	/**
	 * @param args ����
	 * @throws Exception ����Ļ���ʹ���쳣�׳��ˣ�ʵ�ʿ����У�����ʹ���쳣����
	 */
	public static void main(String[] args) throws Exception {

		// 1�� ��ȡ�����
		Class<?> zj = Class.forName("com.to.entity.zj_articles");
		
		
		// 2 ��ʵ����
		Object newInstance = zj.newInstance();

		// 3.����ÿ��Է��ʵķ������������෽����
		Method[] methods = zj.getMethods();

		System.out.println(Arrays.toString(methods));

		// 4��ָ����ȡ���Է��ʷ���
		Method method = zj.getMethod("demo");

		System.out.println(method);

		// 5����������ڱ����е����з���
		Method[] declaredMethods = zj.getDeclaredMethods();

		System.out.println(Arrays.toString(declaredMethods));

		// 6��ָ����ȡ���Է��ʷ���
		Method DeclaredMethod = zj.getDeclaredMethod("demo");

		System.out.println(DeclaredMethod);

		
		// 7��ִ�з���
		method.invoke(newInstance);
		
		// 8����ȡ���η�
		String Modifiers = Modifier.toString(method.getModifiers());
		
		System.out.println(Modifiers);
		
		// 9����ȡ����ֵ����
		Class<?> returnType = method.getReturnType();
		
		System.out.println(returnType);
		
		// 10����ò����б�����͵������
		Class<?>[] parameterTypes = method.getParameterTypes();
		
		System.out.println(Arrays.toString(parameterTypes));
	}

}
