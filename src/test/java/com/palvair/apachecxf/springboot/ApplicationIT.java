package com.palvair.apachecxf.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebIntegrationTest
@Log4j
public class ApplicationIT {
	
    @Autowired
    @Qualifier("client")
	private CxfHelloWorld cxfHelloWorld;
	
	@Test
	public void callWs() {
		cxfHelloWorld.sayHello("widdy");
	}

}
