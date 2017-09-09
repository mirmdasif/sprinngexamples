package net.asifhossain.mvcexceptionhandling;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {

    @RequestMapping("/exception")
    @ResponseBody
    public String exception(@RequestParam("type") String type) throws LocalException, GlobalException {
        if ("local".equals(type)) throw new LocalException("Local Exception");
        if ("global".equals(type)) throw new GlobalException("Global Exception");

        return "No exception";
    }

    @ExceptionHandler
    @ResponseBody
    String handleException(LocalException ex) {
        ex.printStackTrace();

        return "Exception Handled In Local Controller";
    }
}
