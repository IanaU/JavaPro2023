package sum;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sum1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Input lengths of array: ");
        int a = scanner.nextInt();
        int [] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = random.nextInt(20);
        }

        long sum = 0;
        for (int number:arr) {
            if (number %2 != 0){
                sum += number;
            }
        }
        System.out.println("Array:\n" + Arrays.toString(arr));
        System.out.printf("Odd sum = %d", sum);
    }
}
