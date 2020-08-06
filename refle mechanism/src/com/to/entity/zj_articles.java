package com.to.entity;

import java.util.Date;

/**
 * Pojo Class Help Us Test Refle Mechanism
 * 
 * @author To be happy oh
 *
 */
public class zj_articles {

	private int article_id;

	private String article_title;

	private String article_description;

	private String article_context;

	private int article_views;

	private Date article_date;

	public String BQ;

	@Override
	public String toString() {
		return "zj_articles [article_id=" + article_id + ", article_title=" + article_title + ", article_description="
				+ article_description + ", article_context=" + article_context + ", article_views=" + article_views
				+ ", article_date=" + article_date + ", BQ=" + BQ + "]";
	}

	public zj_articles() {
		super();
	}

	public void demo() {
		System.out.println("啊哈 这都被你发现了 - -");
	}

	/*
	 * public zj_articles(String name) { // TODO Auto-generated constructor stub }
	 */

	/*
	 * private zj_articles(String name,int id) { // TODO Auto-generated constructor
	 * stub }
	 */

	public zj_articles(int article_id, String article_title, String article_description, String article_context,
			int article_views, Date article_date, String bQ) {
		super();
		this.article_id = article_id;
		this.article_title = article_title;
		this.article_description = article_description;
		this.article_context = article_context;
		this.article_views = article_views;
		this.article_date = article_date;
		BQ = bQ;
	}

	public int getArticle_id() {
		return article_id;
	}

	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}

	public String getArticle_title() {
		return article_title;
	}

	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}

	public String getArticle_description() {
		return article_description;
	}

	public void setArticle_description(String article_description) {
		this.article_description = article_description;
	}

	public String getArticle_context() {
		return article_context;
	}

	public void setArticle_context(String article_context) {
		this.article_context = article_context;
	}

	public int getArticle_views() {
		return article_views;
	}

	public void setArticle_views(int article_views) {
		this.article_views = article_views;
	}

	public Date getArticle_date() {
		return article_date;
	}

	public void setArticle_date(Date article_date) {
		this.article_date = article_date;
	}

	public String getBQ() {
		return BQ;
	}

	public void setBQ(String bQ) {
		BQ = bQ;
	}

}
