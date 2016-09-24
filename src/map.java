import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import javax.swing.JLabel;
 
public class map extends Canvas {
    public static void main(String[] args) {
    	a a=new a();
    	a.getXiYi();
    	a.getXiYiWithRandomError();
        Frame frame = new Frame("AWTDemo");
        frame.addWindowListener(new AdapterDemo());
        frame.setSize(768, 768);
        JLabel label1 = new JLabel("black: original");
        label1.setBounds(650,300,100,100);
        frame.add(label1, BorderLayout.CENTER);
        
        JLabel label2=new JLabel("red    : with error");
        label2.setBounds(650,350,500,100);
        frame.add(label2, null);
        
        JLabel label3=new JLabel("0036C032 ³q°T3A ¼ï«TÀM");
        label3.setBounds(600,400,500,100);
        frame.add(label3, null);
        
        label1.getText();
        map canvas = new map();
        frame.add(canvas, BorderLayout.CENTER);
         
        frame.setVisible(true);
    }
     
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Graphics2D g3 =(Graphics2D) g;    
        Graphics2D g4 =(Graphics2D) g;
        
        g2.setColor(Color.black);
        g2.draw(new Line2D.Double(10*a.X0,10*( 70-a.Y0),10* a.X1,10*( 70-a.Y1)));
        g2.draw(new Line2D.Double(10*a.X1,10*( 70-a.Y1),10*a.X2,10*( 70-a.Y2)));
        g2.draw(new Line2D.Double(10*a.X2,10*( 70-a.Y2),10*a.X3,10*( 70-a.Y3)));
        g2.draw(new Line2D.Double(10*a.X3,10*( 70-a.Y3),10*a.X4,10*( 70-a.Y4)));
        g2.draw(new Line2D.Double(10*a.X4,10*( 70-a.Y4),10*a.X5,10*( 70-a.Y5)));
        g2.draw(new Line2D.Double(10*a.X5,10*( 70-a.Y5),10*a.X6,10*( 70-a.Y6)));
        
        g3.setColor(Color.red);
        g3.draw(new Line2D.Double(10*a.eX0,10*( 70-a.eY0),10* a.eX1,10*( 70-a.eY1)));
        g3.draw(new Line2D.Double(10*a.eX1,10*( 70-a.eY1),10*a.eX2,10*( 70-a.eY2)));
        g3.draw(new Line2D.Double(10*a.eX2,10*( 70-a.eY2),10*a.eX3,10*( 70-a.eY3)));
        g3.draw(new Line2D.Double(10*a.eX3,10*( 70-a.eY3),10*a.eX4,10*( 70-a.eY4)));
        g3.draw(new Line2D.Double(10*a.eX4,10*( 70-a.eY4),10*a.eX5,10*( 70-a.eY5)));
        g3.draw(new Line2D.Double(10*a.eX5,10*( 70-a.eY5),10*a.eX6,10*( 70-a.eY6)));
        
        g4.setColor(Color.black);
        g4.draw(new Line2D.Double(200, 0, 200, 500));
        g4.draw(new Line2D.Double(200,500,700,500));
        
        
    }    
}
 
class AdapterDemo extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }


}