package game;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cpuWins = 0;
        int playerWins = 0;
       Scanner scan = new Scanner(System.in);
        Random random = new Random();
        while (true){
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
                    System.out.println("Rock broke scissor! Player won!");
                    playerWins++;
                }
            }

        }

    }

}
