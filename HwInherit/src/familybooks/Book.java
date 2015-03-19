/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familybooks;

/**
 *
 * @author kalav_000
 */
public class Book {
  protected String title; 
  protected String author;  
  
 
  public Book(String t, String a) { 
    title = t; 
    author = a; 
    
  } 
 
  public void show() { 
    System.out.println(title); 
    System.out.println(author); 
    System.out.println(); 
  }
}
