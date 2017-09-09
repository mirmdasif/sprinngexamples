package net.asifhossain.mvcexceptionhandling;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionResolver {

    @ExceptionHandler
    @ResponseBody
    String handleException(GlobalException ex) {
        ex.printStackTrace();

        return "Exception Handled in Global Exception Handler";
    }
}
