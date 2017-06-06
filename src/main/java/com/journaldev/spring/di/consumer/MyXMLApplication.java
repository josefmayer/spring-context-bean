package com.journaldev.spring.di.consumer;

import com.journaldev.spring.di.services.EmailService;
import com.journaldev.spring.di.services.MessageService;
import com.journaldev.spring.di.services.TwitterService;

public class MyXMLApplication {

	private MessageService service;

	//constructor-based dependency injection
//	public MyXMLApplication(MessageService svc) {
//		this.service = svc;
//	}
	
	//setter-based dependency injection
	public void setService(MessageService srv){
		this.service=srv;
		//this .service = new TwitterService();
		//this .service = new EmailService();
		System.out.println ("\n****** Loaded Service Implementation Class: " + srv.getClass().getName() + " *****");
	}

	public boolean processMessage(String msg, String rec) {
		// some magic like validation, logging etc
		return this.service.sendMessage(msg, rec);
	}
}
