package com.palvair.apachecxf.springboot;

import javax.jws.WebService;

import org.apache.cxf.common.util.StringUtils;

@WebService(endpointInterface = "com.palvair.apachecxf.springboot.CxfHelloWorld")
public class CxfHelloWorldImpl implements CxfHelloWorld{

	@Override
	public String sayHello(String text) {
		return "Hello "+StringUtils.capitalize(text);
	}

}
