/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/*
 * @author User
 */

public class Athletes implements Runnable{

    public String aName;
    
    public Athletes(String name) {
        aName = name;
    }
    
    //Run Method
    @Override
    public void run() {
        int j = 10;
        int number = (int) (Math.random() * 2000 + 1);          //random number generator
                                                                //For sleep timer.  
        for(int i=10;i<=100;i=i+j){
            try {Thread.sleep(number);
            } catch (InterruptedException e) {
                System.out.println(e);
            }System.out.println(i+" m"+": "+this.aName);
        }
        System.out.println(aName+"Finishes !!!");
    }    
}

