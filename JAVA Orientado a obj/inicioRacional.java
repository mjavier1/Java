/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.inicio;

import javax.swing.JOptionPane;
import udemy.poo.codigo.OperacionesRacionales;
import udemy.poo.codigo.Racional;

/**
 *
 * @author mj
 */
public class inicio {
    
    public static void main(String[] args) {
        String datoUno= JOptionPane.showInputDialog(null,"Dame el numerador 1");
            String datodos= JOptionPane.showInputDialog(null,"Dame el denominar  1");
            String datoTres= JOptionPane.showInputDialog(null,"Dame el numerador 2");
            String datocuatro= JOptionPane.showInputDialog(null,"Dame el denominar  2");
            int numuno= Integer.parseInt(datoUno);
              int numdos= Integer.parseInt(datodos);
                int numtres= Integer.parseInt(datoTres);
                  int numcuatro= Integer.parseInt(datocuatro);

             Racional objuno= new Racional (numuno,numdos);
             Racional objdos = new  Racional(numtres,numcuatro);
      //objuno and objdos variable corre
             OperacionesRacionales op= new OperacionesRacionales(objuno,objdos);
             Racional objtres = op.suma();
             Racional objcuatros = op.resta();
             JOptionPane.showMessageDialog(null, "La suma de "+ objuno +" + "+objdos + "="
              +  "\n"     + "La resta "  +objuno + "- "+objdos + "= "+ objcuatros + "\n" 
             +"La multicancion "  +objuno + "* "+objdos + "= "+ op.multiplicacion() + "\n" 
             +"La division "  +objuno + "/ "+objdos + "= "+ op.division()+ "\n" );
             
                  
            
             
    }
    
}
