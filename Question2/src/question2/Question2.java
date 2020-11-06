/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 *
 * @author User
 */

public class Question2 {

    /*
     * Heinrich Scheepers 3D8BCMQ24.  
     */
    
    public static void main(String[] args) {
        //Creating ArrayList.  
        ArrayList<String> langList = new ArrayList<String>();
        
        //Adding Elements to ArrayList.  
        langList.add("Java");
        langList.add("C#");
        langList.add("PHP");
        langList.add("Python");
        
        //Using ListIterator method to create ListIterator Object.  
        ListIterator lItr = langList.listIterator();
        
        //hasNext() and Next() iterates through the list in forward.  
        System.out.println("Iterating in a forward direction");
        while(lItr.hasNext()){
            System.out.println(lItr.next());
        }
        
        System.out.println("");
        
        //hasPrevious and previous iterates through the list in reverse.  
        System.out.println("Iterating in a reverse direction");
        while(lItr.hasPrevious()){
            System.out.println(lItr.previous());
        }
    }
}
