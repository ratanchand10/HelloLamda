package com.techprimers.stock.dbservice.resource;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.techprimers.stock.dbservice.repository.QuoteRepositery;


@RestController
@RequestMapping("rest/db")
public class DbServiceResource {
	
	private QuoteRepositery quotesRepositery;
	
	@GetMapping("/{username}")
	public List<String> getQuotes(@PathVariable("username") final String username){
		
		
		quotesRepositery.finsByUserName(username)
						
		
		return null;
	}

}
