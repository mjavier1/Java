/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.inicio;

//import java.awt.Rectangle;
//import java.awt.Rectangle;
import javax.swing.JOptionPane;
import udemy.poo.codigo.Elipse;
import udemy.poo.codigo.ElipseDos;
import udemy.poo.codigo.ElipseImplements;
import udemy.poo.codigo.Empleado;
import udemy.poo.codigo.Rectangulo;
import udemy.poo.codigo.jefearea;

/**
 *
 * @author mj
 */
public class inicio {
    public static void main(String[] args) {
        Elipse ep = new Elipse (3,2);
       ElipseDos dos = new ElipseDos(2, 3);
       ElipseImplements ei= new ElipseImplements(3,2);
       
        
        Rectangulo rep = new Rectangulo(4,4);
        Empleado emp =new  Empleado("mj",100);
        jefearea jefe= new jefearea("mjk",200);
        
        JOptionPane.showMessageDialog(null,"Area de elipse {abstract }: " +dos.area()+ 
           "\n"+ "Area de elipse {nomal }:" +ep.area()  +"\n"
        + "Area de elipse {interface }:" +ei.area()  +"\n");
        
        
        /*JOptionPane.showMessageDialog(null,ep.area()+"\n"+rep.area());
        JOptionPane.showMessageDialog(null,emp.incremento());
        JOptionPane.showMessageDialog(null,jefe.incremento());
        /*
      
        */
    }   

   
    
    
    
}
