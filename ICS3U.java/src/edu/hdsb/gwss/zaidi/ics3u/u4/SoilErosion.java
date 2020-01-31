/*
 * Name: Muhammad Zaidi
 * Date: October 20, 2018
 * Version: v0.01
 * Description: 
 * Calculate Soil erosion
 */
package edu.hdsb.gwss.zaidi.ics3u.u4;

/**
 *
 * @author smaza
 */
public class SoilErosion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANT
        final double PERCENTAGE_LOST = 1.25 / 100;
        final double TOP_SOIL_GROWTH = 2.5 / 400;
        //VARIABLE
        double lostPerYear;
        double canadaTopSoil = 30;
        int years = 0;
        //OBJECT
        //SPLASH MESSAGE
        System.out.println("Topsoil Erosion\n"
                + "\n"
                + "Careless land management causes approximately 1.25% of the topsoil to erode each year. \n"
                + "It is then lost forever since it takes nature approximately 400 years to produce 2.5cm of topsoil.  \n"
                + "At 10cm, the topsoil is so shallow the crops cannot grow on a large scale. \n"
                + "If Canada has about 30cm of topsoil, how many years will it take for the depths to be\n"
                + "reduced to 10cm?");
        //INPUT
        //PROCESSING
        while (canadaTopSoil > 10) {  //Finding how long it would take for canada to erode to a depth below 10 cm
            lostPerYear = canadaTopSoil * PERCENTAGE_LOST;
            canadaTopSoil = canadaTopSoil - lostPerYear + TOP_SOIL_GROWTH;
            years++;
            
        }
        System.out.println("\nIt will take Canada " + years + " years for the soil to erode to a depth such that crops will not grow.");

        //OUTPUT
    }

}
