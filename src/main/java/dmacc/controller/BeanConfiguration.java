package dmacc.controller;

import dmacc.beans.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfiguration {

	
	@Bean
	public Phones phones() {
		Phones bean = new Phones();
		bean.setModel("IPhone Xs");
		bean.setName("Apple");
		bean.setScreenSize(6.5);
		return bean;
	}
	
	@Bean 
	public Company company() {
		Company bean = new Company("Apple", "Cupertino", "CA");
		return bean;
	}
}
