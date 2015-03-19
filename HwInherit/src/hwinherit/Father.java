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
public class Father extends FamilyMember {
    private final String action;
    
    //Constructors
    Father(){
    super();
    action = "none";
    }
    
    Father(String n, String g, int a, String ac){
    super(n, g, a);
    
    action = ac;
            }
    
    void showAction() {
        System.out.println(getName() + " needs to be " + action + " often.");
    } 
    
    
}
