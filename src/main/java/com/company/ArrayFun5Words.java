package com.company;

import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {
        // Create scanner for input
        Scanner scanner = new Scanner(System.in);

        // Create array for the 5 words
        String[] words = new String[5];
        String userInput;

        // Get 5 words from user and put them in array
        for (int i = 0; i < words.length; i++) {
            System.out.println("Please enter a word: ");
            userInput = scanner.nextLine();
            words[i] = userInput;
        }

        // Print resulting array
        System.out.println("Array elements:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
