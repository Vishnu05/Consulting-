//package com.selfrespect.document.configuration;


/**
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler;
	

	@Autowired
	DataSource datasource;
	
	
	@Value("${spring.queries.users-query}")
	private String usersQuery;
	
	@Value("${spring.queries.roles-query}")
	private String rolesQuery;

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		
		auth.
			jdbcAuthentication().dataSource(datasource)
				.usersByUsernameQuery(usersQuery)
				.authoritiesByUsernameQuery(rolesQuery);
				
				
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		/* http.cors().and()
	        .csrf().csrfTokenRepository(csrfTokenRepository())
	    .and()
	        .addFilterAfter(new CsrfHeaderFilter(), CsrfFilter.class)
	        .exceptionHandling()
	        .accessDeniedHandler(new CustomAccessDeniedHandler())
	        //.authenticationEntryPoint(authenticationEntryPoint)
	    .and()
	        .formLogin()
	        .loginProcessingUrl("/login")
	        .successHandler( new CustomAuthenticationSuccessHandler())
	        //.failureHandler()
	        .usernameParameter("username")
	        .passwordParameter("password")
	        .permitAll()
	    .and()
	        .logout()
	        .logoutUrl("/api/logout")
	        //.logoutSuccessHandler()
	        .deleteCookies("JSESSIONID", "CSRF-TOKEN")
	        .permitAll()
	    .and()
	        .headers()
	        .frameOptions()
	        .disable()
	    .and()
	        .authorizeRequests()
	        .antMatchers("*").permitAll()
	        .antMatchers("/admin/**").hasAuthority("Role_Admin"); 
		
		
		
		
		
		
		
		
		
		
		
		http.cors().and().
			authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("http://localhost:8081/Documentprocess/login").permitAll()
				.antMatchers("*").permitAll()
				.antMatchers("*").permitAll()
				.antMatchers("**").permitAll()
				.antMatchers("/admin/**").hasAuthority("Role_Admin").anyRequest()
				.authenticated().and().formLogin()
				.loginPage("/api/users/login").loginProcessingUrl("/loginf").failureUrl("/api/users/login?error=true")
				.successHandler(customAuthenticationSuccessHandler)
				.usernameParameter("username")
				.passwordParameter("password")
				.and().logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/").and().exceptionHandling()
				.accessDeniedPage("/access-denied").and().csrf()
				//.csrfTokenRepository(csrfTokenRepository())
				.disable()
				//.and().addFilterAfter(new CsrfHeaderFilter(), CsrfFilter.class)
				//.exceptionHandling()
		        //.accessDeniedHandler(new CustomAccessDeniedHandler())
				;
		
	}
	 @Bean
	    CorsConfigurationSource corsConfigurationSource() {
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
	        return source;
	    }
	@Override
	public void configure(WebSecurity web) throws Exception {
	    web
	       .ignoring()
	       .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");
	}
	
	private CsrfTokenRepository csrfTokenRepository() {
		  HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
		  repository.setHeaderName("X-XSRF-TOKEN");
		  return repository;
		}
	
	 

}

*/
 
