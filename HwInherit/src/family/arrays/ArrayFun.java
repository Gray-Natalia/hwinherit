/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package family.arrays;

import java.util.Scanner;

/**
 *
 * @author kalav_000
 */
public class ArrayFun {
     public void getInput(){
            
                  
        Scanner in = new Scanner(System.in);
        String[] num = new String[6];
        for (int k = 0; k < num.length; k++) {
            
        boolean valid = false; // flag to indicate if valid character entered
        while (!valid) {
        // prompt for input
        System.out.println("Enter any letter from A to K.");

        // get input from user           
        num[k] = in.nextLine();
        
        // no marker entered?
        if (num[k] == null  || num[k].length() < 1) {
            System.out.println("Invalid input. Please try again.\n");
            continue;
        }
                    
        // grab only the first character and convert it to upper case
        num[k] = num[k].substring(0, 1).toUpperCase();
        
        char c = num[k].charAt(0);    
                
        // Repeats loop if input is less than A
        if (c < 'A') {  
            System.out.println("Invalid input. \nPlease try again.\n");
            continue;
        }

        // Repeats loop if input is greater than the last column
        if (c > 'K'){ 
            System.out.println("Invalid input. \nPlease try again.\n");
            continue;   
        }

        valid = true; // signal that a valid marker was entered
        }}
        //Print an Array before Sorting
        System.out.println("An Array before Sorting");
        for (int g = 0; g < num.length; g++){
            System.out.println(num[g]);
        }
        
        sortString(num);
// Using Exchange Sort to do the Alphabetic Sorting 
        
        //Print an Array after Sorting
        System.out.println("An Array after Sorting");
        for (int g = 0; g < num.length; g++){
            System.out.println(num[g]);
        }
    }
    public static void sortString( String  x [ ] ){
        int i, j;
        String temp;

        for ( i = 0;  i < x.length - 1;  i++ )  {
            for ( j = i + 1;  j < x.length;  j++ ){  
                 if ( x [ i ].compareToIgnoreCase( x [ j ] ) > 0 ) {                                            
                     // ascending sort
                    temp = x [ i ];
                    x [ i ] = x [ j ];    // swapping
                    x [ j ] = temp; 
                                      
                           } 
                   } 
             } 
    } 
}
        

