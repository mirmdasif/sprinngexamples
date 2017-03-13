package net.asifhossain.springsecurityauthentication.config.security;

import net.asifhossain.springsecurityauthentication.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author asif.hossain
 * @since 2/8/17.
 */
@EnableWebSecurity
@ComponentScan("net.asifhossain.springsecurityauthentication.dao")
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDao userDao;

    @Override
    protected UserDetailsService userDetailsService() {
        return userDao;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .and()
            .httpBasic()
                .and()
            .rememberMe();
    }
}
