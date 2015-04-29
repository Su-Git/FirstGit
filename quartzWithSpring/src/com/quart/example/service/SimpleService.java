package com.quart.example.service;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("simpleService")
public class SimpleService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2791134392604212628L;
	private static final Logger logger = LoggerFactory.getLogger(SimpleService.class);

	public void testMethod(String triggerName) {
		logger.info(triggerName);
	}

	public void testMethod2() {
		logger.info("testMethod2");
	}
}
