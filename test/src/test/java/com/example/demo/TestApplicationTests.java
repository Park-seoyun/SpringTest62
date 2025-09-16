package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Test
	void contextLoads() {
//		
//		List<Customer> lists=this.customerRepository.findAll();
//		System.out.println(lists.toString());
//		
		List<Customer> lists = customerRepository.findAllNative();
		lists.forEach(System.out::println);
		
		
		
		
		
	}

}
