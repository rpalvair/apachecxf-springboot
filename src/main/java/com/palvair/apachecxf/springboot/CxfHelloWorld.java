package com.palvair.apachecxf.springboot;

import javax.jws.WebService;

@WebService
public interface CxfHelloWorld {
	String sayHello(String text);
}
