/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

/**
 *
 * @author mj
 */
public class OperacionesRacionales {
    private Racional racionauno;
    private Racional racionaldos;

    public OperacionesRacionales(Racional racionauno, Racional racionaldos) {
        this.racionauno = racionauno;
        this.racionaldos = racionaldos;
    }
    
    public Racional suma(){
        int numerador = (this.racionauno.getDenominador()*this.racionaldos.getDenominador())+(this.racionauno.getDenominador()*this.racionaldos.getDenominador());  
        int denominador = this.racionauno.getDenominador()*this.racionaldos.getDenominador();
        
        return new Racional (numerador,denominador);
        
        
        
    
    }
       public Racional resta(){
        int numerador = (this.racionauno.getDenominador()*this.racionaldos.getDenominador())-(this.racionauno.getDenominador()*this.racionaldos.getDenominador());  
        int denominador = this.racionauno.getDenominador()*this.racionaldos.getDenominador();
        
        return new Racional (numerador,denominador);
        
        
        
    
    }
       public Racional multiplicacion(){
           int numerador = this.racionauno.getNumrador() * this.racionaldos.getDenominador();
           int denominador=this.racionauno.getDenominador()*this.racionaldos.getDenominador();
            return new Racional (numerador,denominador);
            
           
       }
       public Racional division (){
       int numerador=this.racionauno.getNumrador()* this.racionaldos.getDenominador();
       int denominador = this.racionauno.getDenominador() * this.racionaldos.getNumrador();
       
        return new Racional (numerador,denominador);
           
       
       
       
       
       
       }   

    public Racional getRacionauno() {
        return racionauno;
    }

    public Racional getRacionaldos() {
        return racionaldos;
    }
       
       
}
