/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.inicio;

import javax.swing.JOptionPane;

/**
 *
 * @author mj
 * recibir tres numero y determinar cual es el mayor cual el medio y cual el menor 
 */

public class Cicloloop {
    public static void main(String[] args) {
        String datos1=JOptionPane.showInputDialog(null,"Dame el numero 1:");
       String datos2=JOptionPane.showInputDialog(null,"Dame el numero 2:");
       String datos3=JOptionPane.showInputDialog(null,"Dame el numero 3:");
        int numuno=Integer.parseInt(datos1);
        int numdo=Integer.parseInt(datos2);
        int numtr=Integer.parseInt(datos3);
        
        if(numdo > numdo){
            if (numuno>numtr) {
                if (numtr>numdo) {
                    JOptionPane.showMessageDialog(null, "El numero mayor es: "+numuno + "\n" + "El numero medio es :"+ numtr +"\n"+"El numero menor" + numdo);
                }
                else{
                    JOptionPane.showMessageDialog(null, "El numero mayor es: "+numuno + "\n" + "El numero medio es :"+numdo +"\n"+"El numero menor" + numtr);
                }
            }else {
                JOptionPane.showMessageDialog(null, "El numero mayor es: "+numtr + "\n" + "El numero medio es :"+ numuno +"\n"+"El numero menor" + numdo);
            }
        }else{

    if(numdo>numtr){
        if (numtr >numuno) {
            
            JOptionPane.showMessageDialog(null, "El numero mayor es: "+numdo + "\n" + "El numero medio es :"+ numtr +"\n"+"El numero menor" + numuno);
        } else{
            JOptionPane.showMessageDialog(null, "El numero mayor es: "+numdo + "\n" + "El numero medio es :"+ numuno +"\n"+"El numero menor" +numtr);
            
        }
    }else
    {
        JOptionPane.showMessageDialog(null, "El numero mayor es: "+numtr + "\n" + "El numero medio es :"+ numdo +"\n"+"El numero menor" + numuno);
    }
        
        }
        
        
    }
}
