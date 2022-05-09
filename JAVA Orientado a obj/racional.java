/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

/**
 *
 * @author mj
 */
public class Racional {
    
   
       private int numrador;
       private int denominador;

    public Racional(int numrador, int denominador) {
        this.numrador = numrador;
        this.denominador = denominador;
    }

    public int getNumrador() {
        return numrador;
    }

    public void setNumrador(int numrador) {
        this.numrador = numrador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return +this.numrador + "/ "+  this.denominador;
    }
    
    
       
    }

sd
