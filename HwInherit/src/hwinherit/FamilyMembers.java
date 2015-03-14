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
//super-class
public class FamilyMembers {
    private String name, gender;
    private int age;
   
    String getName(){ return name; }
    String getGender(){ return gender;}
    int getAge(){return age;}
    void setName(String n){name = n;}
    void setGender(String g){gender = g;}
    void setAge(int a){age = a;}
    
    void showInfo() {
        System.out.println("Family member's name is " + name +
                ". The age is " + age +
                " and " + name + " is a " + gender + ".");
    }
}
    
