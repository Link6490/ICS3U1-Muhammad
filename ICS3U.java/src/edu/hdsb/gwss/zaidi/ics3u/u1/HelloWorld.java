/*
 * Name: Muhammad Zaidi
 * Date: Sept 12, 2018
 * Version: v0.01
 * Description: 
 * This is a "Hello World" Pogram, that displays
 * Hello World to the console
 */
package edu.hdsb.gwss.zaidi.ics3u.u1;

/**
 *
 * @author 1zaidisye
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Good Afternoon");
        
        int wo = 2;
        woop(wo);
        System.out.println(wo);
    }
    public static int woop(int wo){
        wo = wo + 2;
        return wo;
        
    }
}
