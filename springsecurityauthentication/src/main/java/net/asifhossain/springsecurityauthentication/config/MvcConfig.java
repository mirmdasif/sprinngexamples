package net.asifhossain.springsecurityauthentication.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author asif.hossain
 * @since 2/20/17.
 */
@EnableWebMvc
@ComponentScan("net.asifhossain.springsecurityauthentication.web")
public class MvcConfig {
}
