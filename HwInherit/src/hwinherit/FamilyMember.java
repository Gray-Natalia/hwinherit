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
public class FamilyMember {
    private String name, gender;
    private int age;
    
    FamilyMember(){
        name = gender = "none";
        age = 0;
    }
    
    FamilyMember(String n, String g, int a){
        name = n;
        gender = g;
        age = a;
    }
    
    FamilyMember(FamilyMember ob) {
        name = ob.name;
        gender = ob.gender;
        age = ob.age;
    }
   
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
