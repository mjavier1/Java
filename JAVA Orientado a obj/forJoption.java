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
public class Ciclosfor {
    public static void main(String[] args) {
        //tabla de multicar 1 a 10 el usariio
        
        String datos=JOptionPane.showInputDialog(null, "Dame un numero: ");
        float numuno=Float.parseFloat(datos);
        String cad="";
        
        for (int i = 1; i <=10; i++) {
           
            cad=cad + numuno + " x " + i+ "= " + (numuno * i) +"\n";
        
        
        
        }
        //matematica messange 
        JOptionPane.showMessageDialog(null, cad);
        
        
        
    }
    
}
