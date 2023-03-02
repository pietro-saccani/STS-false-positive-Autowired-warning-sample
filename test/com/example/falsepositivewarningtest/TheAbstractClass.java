package com.example.falsepositivewarningtest;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.client.RestTemplateBuilder;

@SpringBootTest
public abstract class TheAbstractClass {

	public TheAbstractClass(RestTemplateBuilder restTemplateBuilder) {
		// do stuff
	}
}
