package net.asifhossain.springmvcjava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author asif.hossain
 * @since 1/31/17.
 */
@EnableWebMvc
@ComponentScan("net.asifhossain.springmvcjava.web")
@PropertySource("classpath:${spring.profile.active}.properties")
public class MvcConfig {
    @Bean
    PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
