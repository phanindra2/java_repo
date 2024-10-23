package com.practice.DemoMS_1.Entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "limit")

//@NoArgsConstructor
//
//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
public class Limits {

	private int minimum;
	private int maximum;

	public Limits(int i, int j) {

		this.minimum = i;
		this.maximum = j;

		// TODO Auto-generated constructor stub
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public Limits() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Limits [minimum=" + minimum + ", maximum=" + maximum + "]";
	}

}
