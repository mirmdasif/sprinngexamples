package net.asifhossain.aopexceptionhandling.service;

import org.springframework.stereotype.Service;

@Service
public class ExceptionalService {
    public void thorowException() throws Exception {
        throw new Exception();
    }
}
