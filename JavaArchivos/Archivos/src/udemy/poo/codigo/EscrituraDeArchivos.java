/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mj
 */
public class EscrituraDeArchivos {
    public static void main(String[] args) {
        FileWriter fr = null;
        try {
            File archivo = new File (System.getProperty("user.dir")+"/gato.txt");
            
          //  ("user.dir")+"/gato.txt")
            fr = new FileWriter(archivo);
            PrintWriter pw = new PrintWriter(fr);
                  for (int i = 0; i < 7; i++) {
             pw.println("Esta es una linea en java");
             
            }
          
             pw.println("Borre los datos");
            pw.close();
            
            
        } catch (IOException ex) {
          ex.printStackTrace();
      
//  Logger.getLogger(EscrituraDeArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
        ex.printStackTrace();
//  Logger.getLogger(EscrituraDeArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
