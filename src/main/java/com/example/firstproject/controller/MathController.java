package com.example.firstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
	
	@GetMapping("/factorial/{number}")
	public long calculatorFactorial(@PathVariable int number) {
		return factorial(number);
	}
	
	private long factorial(int num) {
		if(num<=1) {
			return 1;
		}
		return num*factorial(num-1);
	}
}
