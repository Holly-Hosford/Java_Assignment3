package com.example.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckRequirementsTest {
    private final String password  = "";
    private final String email = "";

    @Test
    void testPasswordLength() {
        String password = "1a@sdlfbhosbf";
        assertEquals(true, CheckRequirements.passwordLength(password));

    }

    @Test
    void testPasswordOneLetter() {
        String password = "1a@sdlfbhosbf";
        assertEquals(true, CheckRequirements.oneLetter(password));
    }

    @Test
    void testPasswordOneDigit() {
        String password = "1a@sdlfbhosbf";
        assertEquals(true, CheckRequirements.oneDigit(password));
    }

    @Test
    void testPasswordOneSymbol() {
        String password = "1a@sdlfbhosbf";
        assertEquals(true, CheckRequirements.oneSymbol(password));
    }

    @Test
    void testEmailFormat() {
        String email = "abc@gmail.com";
        assertEquals(true, CheckRequirements.emailCorrect(email));
    }
}
