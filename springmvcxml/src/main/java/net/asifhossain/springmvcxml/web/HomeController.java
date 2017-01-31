package net.asifhossain.springmvcxml.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author asif.hossain
 * @since 1/30/17.
 */
@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping(value = {"/", "/home"})
    String home() {
        return "Spring MVC XML";
    }
}
