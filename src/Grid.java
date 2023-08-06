import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Class grid is given its own paint method with extending to JPanel
public class Grid extends JPanel{
    //Grid[][] grid = new Grid[20][20];
    Cell [][] cells = new Cell[20][20];
    int size = 35;

    //Constructor for Grid
    public Grid(){
        //Creating 2D array for grid
        for(int i=0; i<cells.length; i++){
            for(int j=0; j<cells[i].length; j++){
                cells[i][j] = new Cell(10+35*i, 10+35*j);
            }
        }
    }
    @Override
    //We also need to paint the grid one by one
    //the constructor draws the outlines and this function paints ins
    //inside of them
    public void paint(Graphics g){
        //Drawing the cells
        for(int i=0; i<cells.length; i++){
            for(int j=0; j<cells[i].length; j++){
                cells[i][j].paint(g);;
            }
        }
    }
}
