package com.strings.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringOpTest {
    @Test
    void unitesting(){
        StringOp stringToCount = new StringOp("shakalaka");
        assertEquals("*********",stringToCount.Printasterisks(9));
        assertEquals("s 1 *\n" +
                "h 1 *\n" +
                "a 4 ****\n" +
                "k 2 **\n" +
                "l 1 *\n",stringToCount.IdentifyLetters());
    }

}