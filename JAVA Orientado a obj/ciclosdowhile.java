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
public class ciclosdowhile {
    public static void main(String[] args) {
        String dato= JOptionPane.showInputDialog(null,"Dame numero");
        int numUno=Integer.parseInt(dato);
        int mult=1;
        String cad="";
     do{
         cad = cad + numUno + " x " + mult + " = " +(numUno*mult)+"\n";
         mult+=1;
         
         
         
     }while(mult<=10);
   JOptionPane.showMessageDialog(null, cad);
   
   
   
    }
  // JOptionPane.showMessageDialog(null, cad);
    
}

