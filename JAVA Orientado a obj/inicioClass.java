/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

import javax.swing.JOptionPane;

/**
 *
 * @author mj
 */
public class inicio {
    
    public static void main(String[] args) {
     String datos =   JOptionPane.showInputDialog(null,"Dame numero de velocidad inicial ");
        float numUno=Float.parseFloat(datos);
     String datos2 =   JOptionPane.showInputDialog(null,"Dame numero de velocidad inicial ");
        int numdos=Integer.parseInt(datos2);
           
        TipoParabolicos obj = new TipoParabolicos(numUno,numdos);
        JOptionPane.showMessageDialog(null, "La altura maxima es : " + obj.alturaMaxima()+ "El alcance es :" + obj.alcance(),"Resultado ", JOptionPane.INFORMATION_MESSAGE);
        
        
        
        
    }
    
}
