package Gamers;

import java.util.Scanner;

public class PlayerGamer {
    private String playerChoice;

    Scanner scan = new Scanner(System.in);

    public void playerChoose(){
        System.out.println("Choose your option: R - Rock, P - Paper, S - Scissor");
        playerChoice = scan.next();
    }
}
