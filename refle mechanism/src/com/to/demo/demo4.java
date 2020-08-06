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
	 * @param args ����
	 * @throws Exception ����Ļ���ʹ���쳣�׳��ˣ�ʵ�ʿ����У�����ʹ���쳣����
	 */
	public static void main(String[] args) throws Exception {
		
		// 1��ʵ����һ�����󣬴���ѣ�Ԫ�ռ䣩 ��
		zj_articles zj = new zj_articles();

		// 2����ȡ object ����
		Class<? extends zj_articles> obj = zj.getClass();
		
		// 4����ȡ���й��������Լ���
		Field[] fields = obj.getFields();
		
		System.out.println(Arrays.toString(fields));
		
		// 5��ָ����ȡ����������
		Field BQ = obj.getField("BQ");
		
		System.out.println(BQ);
		
		// 6����ȡ����˽�����Լ���
		Field[] DeclaredFields = obj.getDeclaredFields();
		
		System.out.println(Arrays.toString(DeclaredFields));
		
		// 7����ȡ˽������
		Field article_id = obj.getDeclaredField("article_id");
		
		System.out.println(article_id);
	}
}
