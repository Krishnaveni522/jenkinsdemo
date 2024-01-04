package com.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsprojectApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(JenkinsprojectApplication.class);

	@Test
	void contextLoads() {
		logger.info("testing started...........");
		assertEquals(true,true);
		
	}

}
