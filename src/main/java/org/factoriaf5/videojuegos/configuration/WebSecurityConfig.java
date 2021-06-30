package org.factoriaf5.videojuegos.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
      .antMatchers("/", "/data/**/**", "/games/", "/img/**", "/css/**", "/js/**", "/login").permitAll()
      .anyRequest().authenticated()
      .and().formLogin().permitAll()
      .and().logout().permitAll();
    http.formLogin().defaultSuccessUrl("/", true);

  }
}
