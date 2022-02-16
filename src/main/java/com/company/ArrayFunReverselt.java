package com.company;

public class ArrayFunReverselt {
    public static void main(String[] args) {
        // Create given array and other array of equal length
        int[] numbers = {1, 2, 3, 4, 5};
        int[] reversed = new int[numbers.length];

        // Reverse array by iterating through given array in reverse
        int index = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            reversed[index] = numbers[i];
            index++;
        }

        // Print out resulting arrays
        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Reversed array:");
        for (int i = 0; i < reversed.length; i++) {
            System.out.println(reversed[i]);
        }
    }
}
