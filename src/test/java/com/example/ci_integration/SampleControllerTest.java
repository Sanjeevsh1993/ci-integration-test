package com.example.ci_integration;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SampleControllerTest {

	@InjectMocks
	private SampleController sampleController;

	@Test
	void testSampleGetMethod() {
		String sampleGetMethod = sampleController.sampleGetMethod();

		assertSame(sampleGetMethod, "sample working good");
	}
}
