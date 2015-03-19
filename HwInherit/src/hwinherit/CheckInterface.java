/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwinherit;

import family.interfaces.NewInterface;

/**
 *
 * @author kalav_000
 */
public abstract class CheckInterface implements NewInterface{
   @Override
   public void meth1() { 
    System.out.println("Implement meth1()."); 
  } 
   @Override
    public void meth2() { 
    System.out.println("Implement meth2()."); 
  } 
 
   @Override
  public void meth3() { 
    System.out.println("Implement meth3()."); 
  } 
}
