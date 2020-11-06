/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.TreeSet;

/*
 * @author User
 */
public class Question3 {

    /*
     * Heinrich Scheepers 3D8BCMQ24
     */
    
    public static void main(String[] args) {
        //Creating the treeSet.  
        TreeSet<String> tree1 = new TreeSet<>();
        
        //i. Populating the set.  
        tree1.add("Kagiso");
        tree1.add("Thando");
        tree1.add("Riaan");
        tree1.add("Xolani");
        tree1.add("Palesa");
        
        //ii. Display All Elements in treeSet.  
        System.out.println("Elements in tree1: ");
        System.out.println(tree1);
        System.out.println("");
        
        //iii. Get the last element in the treeSet.  
        System.out.println("Last element in tree: "+tree1.last());
        
        //iv. Elements that are greater than or equal to R in set.  
        String val = "R";
        System.out.println("Elements equal to/greater than 'R' in the set :");
        System.out.println("");
        System.out.println("Higher " + tree1.higher(val));
    }
}
