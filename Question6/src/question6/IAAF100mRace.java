/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/*
 * @author User
 */

public class IAAF100mRace extends Thread{

    /*
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Instance Athlete objects.  
        Athletes a1 = new Athletes("Usain Bolt");
        Athletes a2 = new Athletes("Christian Coleman");
        
        //Creating the threads.  
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a2);
        
        System.out.println("The race has started: ");
        
        t1.start();
        t2.start();
    }
}
