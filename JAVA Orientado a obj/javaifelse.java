/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.inicio;

import javax.swing.JOptionPane;

/**
 *
 * @author mj
 Recibir un numero por joptionpane y que me diga si es igual no a ciertos criterios que le proporcione.
 
 */
public class Ciclosifelse {
    
    public static void main(String[] args) {
        
    String dato= JOptionPane.showInputDialog(null,"Dame un numero:");
    int numuno=Integer.parseInt(dato);
    
    String igual="";
    
        if (numuno==10) {
            igual = igual +"El numero es igual a 10";
            
        }
        else if(numuno==20){
            igual=igual+"El numero es igual a 20";
            
        }
        else if(numuno==30){
            igual=igual+"El numero es igual a 30";
            
        }
        else {
            igual=igual + "El numero esta dentro del rango permitido";
            
        }
    JOptionPane.showMessageDialog(null, igual);
    
    }
    
}
