package com.to.demo;

import com.to.entity.zj_articles;

/**
 * 
 * Test refle Mechanism Demo2
 * 
 * @author To be happy oh
 *
 */
public class demo2 {

	/**
	 * @param args ����
	 * @throws Exception ����Ļ���ʹ���쳣�׳��ˣ�ʵ�ʿ����У�����ʹ���쳣����
	 */
	public static void main(String[] args) throws Exception {

		// 1����ȡ object ����
		Class<zj_articles> className = zj_articles.class;
		
		// 2��ʵ��������������Ҫ���������ǿ��ת��
		zj_articles newInstance = (zj_articles) className.newInstance();
		
		// 3�����������Ϣ,���� �����ﲢû�ж�����Ϣ
		System.out.println(newInstance);
	}
}
