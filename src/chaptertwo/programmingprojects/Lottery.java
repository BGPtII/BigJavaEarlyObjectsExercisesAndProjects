package chaptertwo.programmingprojects;

import java.util.Random;

/**
 * Picks a combination in a lottery. In this lottery, players can choose 6 numbers
 * (possibly repeated) between 1 and 49
 */
public class Lottery {
    public static void main(String[] args) {
        Random lottery = new Random();
        System.out.println("Play this combination, it'll make you rich!");
        System.out.println(lottery.nextInt(1, 50) + " " + lottery.nextInt(1, 50) + " " +
                lottery.nextInt(1, 50) + " " + lottery.nextInt(1, 50) + " " +
                lottery.nextInt(1, 50) + " " + lottery.nextInt(1, 50));
    }
}
