/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

/**
 *
 * @author mj
 */
public class Elipse extends Figura {
    
    private double ejeuno;
    private double ejedos;
    
    public Elipse(){
        super(0, 0);
    }

    public Elipse(double ejeuno, double ejedos) {
       // super(x, y);
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
        return Math.PI * ejeuno * ejedos;
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double perimetro() {
        
    return (Math.PI *(3*(ejeuno*ejedos))-(Math.sqrt((3*ejeuno + ejedos) *(ejeuno+ejedos*3))));
    
          //   return Math.PI * ejeuno * ejedos;
        //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }
    
}
