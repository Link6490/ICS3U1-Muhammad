/*
 * Name: Muhammad Zaidi
 * Date: September 19 2018
 * Version v0.1
 * Description
    Given the radius of a circle, this program will calculate the circle
 */
package edu.hdsb.gwss.zaidi.ics3u.u2;

/**
 *
 * @author 1zaidisye
 */
public class AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // CONSTANTS (TODO)
        double PI = Math.PI;
        // VARIABLES
        double radius;
        double area;
        // OBJECTS (todo)
        // SPLASH MESSAGE
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Area of a Circle Calculator");
        System.out.println("This program will calculate the area of a circle, given the radius");
        System.out.println("---------------------------------------------------------------------");
        // INPUT
        radius = 1;
        // PROCESSING
        area = PI * Math.pow(radius, 2);
        // OUTPUT
        System.out.format("For a radius of %.2f\n", radius);
        System.out.format("The area of the circle is %.2f", area, " units squared\n");
        
    }
    
}
