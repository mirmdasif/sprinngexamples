package net.asifhossain.aopexceptionhandling;

import net.asifhossain.aopexceptionhandling.service.ExceptionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopExampleApp implements CommandLineRunner {

    @Autowired
    ExceptionalService service;

    @Override
    public void run(String... args) throws Exception {
        try {
            service.throwException();
        } catch (Exception ex) {
            // Do nothing Since
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(AopExampleApp.class);
    }
}
