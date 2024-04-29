// Write a Implement Max Finder function with example in Java. Using generics, find the maximum of six elements of any type.
// The function should be able to find the maximum of any type of elements.

import java.util.Arrays;

public class MaxFinder {
    public static <T extends Comparable<T>> T max(T[] elements) {
        T max = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i].compareTo(max) > 0) {
                max = elements[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
        String[] stringArray = { "apple", "orange", "banana", "grapes", "mango", "kiwi" };
        System.out.println("Max of integers: " + max(intArray));
        System.out.println("Max of doubles: " + max(doubleArray));
        System.out.println("Max of strings: " + max(stringArray));
    }
}