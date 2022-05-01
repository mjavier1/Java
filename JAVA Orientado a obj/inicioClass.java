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
           
        TipoParabolicos obj1 = new TipoParabolicos(numUno,numdos);
        JOptionPane.showMessageDialog(null, "La altura maxima es : " + obj1.alturaMaxima()+ "El alcance es :" + obj1.alcance(),"Resultado", JOptionPane.INFORMATION_MESSAGE);
        
        //componetes 
        String datos3 =   JOptionPane.showInputDialog(null,"Dame el tiempo ");
        int numt=Integer.parseInt(datos3); 
      
       String y = null;
      
       componetes[]datoss=obj1.calcComp(numt);  
       
    
        for (componetes objeto:datoss) {
            y=objeto.getTiempo() +" ; "+ objeto.getX()+" ; " + objeto.getY()+"\n";
            
        }
        JOptionPane.showMessageDialog(null, y,"compontes,",JOptionPane.INFORMATION_MESSAGE);
        
        
        
        
    }
    
}
