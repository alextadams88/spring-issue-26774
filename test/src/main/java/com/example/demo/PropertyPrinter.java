package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyPrinter {

    @Value("${test.property}")
    private boolean testProperty;

    public boolean getTestPropertyValue(){
        return testProperty;
    }
}
