package com.csc.myqaautomation;

import com.csc.actionapi.ActionAPI;
import com.csc.driverpool.DriverPool;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Throwable
    {
        System.out.println( "Hello World!" );
        DriverPool.createDriver("chrome1", "Chrome");
        ActionAPI.setDriverForAction("chrome1");
        ActionAPI.toNavigate("https://google.com.vn");
        Thread.sleep(3000);
        DriverPool.createDriver("firefox1", "Firefox");
        ActionAPI.setDriverForAction("firefox1");
        ActionAPI.toNavigate("https://google.com.vn");
        Thread.sleep(3000);
        ActionAPI.setDriverForAction("chrome1");
        ActionAPI.toNavigate("https://gmail.com");
    }
}
