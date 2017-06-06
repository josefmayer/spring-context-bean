package com.journaldev.spring.di.app;

import com.journaldev.spring.di.consumer.MyApplication;
import com.journaldev.spring.di.consumer.MyXMLApplication;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Josef Mayer on 03.06.2017.
 */
public class Test_ClientXMLApplication {

    private ClassPathXmlApplicationContext context = null;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @After
    public void tearDown() throws Exception {
        context.close();
    }

    @Test
    public void test() {
        MyXMLApplication app = context.getBean(MyXMLApplication.class);
        Assert.assertTrue(app.processMessage("Hi Susan", "Susanj@abcmail.com"));

    }

}
