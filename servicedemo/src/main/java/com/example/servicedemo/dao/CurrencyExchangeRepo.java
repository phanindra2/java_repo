package com.example.servicedemo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.servicedemo.entity.CurrencyExchange;


@Repository
public interface CurrencyExchangeRepo extends JpaRepository<CurrencyExchange, Integer> {
	
	public  Optional<CurrencyExchange> findByFromAndTo(String f,String t);

}
