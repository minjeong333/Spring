package com.example.day01Prac.ex;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Ex02ServiceTest {

    @Autowired
    Ex02Service service;

    @Test
    public void test(){
        String[] result = service.getDan3();
        System.out.println( result[0]);
        System.out.println( result[0].equals("3*1=3"));
        assertTrue(result[0].equals("3*1=3"));
    }

}