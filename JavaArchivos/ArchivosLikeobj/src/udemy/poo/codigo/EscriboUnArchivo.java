/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mj
 */
public class EscriboUnArchivo {
    public static void main(String[] args) throws IOException {
        FileOutputStream  fo= null;
        try {
            File  f= new File(System.getProperty("user.dir")+"/Archivo");
            fo = new FileOutputStream(f);
            ObjectOutput ou = new ObjectOutputStream(fo);
            ou.writeObject(new Persona("mj", "agu", "rodr", 26));
            ou.close();
            
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
          //  Logger.getLogger(EscriboUnArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fo.close();
            } catch (IOException ex) {
                ex.printStackTrace();
             //   Logger.getLogger(EscriboUnArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }
    
}
