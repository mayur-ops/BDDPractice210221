package com.BDDPractice210221.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    DriverFactory obj = new DriverFactory();

    @Before
    public void setUp(){
        obj.openBrowser();
    }

    //@After
    public void tearDown(){
        obj.closedBrowser();
    }
}
