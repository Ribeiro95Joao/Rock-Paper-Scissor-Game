package Gamers;
import java.util.Random;
public class CPUGamer {
    private String[] options = {"Rock", "Paper", "Scissor"};
    Random random = new Random();

    public String cpuPlays(){
        int randomIndex = random.nextInt(3);
        String cpuChoice = this.options[randomIndex];
        return cpuChoice;
    }
}
