/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package family.arrays;

import family.exceptions.NonPositiveArraySizeException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kalav_000
 */
public class ArrayFun2 {

    private Object num2;

    public void getInput2() throws NonPositiveArraySizeException {
        int i;
        int arraySize = 1;
        int a[] = null;
        boolean valid2 = false; // flag to indicate if valid character entered
        Scanner num = new Scanner(System.in);
        while (!valid2) {

            System.out.print("Enter the size of an array: ");

            // prompt for input
            try {

                arraySize = num.nextInt();
                System.out.println(arraySize);
                if (arraySize < 1) {
                    throw new NonPositiveArraySizeException();
                }

                a = new int[arraySize];

                valid2 = true;
            } catch (NonPositiveArraySizeException e) {
                System.out.println("You can't enter negative numbers or zero.");
            } catch (InputMismatchException exp) {
                System.out.println("An integer is the only valid input. Please try again.");
                num.next();
            } finally {
                System.out.println("Test Finally");
            }
        }

        int counter = 0;
        while (counter < arraySize) {

            try {
                System.out.println("Enter value");

                a[counter] = num.nextInt();

                counter++;
            } catch (InputMismatchException exp) {
                System.out.println("An integer is the only valid input. Please try again.");
                num.next();
            }
        }
        getSum(a);
        minMax(a);
        InsertionSort(a);

    }

    public static void minMax(int x[]) {
        int min, max;

        min = max = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
            if (x[i] > max) {
                max = x[i];
            }
        }
        System.out.println("Min and Max: " + min + " and " + max);
    }

    public static void getSum(int y[]) {
        int sum = 0;

        // Use for-each style for to display and sum the values. 
        for (int x : y) {
            System.out.println("Value is: " + x);
            sum += x;
        }

        System.out.println("Summation: " + sum);
    }

    public static void InsertionSort(int z[]) {
        int j;                     // the number of items sorted so far
        int key;                // the item to be inserted
        int i;

        for (j = 1; j < z.length; j++) // Start with 1 (not 0)
        {
            key = z[j];
            for (i = j - 1; (i >= 0) && (z[i] > key); i--) // Smaller values are moving up
            {
                z[i + 1] = z[i];
            }
            z[i + 1] = key;    // Put the key in its proper location
        }
        //Print an Array after Sorting
        System.out.println("An Array after Sorting");
        for (int d = 0; d < z.length; d++) {
            System.out.println(z[d]);
        }
    }
}
