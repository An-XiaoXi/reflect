package com.to.demo;

import com.to.entity.zj_articles;

/**
 * 
 * Test refle Mechanism Demo3
 * 
 * @author To be happy oh
 *
 */
public class demo3 {

	/**
	 * @param args ����
	 * @throws Exception ����Ļ���ʹ���쳣�׳��ˣ�ʵ�ʿ����У�����ʹ���쳣����
	 */
	public static void main(String[] args) throws Exception {
		
		// 1��ʵ����һ�����󣬴���ѣ�Ԫ�ռ䣩 ��
		zj_articles zj = new zj_articles();

		// 2����ȡ object ����
		Class<? extends zj_articles> obj = zj.getClass();
		
		// 3��ʵ��������������Ҫ���������ǿ��ת��
		zj_articles newInstance = (zj_articles) obj.newInstance();
		
		// 4�����������Ϣ,���� �����ﲢû�ж�����Ϣ
		System.out.println(newInstance);
	}
}