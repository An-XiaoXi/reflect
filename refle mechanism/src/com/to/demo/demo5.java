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
	 * @param args  ����
	 * @throws Exception  ����Ļ���ʹ���쳣�׳��ˣ�ʵ�ʿ����У�����ʹ���쳣����
	 */
	public static void main(String[] args) throws Exception {
		
		// 1�� ��ȡ�����
		Class<?> obj = Class.forName("com.to.entity.zj_articles");
		
		// 2��ʵ��������������Ҫ���������ǿ��ת��
		zj_articles zj = (zj_articles) obj.newInstance();
		
		
		// 3�����Ը�ֵ
		zj.setArticle_id(1); // ���� ID
		zj.setArticle_date(new Date(System.currentTimeMillis())); // ����ʱ��

		
		// 4�����������Ϣ
		System.out.println(zj);
	}

}
