package hwinherit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kalav_000
 */
public class Dog extends FamilyMember {
    private int walk;
    
    //Constructors
    Dog(){
    super();
    walk = 0;
    }
    
    Dog(String n, String g, int a, int w){
    super(n, g, a);
    
    walk = w;
            }
    
    void showWalks() {
        System.out.println(getName() + " needs to be walked out " + walk + " times a day.");
    } 
    
}
