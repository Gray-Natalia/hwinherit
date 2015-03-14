/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwinherit;

/**
 *
 * @author kalavic
 */
public class Daughter1 extends FamilyMembers {
    private String talents;
    
    //Constructor
    Daughter1(String n, String g, int a, String t){
    setName(n);
    setGender(g);
    setAge(a);
    
    talents = t;
            }
    
    void showTalents() {
        System.out.println(getName() + " knows how to " + talents + ".");
    }
}
