package com.practice.rest.Web_Services.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix = "limit")
public class Limit {
	private int min;
	private int max;
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Limit(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	public Limit() {
		
	}
	

}
