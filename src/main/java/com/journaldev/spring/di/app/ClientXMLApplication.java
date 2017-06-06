package com.journaldev.spring.di.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.di.consumer.MyXMLApplication;

public class ClientXMLApplication {

	public static void mainClientXMLApplication() {
	//public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		printBeanNames(context);

		MyXMLApplication app = context.getBean(MyXMLApplication.class);
		app.processMessage("Hi Susan", "Susanj@abcmail.com");

		// close the context
		context.close();
	}

	static void printBeanNames(ClassPathXmlApplicationContext context){
		System.out.println("\n***Loaded Context: " +context.getClass().getName() + " ***");

		String[] beanNames = context.getBeanDefinitionNames();
		System.out.println("\n*** Beans in the Context: ***");
		for (String beanName : beanNames){
			System.out.println(beanName + " : " + context.getBean(beanName).getClass().toString());
		}
		System.out.println();

	}

}
