package com.example.falsepositivewarningtest;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TheExtendingClass extends TheAbstractClass {

	@Autowired // try removing this. you'll get an exception.
	public TheExtendingClass(RestTemplateBuilder restTemplateBuilder) {
		super(restTemplateBuilder);
	}
	
	@Test
	public void smokeTest() {}
}
