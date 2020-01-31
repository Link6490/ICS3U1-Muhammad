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
public class CosineLaw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANT
        
        //VARIABLE
        double A;
        double B;
        double cosine;
        double C;
        
                
        //OBJECT
        //SPLASH MESSAGE
        System.out.println("Cosine Law Calculator");
        //INPUT
        A = 12;
        B = 13;
        cosine = 60;
        //PROCESSIGN
        C = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2) - 2 * A * B * Math.cos(Math.toRadians(cosine)));
        //OUTPUT
        System.out.format("Side C is %f units long", C);
    }
    
}
