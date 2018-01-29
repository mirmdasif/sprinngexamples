package net.asifhossain.aopexceptionhandling;

import net.asifhossain.aopexceptionhandling.service.ExceptionalService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopExampleAppTest {

    @Autowired
    private ExceptionalService exceptionalService;

    @Test
    public void testContextLoads() {
        try {
            exceptionalService.thorowException();
        } catch (Exception e) {

        }
    }
}