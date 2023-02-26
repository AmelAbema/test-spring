package com.ivan.spring;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

    public String getSong() {
        return "Sonata N.6";
    }
}
