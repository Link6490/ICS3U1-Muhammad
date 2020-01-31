////
// * Name: Muhammad Zaidi
// * Date: November 7, 2018
// * Version: v0.01
// * Description: Flip every word except numbers so it comes out properly
////
package edu.hdsb.gwss.zaidi.ics3u.u6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1zaidisye
 */
public class Arablish2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //CONSTANT
        //VARIABLE
        String backwardWord;
        String str = "";
        String correctWord = "";
        boolean isNumber = true;
        //OBJECT
        File file = new File("DATA11.txt");
        File Outfile = new File("OUT11.txt");
        PrintWriter output2 = new PrintWriter(Outfile);
        Scanner input = new Scanner(file);
        StringTokenizer st;
        //SPLASH MESSAGE
        //INPUT
        //PROCESSING
        while (input.hasNext()) { //While more lines in input file, it will keep going
            backwardWord = input.nextLine();
            for (int i = backwardWord.length() - 1; i >= 0; i--) { //for loop to make correct word be a flip of the backwards word
                correctWord += backwardWord.charAt(i);
            }
            st = new StringTokenizer(correctWord); //Now it will tokenize each word in the correctWord
            while (st.hasMoreTokens()) { //While there are more tokens, it will keep going
                backwardWord = st.nextToken();
                correctWord = "";
                int secondLength = backwardWord.length();
                for (int i2 = 0; i2 < backwardWord.length(); i2++) { //for loop to revert numbers back to original form
                    if (backwardWord.codePointAt(i2) >= 48 && backwardWord.codePointAt(i2) <= 57) { //48 is the 0 on the ascii table and 57 is 9
                        if (isNumber) {
                            isNumber = true;
                        }
                    } else {
                        isNumber = false;
                    }

                }
                if (isNumber) { //if its a number, it will make them reverse
                    for (int i3 = secondLength - 1; i3 >= 0; i3--) {
                        correctWord += backwardWord.charAt(i3);
                    }
                }
                isNumber = true;
                if (!correctWord.equals("")) {
                    backwardWord = correctWord;
                }
                str += backwardWord + " ";

            }
            output2.println(str);
            System.out.println(str); //Printing out final output
            str = "";
            correctWord = ""; //This is important, because otherwise output will keep adding on to the previous word
            
        }
        output2.close();
    }

}
