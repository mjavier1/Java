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
public class Cicloswhile {
    public static void main(String[] args) {
        
        String datos=JOptionPane.showInputDialog(null, "Dame un numero: ");
        int numUno = Integer.parseInt(datos);
        int multiplo=1;
        String cad="";
        while (multiplo<=10) {            
            cad=cad + numUno + "x"+multiplo + "=" + (numUno  * multiplo) + "\n";
            multiplo += 1;
            
            System.out.println(multiplo);
            
        }
        
        JOptionPane.showMessageDialog(null, cad);
        
    }
    
}
