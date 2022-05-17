package udemy.poo.codigo;



import javax.swing.JFrame;
import udemy.poo.codigo.Lamina;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mj
 */
public class Marco extends JFrame {
    public Marco(){
        this.setSize(400,500);
        this.setLocationRelativeTo(this);
        this.setResizable(false);
    this.setTitle("Eventos de raton y teclado");
Lamina lamina = new Lamina();
this.add(lamina);
lamina.setFocusable(true);

    }
}
        
