package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.config.ProductRepository;
import com.app.model.Product;
@Component
public class ConsoleRunner implements CommandLineRunner {
	
	
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		Product p= repo.save(new Product("rk", 8.9));
		System.out.println(p.getProdId());

	}

}
