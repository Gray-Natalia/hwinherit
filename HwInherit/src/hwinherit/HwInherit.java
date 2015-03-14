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
public class HwInherit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Breed b1 = new Breed("Chelsey", "girl", 1, 3, "Puddle");
        Daughter d = new Daughter();
        Daughter d1 = new Daughter("Yeva", "girl", 6, "dance");
        Daughter d2 = new Daughter("Celestia", "girl", 3, "color");
        Daughter d3 = new Daughter(d2);
        
        b1.showInfo();
        b1.showWalks();
        b1.showBreed();
        System.out.println();
        
        d = d1;
        
        d.showInfo();
        d.showTalents();
        System.out.println();
        
        d1.showInfo();
        d1.showTalents();
        System.out.println();
        
        d2.showInfo();
        d2.showTalents();
        System.out.println();
        
        d3.showInfo();
        d3.showTalents();
    }
    
}
