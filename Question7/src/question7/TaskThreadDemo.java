/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author User
 */

public class TaskThreadDemo extends Thread implements Runnable{
    //Variables.  
    
    //Run Method.  
    @Override
    public void run() {
        TinCounter tc1 = new TinCounter();
        System.out.println("The belt is done.  ");
    }
    
    //Start Method.  
    public void Start(){
        System.out.println("Thread has started.  ");
    }
}
