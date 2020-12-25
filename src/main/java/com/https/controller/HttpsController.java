package com.https.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpsController {

	@GetMapping("/hello")
	public String hello(String request) {
		System.out.println("SpringBoot系列——启用https  " + request);
		return "SpringBoot系列——启用https  " + request;
	}
}