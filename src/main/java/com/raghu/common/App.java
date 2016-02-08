package com.raghu.common;

import com.raghu.common.HelloWorld;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
	HelloWorld obj = context.getBean("helloBean");
	obj.sayHello();        
    }
}
