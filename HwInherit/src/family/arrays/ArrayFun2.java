/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package family.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author kalav_000
 */
public class ArrayFun2 {
    private Object num2;
    public void getInput2(){
         int i,n,nb;   
        boolean valid2 = false; // flag to indicate if valid character entered
        Scanner numb = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        while (!valid2) {
        
        System.out.print("Enter the size of an array: ");
        
               // prompt for input
            try {
               
        nb = numb.nextInt(); 
        int a[] = new int[nb];
        
        System.out.println("Enter elements in array");
        
        for(i=0;i<nb;i++)
        {
            a[i]=num.nextInt();
                        }
            getSum(a);
        minMax(a);
        InsertionSort(a);
            }
               
            catch (NegativeArraySizeException e){
            System.out.println("You can't enter negative numbers.");
             }
            catch (InputMismatchException exp){
            
            System.out.println("Please enter a number.");
           }
       /* finally { 
      System.out.println("You're hopeless"); 
           }*/
        valid2 = false; // signal that a valid marker was entered 
        
        }
       
                 
       
        
        }
        
                       
     
               
        
        public static void minMax( int  x [ ] ){
        int min, max;
        
        min = max = x[0];
        for (int i = 0;  i < x.length - 1;  i++){
            if(x[i] < min) min = x[i];
            if(x[i] > max) max = x[i];
        }
        System.out.println("Min and Max: " + min + " and " + max);
    }
    public static void getSum( int y []){
        int sum = 0; 
 
        // Use for-each style for to display and sum the values. 
        for(int x : y) { 
            System.out.println("Value is: " + x);
            sum += x; 
        } 
 
        System.out.println("Summation: " + sum); 
    }
    public static void InsertionSort( int z[]){
     int j;                     // the number of items sorted so far
     int key;                // the item to be inserted
     int i;  

     for (j = 1; j < z.length; j++)    // Start with 1 (not 0)
    {
           key = z[ j ];
           for(i = j - 1; (i >= 0) && (z[ i ] > key); i--)   // Smaller values are moving up
          {
                 z[ i+1 ] = z[ i ];
          }
         z[ i+1 ] = key;    // Put the key in its proper location
     }
     //Print an Array after Sorting
        System.out.println("An Array after Sorting");
        for (int d = 0; d < z.length; d++){
            System.out.println(z[d]);
        }
    }
}
