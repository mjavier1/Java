/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

/**
 *
 * @author mj
 */
public class Rectangulo extends Figura  {
    
  
    private double eje1;
    private double eje2;

    public Rectangulo(double eje1, double eje2) {
        //super(x, y);
        this.eje1 = eje1;
        this.eje2 = eje2;
    }

    public double getEje1() {
        return eje1;
    }

    public void setEje1(double eje1) {
        this.eje1 = eje1;
    }

    public double getEje2() {
        return eje2;
    }

    public void setEje2(double eje2) {
        this.eje2 = eje2;
    }
    
    
    
    

    @Override
    public double area() {
        return eje1* eje2;
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double perimetro() {
        
        return (2*eje1)+(2*eje2);
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
