/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwinherit;

import family.enums.Family;

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
        Daughter d1 = new Daughter("Yeva", "girl", 6, "dance");
        Daughter d2 = new Daughter("Celestia", "girl", 3, "color");
        Father f1 = new Father("Kevin", "boy", 32, "tickled");
        
        b1.showInfo();
        b1.showWalks();
        b1.showBreed();
        System.out.println();
        
        d1.showInfo();
        d1.showTalents();
        System.out.println();
        
        d2.showInfo();
        d2.showTalents();
        System.out.println();
        
        f1.showInfo();
        f1.showAction();
        System.out.println("Here is the list of the books that " + f1.getName()+" likes to read:");
        System.out.println();
        
         BookPages books[] = new BookPages[5]; 
 
    books[0] = new BookPages ("How to be a parent for dummies", 
                      "Schildt", 201); 
    books[1] = new BookPages("Java: The Complete Reference", 
                      "Gray", 214); 
    books[2] = new BookPages("The Art of Parenting", 
                      "Schildt and Holmes", 303); 
    books[3] = new BookPages("Red Storm Rising", 
                      "Clancy", 198); 
    books[4] = new BookPages("Tarzan", 
                      "Kerouac", 195); 
    
        for (BookPages book : books) { 
            book.show();
        }
 
    // Find books by author 
    System.out.println("Showing all books that has less than 200 pages"); 
        for (BookPages book : books) {
            if (book.getPages() <= 200) {
                System.out.println(book.getTitle());
            }
        }
    System.out.println();
    
    CheckInterface ob = new CheckInterface() {}; 
    
    System.out.println("Checking interfaces"); 
    System.out.println();
    
    ob.meth1(); 
    ob.meth2(); 
    ob.meth3();
    
    System.out.println();
    
    Family member;
     System.out.println("Here are all Family members:"); 
 
    // use values() 
    Family allMembers[] = Family.values(); 
    for(Family f : allMembers) 
      System.out.println(f); 
 
    System.out.println(); 
 
        // use valueOf()
        Family mb = Family.valueOf("FATHER"); 
    System.out.println(mb + " is a patriarh of the Family.");
  } 
    
    
}
