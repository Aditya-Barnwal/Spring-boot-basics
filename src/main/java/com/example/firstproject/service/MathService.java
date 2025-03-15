package com.example.firstproject.service;

import org.springframework.stereotype.Component;

@Component
public class MathService {
	
	public long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}
