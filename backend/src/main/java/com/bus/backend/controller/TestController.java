package com.bus.backend.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(value = "/api/test", produces = MediaType.TEXT_HTML_VALUE)
	public String test() {
		return "<h1>Backend is working!</h1>";
	}
}
