package net.asifhossain.multipartfileupload.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author asif.hossain
 * @since 1/30/17.
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/home"})
    String home() {
        return "home";
    }
}
