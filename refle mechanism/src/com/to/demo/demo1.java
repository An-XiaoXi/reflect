package com.to.demo;

import com.to.entity.zj_articles;

/**
 * 
 * Test refle Mechanism Demo1
 * 
 * @author To be happy oh
 *
 */
public class demo1 {
	
	/**
	 * @param args  ����
	 * @throws Exception  ����Ļ���ʹ���쳣�׳��ˣ�ʵ�ʿ����У�����ʹ���쳣����
	 */
	public static void main(String[] args) throws Exception {
		
		// 1�� ��ȡ�����
		Class<?> zj = Class.forName("com.to.entity.zj_articles");
		
		// 2��ʵ��������������Ҫ���������ǿ��ת��
		zj_articles newInstance = (zj_articles) zj.newInstance();
		
		// 3�����������Ϣ,���� �����ﲢû�ж�����Ϣ
		System.out.println(newInstance);
	}

}
