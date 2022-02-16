package com.company;

import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        // Create scanner for input
        Scanner scanner = new Scanner(System.in);

        // Create array for the 5 numbers
        int[] numbers = new int[5];
        String userInput;

        // Get 5 numbers from user and put them in array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number: ");
            userInput = scanner.nextLine();
            numbers[i] = Integer.parseInt(userInput);
        }

        // Print resulting array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
