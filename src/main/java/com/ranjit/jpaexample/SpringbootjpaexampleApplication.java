package com.ranjit.jpaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ranjit.jpaexample.entity.User;
import com.ranjit.jpaexample.repository.UserRepository;

@SpringBootApplication
public class SpringbootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootjpaexampleApplication.class, args);
		UserRepository bean = context.getBean(UserRepository.class);
		User user= new User();
		user.setName("ranjit");
		user.setCity("rourkela");
		user.setStatus("Single");
		User save = bean.save(user);
		System.out.println(save);
		
		
	}

}
