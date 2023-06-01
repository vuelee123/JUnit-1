package com.win.junit;

import java.util.Scanner;
public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println("Enter another word: ");
        String word2 = scanner.nextLine();

        if (word.equalsIgnoreCase(word2)) {
            System.out.println("The word are the same");
        } else {
            System.out.println("The words are different");
        }
    }
}