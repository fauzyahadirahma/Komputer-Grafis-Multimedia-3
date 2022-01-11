/*
 * Nama    : Fauzyah Hadirahma
 * NPM     : 20191310070
 * Tugas   : Komputer Grafis Multimedia - Gcanvas
 * Tanggal : 24 Juni 2021
 */
package Grafika3;

/**
 *
 * @author Fauzyah
 */
import java.util.*;
import java.awt.*;
import javax.swing.JPanel;

public class Gcanvas extends JPanel {
    private Drawing2d myDrawing;
    
    public void setDrawing(Drawing2d inDrawing) {
        myDrawing = inDrawing;
    }
    
    public void paintComponent(Graphics g) {
        myDrawing.draw(g);
    }//paintComponent
}
