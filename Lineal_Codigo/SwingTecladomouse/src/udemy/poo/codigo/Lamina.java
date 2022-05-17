/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.poo.codigo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author mj
 */
public class Lamina extends JPanel implements MouseMotionListener, MouseListener,KeyListener {

    
    private Point puntouno = new Point();
    private Point puntodos = new Point();
   
    private String tipoTecla="sin forma que dibuja";
    private int codigo;
    private boolean puntinicio=false;
    private Line2D li = null;
    private ArrayList<Shape> formas = new ArrayList<>();
    
    
    
    public Lamina(){
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.addKeyListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D gg = (Graphics2D)g;
        gg.drawString("("+puntouno.x +" , "+puntouno.y +")",5,20);
           gg.drawString("("+puntodos.x +" , "+puntodos.y +")",200,20);
              gg.drawString(tipoTecla,180,20);
    
              if(!formas.isEmpty()){
                  
                  for (Shape forma:formas) {
                    gg.draw(forma);
                    
                  }
              }
    }
    
    
    
            
    
    
    
    //@Override;
    public void mouseDragged(MouseEvent e) {
      

//  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (!puntinicio) {
            puntouno=e.getPoint();
            puntodos=e.getPoint();
            puntouno.x +=5;
            puntouno.y +=5;
            
            
        }else {
            puntodos=e.getPoint();
            puntodos.x +=5;
            puntodos.y +=5;
        }
        repaint();
        

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseClicked(MouseEvent e) {
if(!puntinicio)      {
    this.puntinicio=true;
    
}  else{
    this.puntinicio=false;

if(codigo ==1)
{
    this.formas.add(new Line2D.Float(puntouno.x,puntouno.y ,puntodos.x,puntodos.y));
    
} else if(codigo==2){
    this.formas.add(new Rectangle2D.Float(puntouno.x,puntouno.y,puntodos.x-puntouno.x,puntodos.y-puntouno.y));
}    
     repaint();
    
    }
       
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
int codigotecla=   e.getExtendedKeyCode();
if(codigotecla==KeyEvent.VK_L){
    this.tipoTecla="Creacion de Lineas";
    this.codigo=1;
    }else if(codigotecla ==KeyEvent.VK_R){
this.tipoTecla = "Creacion rectangulo";
this.codigo=2;

    }
else if(codigotecla ==KeyEvent.VK_C){
this.tipoTecla = "Sin form que dibujar";
this.codigo=0;
}
else if(codigotecla ==KeyEvent.VK_B){
this.tipoTecla = "Limiando la lamina";
this.puntinicio=false;
this.codigo=0;
this.formas.clear();


}
else if(codigotecla ==KeyEvent.VK_A){
this.tipoTecla = "Anulando la lamina";
this.puntinicio=false;
this.codigo=0;

}else if(codigotecla ==KeyEvent.VK_Z){
this.tipoTecla = "Deshaciendo la ultima forma";
this.puntinicio=false;
this.codigo=0;
if(!formas.isEmpty()){
    this.formas.remove(this.formas.size()-1);
    
}
   
} 
repaint();
// throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
