/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseeventdemo;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author ASUS-NB
 */
public class MouseEventDemo extends Frame implements
        MouseListener, MouseMotionListener{
    TextFiled tf;
    public MouseEventDemo(String title) {
        super(title);
        tf = new TextField(60);
        addMouseListener(this);
    }
    
    public void launchFarme(){
        add(tf, BorderLayout.SOUTH);
        setSize(300, 300);
        setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MouseEventDemo me = new MouseEventDemo("Clode Window Example");
        me.launchFrame();
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        String msg = "Mouse Clicked";
        tf.setText(msg);
    }

    @Override
    public void mousePressed(MouseEvent e) {
      String msg = "Mouse Pressed";
      tf.setText(msg);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       String msg = "Mouse Released";
       tf.setText(msg); 
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        String msg = "Mouse Entered";
        tf.setText(msg);
    }

    @Override
    public void mouseExited(MouseEvent e) {
       String msg = "Mouse Exited";
       tf.setText(msg);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        String msg = "Mouse Dragged at" +e.getX()+","+e.getY();
       tf.setText(msg);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        String msg = "Mouse Moved";
        tf.setText(msg);
    }

    
    

    private void add(TextFiled tf, String SOUTH) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void launchFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class TextFiled {

        public TextFiled() {
        }

        private void setText(String msg) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class TextField extends TextFiled {

        public TextField(int i) {
        }
    }
    
}
