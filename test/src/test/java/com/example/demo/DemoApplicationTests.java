package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private PropertyPrinter propertyPrinter;

	@Test
	public void isCorrectProperty(){
		assertFalse(propertyPrinter.getTestPropertyValue());
	}

}
