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

        
}
   
