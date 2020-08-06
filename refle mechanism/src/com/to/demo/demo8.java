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
	 * @param args 参数
	 * @throws Exception 这里的话就使用异常抛出了，实际开发中，必须使用异常处理
	 */
	public static void main(String[] args) throws Exception {

		// 1、 获取类对象
		Class<?> zj = Class.forName("com.to.entity.zj_articles");
		
		
		// 2 、实例化
		Object newInstance = zj.newInstance();

		// 3.、获得可以访问的方法（包括父类方法）
		Method[] methods = zj.getMethods();

		System.out.println(Arrays.toString(methods));

		// 4、指定获取可以访问方法
		Method method = zj.getMethod("demo");

		System.out.println(method);

		// 5、获得声明在本类中的所有方法
		Method[] declaredMethods = zj.getDeclaredMethods();

		System.out.println(Arrays.toString(declaredMethods));

		// 6、指定获取可以访问方法
		Method DeclaredMethod = zj.getDeclaredMethod("demo");

		System.out.println(DeclaredMethod);

		
		// 7、执行方法
		method.invoke(newInstance);
		
		// 8、获取修饰符
		String Modifiers = Modifier.toString(method.getModifiers());
		
		System.out.println(Modifiers);
		
		// 9、获取返回值类型
		Class<?> returnType = method.getReturnType();
		
		System.out.println(returnType);
		
		// 10、获得参数列表的类型的类对象
		Class<?>[] parameterTypes = method.getParameterTypes();
		
		System.out.println(Arrays.toString(parameterTypes));
	}

}
