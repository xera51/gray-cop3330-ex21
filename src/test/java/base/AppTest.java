/*
 *  UCF COP3330 Summer 2021 Exercise 21 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    static App myApp = new App();

    @Test
    public void month_should_throw_oob_exception() {
        int monthNum = 13;
        String expectedOutput = "ibe thrown";
        String actualOutput;

        try {
            actualOutput = myApp.numToMonth(monthNum);
        } catch (IndexOutOfBoundsException ibe) {
            actualOutput = "ibe thrown";
        }

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void month_should_not_throw_oob_exception() {
        int monthNum = 12;

        String expectOutput = "December";
        String actualOutput = myApp.numToMonth(monthNum);

        assertEquals(expectOutput, actualOutput);
    }
}