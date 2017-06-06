package com.journaldev.spring.di.runApp;

import com.journaldev.spring.di.app.ClientApplication;
import com.journaldev.spring.di.app.ClientXMLApplication;

/**
 * Created by Josef Mayer on 03.06.2017.
 */

public class RunApp {
    public static void main(String [] args){
        ClientXMLApplication clientXMLApplication = new ClientXMLApplication();
        clientXMLApplication.mainClientXMLApplication();

        ClientApplication clientApplication = new ClientApplication();
        clientApplication.mainClientApplication();


    }
}
