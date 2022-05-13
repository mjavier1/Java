/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

/**
 *
 * @author mj
 */

public class ElipseImplements implements FiguraInterface  {

    private double ejeuno;
    private double ejedos;

    public ElipseImplements(double ejeuno, double ejedos) {
        this.ejeuno = ejeuno;
        this.ejedos = ejedos;
    }

    public double getEjeuno() {
        return ejeuno;
    }

    public void setEjeuno(double ejeuno) {
        this.ejeuno = ejeuno;
    }

    public double getEjedos() {
        return ejedos;
    }

    public void setEjedos(double ejedos) {
        this.ejedos = ejedos;
    }
    
    
    @Override
    
    public double area() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     return Math.PI * ejeuno*ejedos;
    }

    @Override
    public double perimetro() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         return (Math.PI *(3*(ejeuno*ejedos))-(Math.sqrt((3*ejeuno + ejedos) *(ejeuno+ejedos*3))));
    }
    
    
}
