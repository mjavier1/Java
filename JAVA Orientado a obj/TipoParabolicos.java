/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

/**
 *
 * @author mj
 */
public class TipoParabolicos {
    private float velocodadincial;
    private int grado;
    private final float gravedad=9.8f;

    public TipoParabolicos(float velocodadincial, int grado) {
        this.velocodadincial = velocodadincial;
        this.grado = grado;
    }
    public float alturaMaxima (){
        float voy=(float) (this.velocodadincial * Math.sin(Math.toRadians(grado)));
       float tiempo= voy / this.gravedad;
       float y = (float) (voy * tiempo-(4.9f * Math.pow(tiempo, 2)));
       
       
        
return y;
    }

    public float getVelocodadincial() {
        return velocodadincial;
    }

    public void setVelocodadincial(float velocodadincial) {
        this.velocodadincial = velocodadincial;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
    
public float alcance(){
    float vox=(float) (this.velocodadincial * Math.cos(Math.toRadians(grado)));
      float tiempo =(float) (2* ((this.velocodadincial * Math.sin(Math.toRadians(grado)))/this.gravedad));
      
       float x = (vox * tiempo);
       
    
    return x;  
    
}

public componetes [] calcComp(int t){
  
    
    int elementos= (int) (t / 0.1);
    componetes [] valores =  new componetes[elementos +1];
    int indice =0;
    float x= 0.0f;
    float y= 0.0f;
    for (float i = 0; i < t; i += 0.1) {
        x = (float) (velocodadincial * Math.cos(Math.toRadians(grado)) *i);
        y= (float) (velocodadincial * Math.sin(Math.toRadians(grado) * i)+ 0.5*-gravedad*Math.pow(i, 2));
        
       componetes obj = new componetes(i, x, y);
       valores[indice]=obj;
       indice ++;
       
        
    }
    return valores;
    
    
    
    
}

        
}
   
