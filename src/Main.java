import javax.swing.*;
import java.awt.*;

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
        this.setContentPane(canvas);
        //Builds the infastructure - this.pack() is a geometry manager
        this.pack();
    }
}

