/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;

/**
 *
 * @author User
 */

public class Question1 {

    /*
     * Heinrich Scheepers 3D8BCMQ24
     */
    
    public static void main(String[] args) {
        //First we create an empty array list with initial capacity.  
        ArrayList<String> carsList = new ArrayList<>(5);
        
        //Adding values to the list.  
        carsList.add("Merc");
        carsList.add("Audi");
        carsList.add("VW");
        carsList.add("Alfa");
        carsList.add("Dodge");
        
        System.out.println("Cars in the ArrayList:");
        for(String value :carsList){
            System.out.println("Car: "+value);
        }
        System.out.println("The size of the list is :"+carsList.size());
        System.out.println("");
        
        //Creating an Array from the ArrayList.  
        String carsArray[] = new String[carsList.size()];
        carsArray = carsList.toArray(carsArray);
        
        System.out.println("Cars in the Array:");
        for(String value:carsArray){
            System.out.println("Car: "+value);
        } 
    }   
}
