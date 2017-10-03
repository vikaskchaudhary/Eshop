/*package com.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http
	            .logout()
	            .logoutSuccessUrl("http://localhost:8080/exit");
	}
	
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
		authenticationMgr.inMemoryAuthentication()
			.withUser("vikas.chaudhary2@atidan.com").password("P@ssw0rd").authorities("ROLE_USER")
			.and()
			.withUser("vikas.chaudhary2@atidan.com").password("P@ssw0rd").authorities("ROLE_USER","ROLE_ADMIN");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		
		http.authorizeRequests()
			.antMatchers("/getAlluser").access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
			.antMatchers("/getShopCategory").access("hasRole('ROLE_USER')")
			.antMatchers("/createUser").access("hasRole('ROLE_ADMIN')")
			.and()
				.formLogin().loginPage("/")
				.defaultSuccessUrl("/")
				.failureUrl("/loginPage?error")
				.usernameParameter("username").passwordParameter("password")				
			.and()
				.logout().logoutSuccessUrl("/loginPage?logout"); 
		
	}
}
*/