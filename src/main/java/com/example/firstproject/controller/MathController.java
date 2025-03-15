package com.example.firstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.firstproject.service.MathService;

@RestController
@RequestMapping("/math")
public class MathController {
	
	private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/factorial/{number}")
    public long getFactorial(@PathVariable int number) {
        return mathService.calculateFactorial(number);
    }
}
