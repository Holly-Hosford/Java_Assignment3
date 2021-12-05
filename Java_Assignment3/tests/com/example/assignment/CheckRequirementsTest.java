package com.example.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckRequirementsTest {
    private final String password  = "1a@sdlfbhosbf";
    private final String email = "abc@gmail.com";

    @Test
    void testPasswordLength() {
        CheckRequirements test = new CheckRequirements(password, email);
        assertEquals(true, test.passwordLength(password));

    }

    @Test
    void testPasswordOneLetter() {
        CheckRequirements test = new CheckRequirements(password, email);
        assertEquals(true, test.oneLetter(password));
    }

    @Test
    void testPasswordOneDigit() {
        CheckRequirements test = new CheckRequirements(password, email);
        assertEquals(true, test.oneDigit(password));
    }

    @Test
    void testPasswordOneSymbol() {
        CheckRequirements test = new CheckRequirements(password, email);
        assertEquals(true, test.oneSymbol(password));
    }

    @Test
    void testEmailFormat() {
        CheckRequirements test = new CheckRequirements(password, email);
        assertEquals(true, test.emailCorrect(email));
    }
}
