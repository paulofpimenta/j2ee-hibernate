package com.training.springsecond.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springsecond.business.Transaction;
import com.training.springsecond.service.Iservice;
import com.training.springsecond.service.ServiceImpl;


public class SpringApplication2 {

	public static void main (String[] args) {
		
		// Container initialization
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Transaction t = context.getBean("transaction",Transaction.class);
		Iservice service= context.getBean("serviceImpl",ServiceImpl.class);
		service.ajouterTransaction(t);
		
		context.close();
	}
	
}
