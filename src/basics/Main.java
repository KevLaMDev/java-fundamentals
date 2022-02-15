package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {



    public static void main(String[] args) {
        System.out.println(pluralize("Frog", 2));
        Heads(6);
        clock();
    }

    public static String pluralize(String word, int num) {
        if (num > 1) {
            word += "" + 's';
        }
        return word;
    }

    public static void Heads(int n) {
        int inARow = 0;
        int counter = 0;
        Random r = new Random();
        while (inARow < n) {
            float randomNum = r.nextFloat();
            if (randomNum >= 0.5) {
                inARow++;
                System.out.println("Heads");
            } else {
                inARow = 0;
                System.out.println("Tails");
            }
            counter++;
        }
        System.out.println("It took " + counter + " flips to flip " + n + " heads in a row.");
    }

    public static void clock() {
//        System.out.println("Time: " + time);
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
//        System.out.println("newTime: " + newTime);
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            String newTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if (!time.equals(newTime)) {
                time = newTime;
                System.out.println(time);
            }
        }
    }
}
