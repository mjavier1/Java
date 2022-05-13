/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

/**
 *
 * @author mj
 */
public class ElipseDos extends FiguraDos{

    private double ejeuno;
    private double ejedos;

    public ElipseDos(double ejeuno, double ejedos) {
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
    
    public double perimetro() {
 return (Math.PI *(3*(ejeuno*ejedos))-(Math.sqrt((3*ejeuno + ejedos) *(ejeuno+ejedos*3))));        
//return super.perimetro(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double area() {
      //  return super.area(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
       return Math.PI * ejeuno*ejedos;
    }









//     return (Math.PI *(3*(ejeuno*ejedos))-(Math.sqrt((3*ejeuno + ejedos) *(ejeuno+ejedos*3))));
}
