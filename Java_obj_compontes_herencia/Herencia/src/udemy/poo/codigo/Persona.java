/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

/**
 *
 * @author mj
 */
public abstract class Persona {
   private String nombre;
   private double sueldos;

    public Persona(String nombre, double sueldos) {
        this.nombre = nombre;
        this.sueldos = sueldos;
    }
    
   public abstract double incremento();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldos() {
        return sueldos;
    }

    public void setSueldos(double sueldos) {
        this.sueldos = sueldos;
    }
   
   
}
