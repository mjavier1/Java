/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package princioopp.poo.incio;

import javax.swing.JOptionPane;
import princioopp.poo.codigo.PrincioOpp;

/**
 *
 * @author mj
 * importante primero anadir importt clase donde paquete 
 * import princioopp.poo.codigo.PrincioOpp; ejemplos
 * crea clase llamarla crea una variable texto 
 * PrincioOpp persona  = new PrincioOpp
 * 
 */
public class Inicio {
    public static void main(String[] args) {
      PrincioOpp persona  = new PrincioOpp ("marcos", "aguirre", "rodriguez", "1");
      PrincioOpp personados  = new PrincioOpp ();
        
    //    JOptionPane.showMessageDialog(null, persona.getNombre());
      //  JOptionPane.showMessageDialog(null, personados.getNombre());
      JOptionPane.showMessageDialog(null, persona.toString());
      persona.setApellidopa("Cortes");
      JOptionPane.showMessageDialog(null, persona.getApellidopa());
      JOptionPane.showMessageDialog(null, persona.toString());
        //persona.setApellidopa(apellidopa);
        
        
        
    }
}
