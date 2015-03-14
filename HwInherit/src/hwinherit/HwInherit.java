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
        Daughter d1 = new Daughter("Yeva", "girl", 6, "dance");
        Daughter d2 = new Daughter("Celestia", "girl", 3, "color");
        
        d1.showInfo();
        d1.showTalents();
        System.out.println();
        
        d2.showInfo();
        d2.showTalents();
    }
    
}
