
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics; 
import java.awt.Graphics2D;
import java.awt.geom.*;
import java.util.Vector;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALBERTO
 */
public class Lineas extends Canvas{
    
  
    
    public static void hacerLinea(Graphics g, int x, int y, int x1, int y1)
    {
        g.drawLine(x, y, x1, y1);
        
    }
    
    public static void hacerCurva (Graphics g, int x, int y, int x1, int y1)
    {
        Graphics2D g2 =(Graphics2D)g;
        QuadCurve2D q = new QuadCurve2D.Float();
        q.setCurve(x, y, (x+x1)/2, ((y+y1)/2)-100, x1, y1);
        g2.draw(q);
    }
    
    public static void hacerOrigen(Graphics g, int x, int y)
    {
        g.fillOval(x-7, y-7, 14, 14);
        
    }
    
    public static void hacerDestino(Graphics g, int x, int y)
    {
        g.fillOval(x-7, y-7, 14, 14);
        
    }
    
    
}
