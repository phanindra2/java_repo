package com.example.servicedemo.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.servicedemo.entity.CurrencyExchange;
import com.example.servicedemo.exception.EntryAlreadyExistException;
import com.example.servicedemo.service.CurrencyExchangeService;
//currency-exchange/USD/to/INR
@RestController()
@RequestMapping("/currency-exchange")
public class CurrencyExchangeController {
	@Autowired
	private CurrencyExchangeService exchangeService;
	
	@GetMapping("/{from}/to/{to}")
	public CurrencyExchange exchageCurrency(@PathVariable String from,@PathVariable String to) {
		return new CurrencyExchange(1000,from,to,BigDecimal.valueOf(50.0));
		
	}
	
	@GetMapping("/")
	public CurrencyExchange  exchangeCurrency(@RequestParam String from,@RequestParam String to) {
		return new CurrencyExchange(100,from,to,BigDecimal.valueOf(65));
	}
	
	@PostMapping("/insert")
	public ResponseEntity<CurrencyExchange> inserstExchangeDetails(@RequestBody CurrencyExchange curEx){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(exchangeService.saveEntry(curEx));
		
	}
	@PostMapping("/insertData")
	public ResponseEntity<CurrencyExchange> insertExchangeDet(@RequestParam String from, @RequestParam String to,@RequestParam BigDecimal bd) throws EntryAlreadyExistException{
		return ResponseEntity.status(HttpStatus.CREATED).body(exchangeService.saveEntry(from.toUpperCase(),to.toUpperCase(),bd));
		
	}
	@GetMapping("/getById/{id}")
	public ResponseEntity<CurrencyExchange> getEntryById(@PathVariable("id") int id){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(exchangeService.getEntry(id));
	}
	
	@GetMapping("/getByCurr")
	public ResponseEntity<CurrencyExchange> getEntityDetails(@RequestParam String from,@RequestParam String to){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(exchangeService.getEntry(from.toUpperCase(), to.toUpperCase()));
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<CurrencyExchange>> getAllEntries(){
		return ResponseEntity.status(HttpStatus.OK).body(exchangeService.getAllEntries());
	}
	@PutMapping("/updateEntry")
	public ResponseEntity<CurrencyExchange> updateDetails(@)
	

}
