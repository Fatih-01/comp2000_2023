import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel{
    int posX, posY,x,y;
    Color color;
    int size = 35;
    
    //Creating the cell
    
    public Cell(int posX, int posY){
        x = posX;
        y = posY;
    }

    // public Cell(int posX, int posY, int cellSize){
    //     x = posX;
    //     y = posY;
    //     size = cellSize;
    // }

    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(x,y,size, size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size, size);
    }
    
    // @Override
    // public void paint(Graphics g){
    //     for(int i=0; i<cell.length; i++){
    //         g.drawRect(i, i, i*35, i*35);
    //     }
    // }
}
