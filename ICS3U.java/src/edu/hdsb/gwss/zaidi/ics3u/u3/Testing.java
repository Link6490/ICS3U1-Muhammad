/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u3;

/**
 *
 * @author 1zaidisye
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANT
        final double ADULT_PRICE = 10.00;
        final double ADULT_BEFORE_FOUR = 7.00;
        final double CHILD_PRICE = 6.00;
        final double CHILD_BEFORE_FOUR = 4.00;
//VARIABLE
        int age = 29;
        int movieTime = 1300; //Assume cinema is open between 11 am and 10:30 pm

//OBJECT
//SPLASH MESSAGE 
        System.out.println("Welcome to this program which determines price of a movie ticket.");
//INPUT
//PROCESSING
        if (age >= 14 && movieTime > 1630) {
            System.out.println("You will pay" + ADULT_PRICE + "dollars");
}
else if (age >= 14 && movieTime < 1630) {
            System.out.println("You will pay" + ADULT_BEFORE_FOUR + "dollars");
}

if (age < 14 && movieTime > 1630) {
            System.out.println("You will pay" + CHILD_PRICE + "dollars");
            
}
else if (age < 14 && movieTime < 1630) {
            System.out.println("You will pay" + CHILD_BEFORE_FOUR + "dollars");
}

    }
    
}
