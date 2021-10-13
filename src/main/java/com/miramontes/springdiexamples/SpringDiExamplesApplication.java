package com.miramontes.springdiexamples;

import com.miramontes.springdiexamples.Controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDiExamplesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDiExamplesApplication.class, args);

		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println("i18nController.sayHello() = " + i18nController.sayHello());

		MyController myController = (MyController) context.getBean("myController");

		System.out.println("-----Primary bean");
		System.out.println("myController.sayHello() = " + myController.sayHello());

		System.out.println("-----Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println("propertyInjectedController.getGreeting() = " + propertyInjectedController.getGreeting());

		System.out.println("-----Setter");
		SetterInjectionController setterInjectionController = (SetterInjectionController) context.getBean("setterInjectionController");
		System.out.println("setterInjectionController.getGreeting() = " + setterInjectionController.getGreeting());

		System.out.println("-----Constructor");
		ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) context.getBean("constructorInjectionController");
		System.out.println("constructorInjectionController.getGreeting() = " + constructorInjectionController.getGreeting());

	}

}
