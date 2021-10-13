package com.miramontes.springdiexamples;

import com.miramontes.springdiexamples.Controller.MyController;
import com.miramontes.springdiexamples.Controller.PropertyInjectedController;
import com.miramontes.springdiexamples.Controller.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDiExamplesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDiExamplesApplication.class, args);

		MyController myController = (MyController) context.getBean("myController");

		System.out.println(myController.sayHello());

		System.out.println("-----Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println("propertyInjectedController.getGreeting() = " + propertyInjectedController.getGreeting());

		System.out.println("-----Setter");
		SetterInjectionController setterInjectionController = (SetterInjectionController) context.getBean("setterInjectionController");
		System.out.println("setterInjectionController.getGreeting() = " + setterInjectionController.getGreeting());
	}

}
