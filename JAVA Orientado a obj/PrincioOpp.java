/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package princioopp.poo.codigo;

/**
 *
 * @author mj
 */
public class PrincioOpp {

    /**
     * @param args the command line arguments
     */
//Un programa que me de apellidos mombre, apellidos pa,am , id
    //obj
    private String nombre;
    private String apellidopa;
    private String apelidoma;
    private String id;
    
    
    
public PrincioOpp(){


}

    public PrincioOpp(String nombre, String apellidopa, String apelidoma, String id) {
        this.nombre = nombre;
        this.apellidopa = apellidopa;
        this.apelidoma = apelidoma;
        this.id = id;
    }
//refactor 
//set especial 
    
    
    
    /**
     * @param nombre the nombre to set
     */
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param apellidopa the apellidopa to set
     */
    
    public String getApellidopa() {
        return apellidopa;
    }
    
    
    public void setApellidopa(String apellidopa) {
        this.apellidopa = apellidopa;
    }

    /**
     * @param apelidoma the apelidoma to set
     */
    
    public String getApelidoma() {
        return apelidoma;
    }
    
    
    public void setApelidoma(String apelidoma) {
        this.apelidoma = apelidoma;
    }

    /**
     * @param id the id to set
     */
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PrincioOpp{" + "nombre=" + nombre + ", apellidopa=" + apellidopa + ", apelidoma=" + apelidoma + ", id=" + id + '}';
    }
    
    
    
//insert code to string 
    //Generate 
    
    
    /**
     * @return the nombre
     */
    

    /**
     * @return the apellidopa
     */
  

    /**
     * @return the apelidoma
     */
    

    /**
     * @return the id
     */

    /**
     * @return the nombre
     */
 
    
    
    
}


