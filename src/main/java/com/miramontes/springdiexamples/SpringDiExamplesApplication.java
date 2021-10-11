package com.miramontes.springdiexamples;

import com.miramontes.springdiexamples.Controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDiExamplesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDiExamplesApplication.class, args);

		MyController myController = (MyController) context.getBean("myController");

		System.out.println(myController.sayHello());
	}

}
