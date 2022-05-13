/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

/**
 *
 * @author mj
 */
public class jefearea extends Persona {

    public jefearea(String nombre, double sueldos) {
        super(nombre, sueldos);
    }

   
    
    @Override
    public double incremento() {
        return this.getSueldos() *2;
        
        
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
