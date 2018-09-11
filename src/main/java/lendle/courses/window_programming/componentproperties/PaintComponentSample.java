/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.window_programming.componentproperties;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class PaintComponentSample extends JPanel{

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawOval(0, 0, getWidth(), getHeight());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        PaintComponentSample c=new PaintComponentSample();
        frame.add(c);
        frame.setVisible(true);
    }
    
}
