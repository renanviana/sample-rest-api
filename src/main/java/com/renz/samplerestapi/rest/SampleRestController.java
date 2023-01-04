package com.renz.samplerestapi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}
	
}
