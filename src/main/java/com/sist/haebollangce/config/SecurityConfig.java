package com.sist.haebollangce.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/* 
 * 2025-01-23 최초 생성
 * 
 * securityConfig
*/
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    	http.authorizeHttpRequests(auth -> {
    		// /css/*, /js/*, favicon.* 등의 전형적인 경로를
    		// 사용하는 static 자원들은 인증 작업없이 접근 가능하게 함
    		auth.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll();
    		
    		// 메인 화면에 대한 접근 허용
    		auth.requestMatchers("/").permitAll();
    		auth.requestMatchers("/main/mainPage").permitAll();
    		
    		// 그 외의 모든 요청 막기
    		auth.anyRequest().authenticated();
    	});
    	
    	http.formLogin(Customizer.withDefaults());
//    	http.formLogin(form -> form
//    			.loginPage("/login")
//    			.permitAll()
//    	);
    	return http.build();
    }
    
    // 임시 사용자 계정 생성
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
    	UserDetails pseudoUser = User
    			.withUsername("user")
    			.password("{noop}1111")
    			.authorities("ROLE_USER")
    			.build();
    	
    	// 임시 계정 1개 등록
    	return new InMemoryUserDetailsManager(pseudoUser);
    }
}