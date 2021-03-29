/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo5.pkg2022431708.latihan53.rabbit;

/**
 *
 * @author HP
 */
public class Animal {
    
    private boolean vegetarian = true;
    private String eats;
    private int noOfLegs;
    
    /**
     *
     * @param vegetarian
     * @param food
     * @param legs
     */
    Animal(boolean vegetarian, String food, int legs){
       this.vegetarian = true;
       this.eats = "grass";
       this.noOfLegs = 4;
   }
   
  public String getEats(){
      return eats;
  }
  
  public int getNoOfLegs(){
      return noOfLegs;
  }
  
}
