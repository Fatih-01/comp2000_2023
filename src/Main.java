import javax.swing.*;
import java.awt.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Main extends JFrame {
    JLabel label;
    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }
   
    //Canvas will be our Renderer so every class you want to display on our drawing canvas
    //we would vreate an object of that class and call the paint method
    class Canvas extends JPanel implements MouseListener{
        //Constructor for Canvas Class
        public Canvas(){
            setPreferredSize(new Dimension(720, 720));
            
            label = new JLabel();
            label.setBounds(0,0,100,100);
            label.setBackground(Color.RED);
            label.setOpaque(true);
            label.addMouseListener(this);
            this.add(label);
            this.setVisible(true);
            
        }

        public void paint(Graphics g){
            Grid grid = new Grid();
            grid.paint(g);
  
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            
            throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            //throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
            System.out.println("entered");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
        }
   
    }


public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }

    class Canvas extends JPanel{
        int width = 720;
        int height = 720;
        //Constructir for Canvas Class
        public Canvas(){
            setPreferredSize(new Dimension(720, 720));
        }
        @Override
        public void paint(Graphics g){
            for(int i=0; i<height-10; i+=35){
                for(int j=0; j<width-10; j+=35){
                    g.setColor(Color.BLACK);
                    g.drawRect(10, 10, i, j);
                    g.setColor(Color.WHITE);
                    g.fillRect(10, 10, i, j);
                }
            }
            // for(int i=10; i<710; i+=35){
            //     for(int j=0; j<710; j+=35){
            //         g.setColor(Color.BLACK);
            //         g.drawRect(i,j,35,35);
            //         g.setColor(Color.WHITE);
            //         g.fillRect(i,j,35,35);
            //     }
            // }
        }

    }

    //Creating  contructor for our class
    private Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        Canvas canvas = new Canvas();

        //Object grid representing the "grid" class
        this.setContentPane(canvas);


        this.setContentPane(canvas);

        //Builds the infastructure - this.pack() is a geometry manager
        this.pack();
    }
}

