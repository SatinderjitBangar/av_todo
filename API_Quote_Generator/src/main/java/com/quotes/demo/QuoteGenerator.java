package com.quotes.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteGenerator {
	@Autowired
	public xlUtility xlobj;
	@RequestMapping("Quote")
	public String getQuote()
	{
		return xlobj.getQuote();
	}
}
