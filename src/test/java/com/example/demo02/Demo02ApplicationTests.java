package com.example.demo02;

import javax.activation.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo02ApplicationTests {
    @Autowired
    DataSource dataSource;

    @Test
    public void test() {
        System.out.println(dataSource.getClass());
    }
}
