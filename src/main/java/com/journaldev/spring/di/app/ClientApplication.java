package com.journaldev.spring.di.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.journaldev.spring.di.configuration.DIConfiguration;
import com.journaldev.spring.di.consumer.MyApplication;

public class ClientApplication {

	public static void mainClientApplication() {
	//public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);

		printBeanNames(context);


		MyApplication app = context.getBean(MyApplication.class);
		
		app.processMessage("Hi Susan", "Susan@abcmail.com");
		
		//close the context
		context.close();
	}

	static void printBeanNames(AnnotationConfigApplicationContext context){

		System.out.println("\n***Loaded Context: " +context.getClass().getName() + " ***");

		String[] beanNames = context.getBeanDefinitionNames();
		System.out.println("\n*** Beans in the Context: ***");
		for (String beanName : beanNames){
			System.out.println(beanName + " : " + context.getBean(beanName).getClass().toString());
		}
		System.out.println();

	}

}
