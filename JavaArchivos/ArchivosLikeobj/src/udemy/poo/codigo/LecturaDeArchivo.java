/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mj
 */
public class LecturaDeArchivo {
    public static void main(String[] args) throws IOException {
        FileInputStream  fi =null;
        try {
            File  f =new File (System.getProperty("user.dir")+"/Archivo.txt");
            fi = new FileInputStream(f);
            ObjectInputStream oi = new ObjectInputStream(fi); 
            Persona ob = null;
            do {                
                ob=(Persona)oi.readObject();
                System.out.println(ob.toString());
            } while (true);
            
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        //    Logger.getLogger(LecturaDeArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } 
    catch (IOException ex) {
         System.out.println("Fin del archivo");
        //    Logger.getLogger(LecturaDeArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } 
          catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        //    Logger.getLogger(LecturaDeArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
        finally {
            try {
                fi.close();
            } catch (IOException ex) {
             //   ex.printStackTrace();
              Logger.getLogger(LecturaDeArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
}
