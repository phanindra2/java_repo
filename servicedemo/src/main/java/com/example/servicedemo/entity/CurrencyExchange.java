package com.example.servicedemo.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(
	    uniqueConstraints = {
	        @UniqueConstraint(columnNames = {"currFrom", "currTo"})
	    }
	)
public class CurrencyExchange {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "currFrom")
	private String from;
	@Column(name ="currTo")
	private String to;
	private BigDecimal convertionValue;
	
	
	
	
	public CurrencyExchange() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CurrencyExchange(int id, String from, String to, BigDecimal convertionValue) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.convertionValue = convertionValue;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConvertionValue() {
		return convertionValue;
	}
	public void setConvertionValue(BigDecimal convertionValue) {
		this.convertionValue = convertionValue;
	}

	@Override
	public String toString() {
		return "CurrencyExchange [id=" + id + ", from=" + from + ", to=" + to + ", convertionValue=" + convertionValue
				+ "]";
	}
	
	
	

}
