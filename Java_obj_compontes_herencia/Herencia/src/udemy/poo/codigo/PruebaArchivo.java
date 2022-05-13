/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;
import java.io.File;

/**
 *
 * @author mj
 */
public class PruebaArchivo {
    public static void main(String[] args) {
       File archivo = new File(System.getProperty("user.dir"));
        System.out.println(archivo);
        
    }
    
}
