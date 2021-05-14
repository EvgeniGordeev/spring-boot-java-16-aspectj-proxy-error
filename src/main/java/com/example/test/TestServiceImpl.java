package com.example.test;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestServiceImpl implements TestService {
    private final String innerField = "hey";

    @Override
    @Transactional
    public void testMethod() {
        System.out.println("inside proxy");
    }
}
