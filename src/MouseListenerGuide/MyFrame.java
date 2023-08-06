package MouseListenerGuide;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Color.*;

public class MyFrame extends JFrame implements MouseListener{

    JLabel label;
    //Constructor for MyFrame
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Stops running the program after windows is closed
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    // public void paint(Graphics g){
    //     for(int i=0; i<1)
    // }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Clicked");
        //throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Pressed");
        //throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Released");
        //throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Entered");
        label.setBackground(Color.GREEN);
        //throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        label.setBackground(Color.RED);
        //throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }
}
