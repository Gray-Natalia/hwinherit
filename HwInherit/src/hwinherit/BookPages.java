/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwinherit;

/**
 *
 * @author kalav_000
 */
public class BookPages extends familybooks.Book { 
  private int pages; 
 
  public BookPages(String t, String a, int p) { 
    super(t, a); 
    pages = p; 
  } 
 
  @Override
  public void show() { 
    super.show(); 
    System.out.println(pages); 
    System.out.println(); 
  } 
 
  public int getPages() { return pages; } 
  public void setPages(int p) { pages = p; } 
 
  
  public String getTitle() { return title; } 
  public void setTitle(String t) { title = t; } 
  public String getAuthor() { return author; } 
  public void setAuthor(String a) { author = a; } 
} 
