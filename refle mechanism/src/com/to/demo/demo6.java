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
	 * @param args  ����
	 * @throws Exception  ����Ļ���ʹ���쳣�׳��ˣ�ʵ�ʿ����У�����ʹ���쳣����
	 */
	public static void main(String[] args) throws Exception {
		
		// 1�� ��ȡ�����
		Class<?> obj = Class.forName("com.to.entity.zj_articles");
		
		// 2��ʵ��������
		Object newInstance = obj.newInstance();
		
		// 3��ʹ��  Field ��ȡ�������Է�����DeclaredField ��ȡ˽�����Է���
		Field article_id = obj.getDeclaredField("article_id"); // ˽������
		Field BQ = obj.getField("BQ"); // ��������
		
		
		// 4��ע����һ�㣬˽�����Ա���Ҫ����
		article_id.setAccessible(true);
		BQ.setAccessible(true);
		
		
		// 5����������ֵ
		article_id.set(newInstance, 1);
		BQ.set(newInstance, "Java");

		
		// 6��ʹ�����Ի�ȡֵ
		int Id = (Integer)article_id.get(newInstance);
		String bq = (String)BQ.get(newInstance);
		
		System.out.println(Id);
		System.out.println(bq);
	}

}
