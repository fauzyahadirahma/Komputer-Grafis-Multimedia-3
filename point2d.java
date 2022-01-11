/*
 * Nama    : Fauzyah Hadirahma
 * NPM     : 20191310070
 * Tugas   : Komputer Grafis Multimedia - Point2d
 * Tanggal : 24 Juni 2021
 */
package Grafika3;

/**
 *
 * @author Fauzyah
 */
public class point2d {
    public float x;
    public float y;
    private float k = 1;
    
    public point2d (float in_x, float in_y) {
        x = in_x;
        y = in_y;
    }//end constructor
    
    public float x() {
        return (x);
    }
    
    public float y() {
        return (y);
    }
}//end class point2d
