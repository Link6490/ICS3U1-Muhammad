/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class PictureFramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANT
        //VARIABLE
        int width;
        int height;
        int mat;
        int frame;
        //OBJECT
        Scanner input = new Scanner(System.in);
        //SPLASH MESSAGE
        //INPUT
        System.out.print("What is the height of the picture?: ");
        width = input.nextInt();
        System.out.print("What is the width of the picture?: ");
        height = input.nextInt();
        System.out.print("What is the width of the mat?: ");
        mat = input.nextInt();
        System.out.print("What is the width of the frame?: ");
        frame = input.nextInt();
        //PROCESSING
      // for (int row = 0; row < frame; row++  ) {
            for (int col = 0; col < 2*frame+2*mat+width; col++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        //OUTPUT
    }
    
//}
