package com.win.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class SameOrNahTest {

    @Test
    public  void SameOrNah() {

        System.out.println("Enter a word:");
        String word1 ="Lee";

        System.out.println("Enter another word:");
        String word2 = "Lee";
        String word3 = "Le3";
        String word4 = "lee";

        if(word1.equals(word2)){
            System.out.println("The words are the same.");
        }else{
            System.out.println("The words are different.");
        }

        assertEquals(word1, word2);
        assertNotEquals(word3, word4);
    }
}
