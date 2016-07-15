package com.palvair.apachecxf.springboot;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CxfWebServiceClientConfig {

	@Bean
	public JaxWsProxyFactoryBean jaxWsProxyFactoryBean() {
        JaxWsProxyFactoryBean jaxWsProxyFactory = new JaxWsProxyFactoryBean();
        jaxWsProxyFactory.setServiceClass(CxfHelloWorld.class);
        jaxWsProxyFactory.setAddress("http://localhost:9000/soap-api/HelloWorld");
        return jaxWsProxyFactory;
	}
	
	@Bean(name="client")
	public CxfHelloWorld cxfHelloWorld() {
		return (CxfHelloWorld)jaxWsProxyFactoryBean().create();
	}

}
