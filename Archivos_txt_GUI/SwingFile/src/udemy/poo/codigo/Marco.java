/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

import javax.swing.JFrame;

/**
 *
 * @author mj
 */
public class Marco extends JFrame  {
 public Marco()
 {
     this.setSize(600,500);
     this.setLocationRelativeTo(this);
     this.setTitle("Obtencion de datos personales");
    this.setResizable(false);
    Lamina lamina = new Lamina();
  add(lamina);
    
 }
}
