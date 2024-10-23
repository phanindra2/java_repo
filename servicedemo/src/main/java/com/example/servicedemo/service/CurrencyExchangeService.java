package com.example.servicedemo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.servicedemo.dao.CurrencyExchangeRepo;
import com.example.servicedemo.entity.CurrencyExchange;
import com.example.servicedemo.exception.EntryAlreadyExistException;
import com.example.servicedemo.exception.EntryNotFoundException;

@Service
public class CurrencyExchangeService {
	@Autowired
	private CurrencyExchangeRepo repo;
	
	public CurrencyExchange saveEntry(String f,String t,BigDecimal bd) throws EntryAlreadyExistException {
		
		CurrencyExchange cx=repo.findByFromAndTo(f, t).orElse(null);
		if(cx!=null) {
			throw new EntryAlreadyExistException("Data you are trying to save is already existed");
		}
		cx=new CurrencyExchange();
		cx.setFrom(f);
		cx.setTo(t);
		cx.setConvertionValue(bd);
		
		

		return repo.save(cx);
	}
	
	public CurrencyExchange getEntry(int id) {
		return repo.findById(id).orElseThrow(
				()->new EntryNotFoundException("The Entry you are searching :"+id+"is not available "));
	}
	
	public List<CurrencyExchange> getAllEntries(){
		
		return repo.findAll();
		
	}
	
	public CurrencyExchange getEntry(String f,String t) {
		return repo.findByFromAndTo(f, t).orElseThrow(
				()->new EntryNotFoundException("The Entry you are searching :"+f+" and "+t+ " is not available "));
	}
	
	public void Update(int id,BigDecimal bd) {
		
	}
	public void Delete(int id) {
		
	}

	public CurrencyExchange saveEntry(CurrencyExchange curEx) {
		curEx.setFrom(curEx.getFrom().toUpperCase());
		curEx.setTo(curEx.getTo().toUpperCase());
		return repo.save(curEx);
	}

}
