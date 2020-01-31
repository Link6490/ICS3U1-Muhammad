////
// * Name: Muhammad Zaidi
// * Date: November 6, 2018
// * Version: v0.01
// * Description: check if words have the same structure
package edu.hdsb.gwss.zaidi.ics3u.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1zaidisye
 */
public class PatternMatching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        //CONSTANTS
        //VARIABLE //Listing variables
        String str;
        String firstWord;
        String secondWord;
        boolean makesSense;
        boolean isVowel;
        boolean isVowel2;
        //INPUT
        //OBJECT
        File file = new File("DATA31.txt"); //Writing out objects and scanners
        File Outfile = new File("OUT31.txt");
        PrintWriter output2 = new PrintWriter(Outfile);
        Scanner input = new Scanner(file);
        StringTokenizer st;
        //SPLASH MESSAGE
        //INPUT
        //PROCESSING
        while (input.hasNext()) { //While there are more lines in the input, it will keep going
            str = input.nextLine();
            st = new StringTokenizer(str);
            firstWord = st.nextToken(); //First word is the first token
            secondWord = st.nextToken(); //Second word is the second token
            firstWord = firstWord.toLowerCase();
            secondWord = secondWord.toLowerCase();
            makesSense = firstWord.length() == secondWord.length(); //If the first word is equal to the second word, it will continue, but if it is not, then there is no point in executing rest of code.
            if (makesSense) {
                for (int i = 0; i < firstWord.length(); i++) { //Checking both words if they have vowels at the same spot using switch/case
                    switch (firstWord.charAt(i)) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            isVowel = true;
                            break;
                        default:
                            isVowel = false;
                            break;
                    }
                    switch (secondWord.charAt(i)) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            isVowel2 = true;
                            break;
                        default:
                            isVowel2 = false;
                            break;
                    }
                    if (isVowel != isVowel2) { //So if they don't have vowels at same spot, it doesnt make sense so it's false
                        makesSense = false;
                    } else {
                        makesSense = true;
                    }
                }
            }
            if (makesSense) { //If makes sense, then prints same, else it prints different
                System.out.println("same");
                output2.println("same");
            } else {
                System.out.println("different");
                output2.println("different");
            }
        }
        output2.close();
    }

    //OUTPUT
}
