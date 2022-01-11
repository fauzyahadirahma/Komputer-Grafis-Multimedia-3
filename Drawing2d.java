/*
 * Nama    : Fauzyah Hadirahma
 * NPM     : 20191310070
 * Tugas   : Komputer Grafis Multimedia - Drawing
 * Tanggal : 24 Juni 2021
 */
package Grafika3;

/**
 *
 * @author Fauzyah
 */
import java.util.*;
import java.awt.*;

public class Drawing2d {
    private Vector shapes = new Vector();
    int numberOfShapes=0;
    
    public void addShapes(Shaping2d inShape) {
        shapes.add(inShape);
        numberOfShapes = numberOfShapes + 1;
    }//end addShape
    
    public void draw(Graphics g) {
        for (int i=0; i<numberOfShapes; i=i+1) {
            ((Shaping2d)shapes.get(i)).draw(g);
        }//end for i
    }//end draw
}
