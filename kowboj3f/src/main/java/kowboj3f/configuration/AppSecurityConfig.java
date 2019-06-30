package kowboj3f.configuration;


import kowboj3b.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("SELECT `email`,`passwordHash`,`active` FROM `users` WHERE `email`=?")
                .authoritiesByUsernameQuery("SELECT 'USER' FROM `users` WHERE `email`=?")
                .passwordEncoder(passwordEncoder());

    }

//    @Autowired
//    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth.inMemoryAuthentication()
//                .withUser("jan").password("{noop}pas1").roles("RIDER").credentialsExpired(false)
//                .and()
//                .withUser("kim").password("{noop}pas2").roles("INSTRUCTOR", "RIDER")
//                .and()
//                .withUser("bran").password("{noop}pas3").roles("MANAGER", "INSTRUCTOR", "RIDER");
//    }

//    @Bean
//    public AuthenticationSuccessHandler myAuthenticationSuccessHandler(){
//        return new UrlAuthenticationSuccessHandler();
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers("/riders").hasRole("RIDER")
//                .antMatchers("/instructor/**").hasRole("INSTRUCTOR")
//                .antMatchers("/manager/**").hasRole("MANAGER")
//                .antMatchers("/systems/**").hasRole("ADMIN")
//                .and()
//                .formLogin()
//                .loginPage("/showMyLoginPage")
//                .loginProcessingUrl("/authenticateTheUser")
//                .successHandler(myAuthenticationSuccessHandler())
//                .permitAll()
//                .and()
//                .logout()
//                .logoutSuccessUrl("/")
//                .permitAll()
//                .and()
//                .exceptionHandling()
//                .accessDeniedPage("/access-denied");
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/**").permitAll()
                .anyRequest().denyAll()
                .and()
                .formLogin()
                .disable();
    }

}
