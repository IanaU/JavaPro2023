package homeWork_3;

import java.util.ArrayList;
import java.util.Random;

public class Insert {

    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 1; i < 10000; i++) {
            integerArrayList.add(random.nextInt(1000));
        }
        long timeFirstsLoop = System.currentTimeMillis();

        for (int i = 1; i < 10000; i++) {
            integerArrayList.remove(0);
        }
        long timeSecondsLoop = System.currentTimeMillis();
        System.out.println(integerArrayList);

        System.out.println("Added to ArrayList: " + (timeFirstsLoop - startTime) + " ms");
        System.out.println("Removed from ArrayList: " + (timeSecondsLoop - timeFirstsLoop) + " ms");
    }
}
