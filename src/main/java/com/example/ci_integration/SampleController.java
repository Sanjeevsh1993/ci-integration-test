package com.example.ci_integration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class SampleController {

	@GetMapping(value = "/sample")
	public String sampleGetMethod() {

		return "sample working good";
	}

}
