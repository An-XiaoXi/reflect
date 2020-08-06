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
	 * @param args 参数
	 * @throws Exception 这里的话就使用异常抛出了，实际开发中，必须使用异常处理
	 */
	public static void main(String[] args) throws Exception {

		// 1、获取 object 对象
		Class<zj_articles> className = zj_articles.class;
		
		// 2、实例化对象，这里需要给对象进行强制转换
		zj_articles newInstance = (zj_articles) className.newInstance();
		
		// 3、输出对象信息,哈哈 但这里并没有对象信息
		System.out.println(newInstance);
	}
}
