package com.techprimers.stock.dbservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.stock.dbservice.model.Quote;

public interface QuoteRepositery extends JpaRepository<Quote,Integer> {

	void finsByUserName(String username);

}
 	