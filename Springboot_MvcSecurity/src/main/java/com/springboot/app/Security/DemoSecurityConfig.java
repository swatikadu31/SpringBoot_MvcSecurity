package com.springboot.app.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurityConfig {

	@Bean 
	public InMemoryUserDetailsManager userDetailsManager(){
		
		UserDetails john=User.builder()
				.username("john")
				.password("{noop}test123")
				.roles("EMPLOYEE")
				.build();
		
		UserDetails mary=User.builder()
				.username("mary")
				.password("{noop}test123")
				.roles("EMPLOYEE","MANAGER")
				.build();
		
		UserDetails mahira=User.builder()
				.username("mahira")
				.password("{noop}test123")
				.roles("EMPLOYEE","MANAGER","ADMIN")
				.build();
		
		return new InMemoryUserDetailsManager(john,mary,mahira);
	}
	
}
