/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mj

un archivo es un fichero dato almacendo en algun 
recurso de memoria , generalmente en disco duro , pero
dependiendo del uso (en ciertos casos) son almacenados en ram 

Que usaremos 

hay mucho tipos de archivos.ocuparemos los archivos de texto , que son los que contienen texto, y pueden ser
abieros y modificados usando un editor de texto.

Lectura y Escritura
La escritura y lectura de archivos en java se 
pueden realizar con un manejo muy similar al de salidas y entradas stda.
* 
 */


public class Archivo {
    public static void main(String[] args) {
        FileReader fr = null;
        
        try {
            File Archivo = new File (System.getProperty("user.dir")+"/gato.txt");
            fr = new FileReader(Archivo);
            BufferedReader rd = new BufferedReader(fr);
            String cad="";
            while ((cad=rd.readLine()) !=null)  {                
                System.out.println(cad);
                
            }
            
            
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
           // Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            ex.printStackTrace();
            
       //     Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
         ex.printStackTrace();

// Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
       }
    
    
}
