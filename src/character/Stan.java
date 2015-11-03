/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import grid.Grid;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Alex Parks
 */
public class Stan {
    
    private int x;
    private int y;
    Grid grid;
    private static int ROWS = 20;
    private static int COLUMNS = 20;
    
    public Stan(int x, int y, int width, int height) {
        grid = new Grid(ROWS, COLUMNS, width / COLUMNS, height / ROWS, new Point(x, y), Color.BLACK);
        this.x = x;
        this.y = y;
    }
    
    public void draw(Graphics graphics) {

        //head
        graphics.setColor(new Color(255, 225, 195));
        graphics.fillOval(x, y, 400, 400);

//<editor-fold defaultstate="collapsed" desc="Eyes Left">
        //eyes left
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + 115, y + 175, 75, 100);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x + 160, y + 215, 10, 10);
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Eyes Right">
        //eyes right
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + 210, y + 175, 75, 100);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x + 230, y + 215, 10, 10);
//</editor-fold>

        //hat
        graphics.setColor(Color.red);
        graphics.fillRect(x + 0, y + 125, 400, 35);

        //mouth
//       graphics.drawArc(x, y, x, x, x, x);
        //grid
        if (grid != null) {
            grid.paintComponent(graphics);
        }
    }
    
}
