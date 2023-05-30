package game;

import Gamers.CPUGamer;
import Gamers.PlayerGamer;

public class Main {
    public static void main(String[] args) {
        CPUGamer cpu = new CPUGamer();
        PlayerGamer player = new PlayerGamer();

        player.playerChoose();
        cpu.cpuPlays();

    }
}
