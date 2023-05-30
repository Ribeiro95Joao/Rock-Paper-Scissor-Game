package game;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cpuWins = 0;
        int playerWins = 0;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        boolean play = true;
        while (play == true){
            //CPU Plays
            String[] cpuOptions = {"Rock", "Paper", "Scissor"};
            int randomIndex = random.nextInt(3);
            String cpuChoice = cpuOptions[randomIndex];

            //Player Plays
            System.out.println("Choose your next move: R for Rock, P for Paper or S for Scissor");
            String playerOption = scan.next();

            //Validate and Results
            if(playerOption.equals("R") || playerOption.equals("ROCK")
                    || playerOption.equals("rock") || playerOption.equals("Rock") || playerOption.equals("r")){
                if(cpuChoice.equals("Rock")){
                    System.out.println("CPU chooses Rock too!");
                    System.out.println("There's a draw!");
                }else if(cpuChoice.equals("Paper")){
                    System.out.println("CPU chooses Paper!");
                    System.out.println("Paper wraps Rock! CPU won!");
                    cpuWins++;
                }else{
                    System.out.println("CPU chooses Scissor!");
                    System.out.println("Rock broke Scissor! Player won!");
                    playerWins++;
                }
            }else if(playerOption.equals("P") || playerOption.equals("PAPER")
                    || playerOption.equals("paper") || playerOption.equals("Paper") || playerOption.equals("p")){
                if(cpuChoice.equals("Rock")){
                    System.out.println("CPU chooses Rock!");
                    System.out.println("Paper wraps Rock! Player won!");
                    playerWins++;
                }else if(cpuChoice.equals("Paper")){
                    System.out.println("CPU chooses Paper too!");
                    System.out.println("There's a draw!");
                }else{
                    System.out.println("CPU chooses Scissor!");
                    System.out.println("Scissor cut Paper! CPU won!");
                    cpuWins++;
                }
            }else if(playerOption.equals("S") || playerOption.equals("SCISSOR")
                    || playerOption.equals("scissor") || playerOption.equals("Scissor") || playerOption.equals("s")){
                if(cpuChoice.equals("Rock")){
                    System.out.println("CPU chooses Rock!");
                    System.out.println("Rock broke Scissor! Player won!");
                    cpuWins++;
                }else if(cpuChoice.equals("Paper")){
                    System.out.println("CPU chooses Paper!");
                    System.out.println("Scissor cut Paper! Player won!");
                    playerWins++;
                }else{
                    System.out.println("CPU chooses Scissor too!");
                    System.out.println("There's a draw!");
                }
            }else{
                System.out.println("Invalid Option!!");
            }
            System.out.println("Results:");
            System.out.println("Player's victories: " + playerWins);
            System.out.println("CPU's victories: " + cpuWins);
            //Continue the game or not
            System.out.println("Do you want to play again? Y - yes or N - no");
            String playAgain = scan.next();
            if(playAgain.equals("N") || playAgain.equals("n") || playAgain.equals("No") ||
                    playAgain.equals("no") || playAgain.equals("NO") ){
                play = false;
            }

        }

    }

}
