/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author mj
 */
public class Lamina extends JPanel implements ActionListener    {
private JPanel panel = new JPanel();
private JButton btnsave = new JButton("guadar");
private JButton btnller = new JButton("Leer");
private JLabel nombre = new JLabel("Nombre");
private JTextField cajanombre = new JTextField(20);
private JLabel labolape = new JLabel("Apellido");
private JTextField cajalast = new JTextField(20);
private JLabel labolma = new JLabel("ApellidoMaterno");
private JTextField cajalastma = new JTextField(20);
private JLabel edad = new JLabel("Edad");
private JTextField cajaedad = new JTextField(20);
private JTextArea areatxt= new JTextArea(10,40);
private JScrollPane scroll;


public Lamina(){
this.scroll = new JScrollPane(this.areatxt);


  this.btnsave.addActionListener(this);
    this.btnller.addActionListener(this);
    JPanel borderpan = new JPanel(new GridLayout(5, 2));
    
    nombre.setToolTipText("Ej. Luan emaual");
    borderpan.add(nombre);
    borderpan.add(cajanombre);
    
    labolape  .setToolTipText("Ej. cruz");
      borderpan.add(labolape);
      borderpan.add(cajalast);
    
      
      labolma.setToolTipText("Ej. rodriguez");
          borderpan.add(labolma);
    borderpan.add(cajalastma);

      edad.setToolTipText("Ej.25"); 
      borderpan.add(edad);
    borderpan.add(cajaedad);
   
    
    borderpan.add(btnsave);
    borderpan.add(btnller);
    panel.add(borderpan);
    JPanel borderpanel = new JPanel(new BorderLayout());
      borderpanel.setBorder(new TitledBorder("Datos personales"));
    borderpanel.add(panel,BorderLayout.CENTER);
    this.add(borderpanel);
    this.add(scroll);
    
    
  
        
        
    
    
    
    
    
    
}
private void escribi(){
    FileWriter fw =null;
    try {
           File f = new File(System.getProperty("user.dir") + "/Archivo");
        fw = new FileWriter(f);
        PrintWriter pw = new  PrintWriter(fw);
        pw.append(this.cajanombre.getText()+" " + cajalast.getText() +""+cajalastma.getText() + " "+  cajaedad.getText()
        +"\n");
        pw.close();
        
    } catch (IOException ex) {
        ex.printStackTrace();
       // Logger.getLogger(Lamina.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        try {
            fw.close();
        } catch (IOException ex) {
          ex.printStackTrace();
            
        }
    }
    
    
}
 private void leerarchivo(){
        FileReader fr = null;
        try {
             File f = new File(System.getProperty("user.dir") + "/Archivo");
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String cad = "";

            while ((cad = br.readLine()) != null) {
                this.areatxt.append(cad + "\n");
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }
        
        
        
        
    
     
     
     

    public void actionPerformed(ActionEvent e) {
     Object orig = e.getSource();
     
if(orig==this.btnsave)
{
    escribi();
    this.cajaedad.setText("");
     this.cajalast.setText("");
      this.cajalastma.setText("");
       this.cajanombre.setText("");
    this.btnsave.transferFocus();
    
    
    
    
    
    
    
    
}
else if(orig==this.btnller){
   leerarchivo();
   this.btnller.transferFocus();
    
}
//  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
