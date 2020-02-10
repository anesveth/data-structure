package com.strings.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringOpTest {
    @Test
    void unitesting(){
        StringOp stringToCount = new StringOp("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Posuere morbi leo urna molestie at elementum eu facilisis. Nibh cras pulvinar mattis nunc sed blandit libero volutpat. Ut sem viverra aliquet eget sit amet tellus. Egestas integer eget aliquet nibh praesent tristique magna.");
        assertEquals("*********",stringToCount.Printasterisks(9));
        assertEquals("L 1 *\n" +
                "o 16 ****************\n" +
                "r 17 *****************\n" +
                "e 38 **************************************\n" +
                "m 14 **************\n" +
                "  52 ****************************************************\n" +
                "i 29 *****************************\n" +
                "p 6 ******\n" +
                "s 20 ********************\n" +
                "u 17 *****************\n" +
                "d 10 **********\n" +
                "l 17 *****************\n" +
                "t 30 ******************************\n" +
                "a 23 ***********************\n" +
                ", 2 **\n" +
                "c 7 *******\n" +
                "n 15 ***************\n" +
                "g 7 *******\n" +
                "b 6 ******\n" +
                "q 4 ****\n" +
                ". 5 *****\n" +
                "P 1 *\n" +
                "f 1 *\n" +
                "N 1 *\n" +
                "h 2 **\n" +
                "v 4 ****\n" +
                "U 1 *\n" +
                "E 1 *\n",stringToCount.IdentifyLetters());
        assertEquals("_ 52 ****************************************************\n" +
                "e 38 **************************************\n" +
                "t 30 ******************************\n" +
                "i 29 *****************************\n" +
                "a 23 ***********************\n" +
                "s 20 ********************\n" +
                "r 17 *****************\n" +
                "u 17 *****************\n" +
                "l 17 *****************\n" +
                "o 16 ****************\n",stringToCount.Top10());
    }

}