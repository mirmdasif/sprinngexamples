package net.asifhossain.springmvcjava.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author asif.hossain
 * @since 1/31/17.
 */
@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping({"/", "/home"})
    public String home() {
        return "Spring MVC Java";
    }
}
