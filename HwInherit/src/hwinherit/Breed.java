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
public class Breed extends Dog {
    private final String dogBreed;
    
    Breed(String n, String g, int a, int w, String b) {
        super(n, g, a, w);
        
        dogBreed = b;
    }
    String getDogBreed(){ return dogBreed;}
    
    void showBreed() {
        System.out.println(getName() + " is a " + dogBreed + ".");
    }
}
