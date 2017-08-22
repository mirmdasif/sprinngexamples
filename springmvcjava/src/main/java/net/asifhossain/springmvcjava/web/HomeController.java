package net.asifhossain.springmvcjava.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author asif.hossain
 * @since 1/31/17.
 */
@Controller
public class HomeController {

    @Autowired
    private Environment environment;

    @ResponseBody
    @RequestMapping({"/", "/home"})
    public String home() {
        return environment.getProperty("environment.name");
    }
}
