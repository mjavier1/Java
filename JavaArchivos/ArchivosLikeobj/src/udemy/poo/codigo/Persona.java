/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

import java.io.Serializable;

/**
 *
 * @author mj
 */
public class Persona implements Serializable {
    
    private String nombre;
    private String apellido;
       private String apellidoma;
       private int edad;

    public Persona(String nombre, String apellido, String apellidoma, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellidoma = apellidoma;
        this.edad = edad;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellidoma() {
        return apellidoma;
    }

    public void setApellidoma(String apellidoma) {
        this.apellidoma = apellidoma;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona: " + "nombre=" + nombre + ", apellido " + apellido + ", "
                + "apellidoma=" + apellidoma + ", edad=" + edad;
    }
       
       
    
    
    
    
}
