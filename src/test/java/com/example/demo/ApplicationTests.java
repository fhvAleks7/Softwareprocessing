package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        // Verifies the Spring Boot application context loads correctly
    }

    @Test
    void addition_isCorrect() {
        int result = 2 + 2;
        assertEquals(4, result);
    }

    @Test
    void string_isNotEmpty() {
        String value = "hello";
        assertFalse(value.isEmpty());
    }
}