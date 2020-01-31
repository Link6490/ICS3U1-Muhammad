////
// * Name: Muhammad Zaidi
// * Date: November 27, 2018
// * Version: v0.01
// * Description: Compete against the computer in a game of rock paper sciossors, best 2/3.
////
package edu.hdsb.gwss.zaidi.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String player;
        String computer;
        int wins = 0;
        int ties = 0;
        int loss = 0;

        for (int i = 0; i < 3; i++) { //For loop for best 2/3
            player = generatePlayerChoice(); //Player choice is set to what you say
            computer = generateCompChoice(); //Computer choice is randomly decided
            if (player.equals(computer)) { //Deciding the outcome
                ties++;
                System.out.println("You chose: " + player + " and I chose: " + computer);
                tieThisRound();
            } else if (player.equals("rock") && computer.equals("scissors")) {
                wins++;
                winThisRound();
                System.out.println("You chose: " + player + " and I chose: " + computer);
            } else if (player.equals("rock") && computer.equals("paper")) {
                loss++;
                loseThisRound();
                System.out.println("You chose: " + player + " and I chose: " + computer);
            } else if (player.equals("paper") && computer.equals("scissors")) {
                loss++;
                loseThisRound();
                System.out.println("You chose: " + player + " and I chose: " + computer);
            } else if (player.equals("paper") && computer.equals("rock")) {
                wins++;
                winThisRound();
                System.out.println("You chose: " + player + " and I chose: " + computer);
            } else if (player.equals("scissors") && computer.equals("paper")) {
                wins++;
                winThisRound();
                System.out.println("You chose: " + player + " and I chose: " + computer);
            } else if (player.equals("scissors") && computer.equals("rock")) {
                loss++;
                loseThisRound();
                System.out.println("You chose: " + player + " and I chose: " + computer);
            }

            System.out.println("Your Record: "); //Displaying your wins,ties and losses in the best 2/3 series
            System.out.println("Your ties: " + ties);
            System.out.println("Your wins: " + wins);
            System.out.println("Your losses: " + loss + "\n");
        }
        if (ties == 3) { //If all 3 ties it will call the finalTie method
            finalTie();
        } else if (wins > loss) { //If more wins than losses, it will call the finalWin method
            finalWin();
        } else if (loss > wins) { //If more losses than wins, it will call the finalLoss method
            finalLoss();
        } else if (ties == wins && loss == wins && wins == loss) {
            System.out.println("Wow you won once, lost once, and tied once.");
        } else {
            System.out.println("Please enter an valid word");
        }
    }

    public static String generatePlayerChoice() { //Method for determing player choice
        String playerInput;
        Scanner input = new Scanner(System.in);
        System.out.print("Player! Choose between Rock, Paper and Scissors!: ");
        playerInput = input.nextLine();
        String playerInputLower = playerInput.toLowerCase();
        return playerInputLower;
    }

    public static String generateCompChoice() { //Method for determining computer choice
        int randomNum;
        String compChoice = "";
        randomNum = (int) (Math.random() * 3) + 1;
        switch (randomNum) {
            case 1:
                compChoice = "rock";
                break;
            case 2:
                compChoice = "paper";
                break;
            case 3:
                compChoice = "scissors";
                break;
        }
        return compChoice;
    }

    public static String winThisRound() { //Winning 1 round text
        String win1 = "You win this round\n";
        System.out.println("You win this round");
        return win1;
    }

    public static String loseThisRound() { //Losing 1 round text
        String lose1 = "You lose this round\n";
        System.out.println("You lose this round");
        return lose1;
    }

    public static String tieThisRound() { //Tying in 1 round text
        String tie1 = "We tied this round\n";
        System.out.println("We tied this round");
        return tie1;
    }

    public static String finalTie() { //Final tie text
        String twix = "twix";
        System.out.println("It seems we tied every round. You are a worthy adversary");
        return twix;
    }

    public static String finalWin() { //Final win text
        String mars = "mars";
        System.out.println("Wow, it seems you won the majority of the games. Congratulations!");
        return mars;
    }

    public static String finalLoss() { //Final loss text
        String aero = "aero";
        System.out.println("Haha loser, you lost the majority of the games!");
        return aero;
    }
}
