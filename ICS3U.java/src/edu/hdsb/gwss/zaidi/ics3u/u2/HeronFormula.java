/*
 * Name: Muhammad Zaidi
 * Date: Sept 19 2018
 * Version: v0.1
 */
package edu.hdsb.gwss.zaidi.ics3u.u2;

/**
 *
 * @author 1zaidisye
 */
public class HeronFormula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    

    //CONSTANT
    //VARIABLE
    double a;
    double s;
    double c;
    double b;
    double area;
    //OBJECT
    //SPLASH MESSAGE
        System.out.println("In this program, you will find the area of a triangle!");
    //INPUT
    a = 10;
    b = 10;
    c = 10;
    s = (a+b+c)/2;
    //PROCESSING
    area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    //OUTPUT
        System.out.println("The area of your triangle is," + area);
    
    }
    
}
