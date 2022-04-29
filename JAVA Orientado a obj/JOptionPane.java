/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.inicio;

import javax.swing.JOptionPane;

/**
 *
 * @author mj
 */
        
 //Recibir un numero por joption y el numero que le de, me devuelva
        //si es un numero par o impar , mostrar resultado en JOptionPane
//int numerodos;
//int 
public class cicloifelse {
    public static void main(String[] args) {
        //psvm 
        String datos= JOptionPane.showInputDialog(null,"Dame el numero positivos");
        int numUno= Integer.parseInt(datos);
        String par = "";
        if (numUno % 2 == 0 ) {
            par = par +"El numero "+numUno+" es par ";
            
            
        }else{
            par = par +" El numero  "+numUno + " es impar";
        }
      JOptionPane.showMessageDialog(null, par,"Que numero es ",JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    
}
