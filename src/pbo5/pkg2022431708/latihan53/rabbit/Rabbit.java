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
public class Rabbit {
    
    public String color;
    public String name;
    
    Rabbit(String name, boolean veg, String food, int legs, String colour){
        color = "Gray";
        this.name =  "Petter";    
    }
    
    public String getColor(){
        return color;
    }
    
    public String getName(){
        return name;
    }
    
    
    
}
