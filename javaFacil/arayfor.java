
package com.mycompany.tipodedatos;

import java.util.Scanner;

/**
 *
 * @author marcos aguirre curso udemy 
 */
public class Tipodedatos {

    public static void main(String[] args) {

        //declara variable scanner input 
        String cuidadesl="";
        Scanner in= new Scanner(System.in);
        String cuidades[]=new String[5];
        for (int i = 0; i < cuidades.length; i++) {
            
            System.out.println("por favor escriba 5 cuidades");
            cuidades[i]=in.nextLine();
            
            cuidadesl=cuidades[0];
            
            
            
         //   cuidades[1];
            
            
            
        }
        
        //for variable string 
   //   for(String i:cuidades){
   //escribir 5 cinco sales orden escribr
   //primero escribir sale ultimo en pantalla for loop 
   
    for(int i=0;i< cuidades.length;i++){
          System.out.println("Las cuidades son :" + cuidades[i]);
           
         
      }
       
         System.out.println("La primera cuidades1 "+ cuidadesl); 
        
    }
     
       
} 
