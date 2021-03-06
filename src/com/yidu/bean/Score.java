package com.yidu.bean;

import org.springframework.stereotype.Component;

@Component
public class Score {
	private int html;
	private int javaoop;
	private int javaWeb;

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	public int getJavaoop() {
		return javaoop;
	}

	public void setJavaoop(int javaoop) {
		this.javaoop = javaoop;
	}

	public int getJavaWeb() {
		return javaWeb;
	}

	public void setJavaWeb(int javaWeb) {
		this.javaWeb = javaWeb;
	}

	@Override
	public String toString() {
		return "Score [html=" + html + ", javaoop=" + javaoop + ", javaWeb=" + javaWeb + "]";
	}


}
