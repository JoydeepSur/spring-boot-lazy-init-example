package com.example.lazy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lazy.service.LazyService;

@RestController
@RequestMapping("/lazy")
public class LazyController {

	@Lazy
	@Autowired
	LazyService lazyService;

	@GetMapping
	public String hello() {
		return lazyService.hello();
	}

}
