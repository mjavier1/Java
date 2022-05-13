/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

/**
 *
 * @author mj
 */
public  class  Empleado extends Persona {
    public Empleado(String nombre,double sueldo){
        super(nombre,sueldo);
        
        
        
    }

    @Override
    public double incremento() {
    return  this.getSueldos()* 1.5;        
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   

}
