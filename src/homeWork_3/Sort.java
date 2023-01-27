package homeWork_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("List of words: " + "\n");
        String words = scanner.nextLine();
        String[] arrWords = words.split(" ");
        Comparator<String> stringLength = new StringLengthSort();
        Arrays.sort(arrWords, stringLength);
        for (String string : arrWords) {
        }

        Arrays.sort(arrWords, Comparator.naturalOrder());
        System.out.println(Arrays.toString(arrWords) + "\n");


        System.out.println("List of numbers: " + "\n");
        String numbers = scanner.nextLine();
        String[] arr = numbers.split(" ");
        int countNumber = arr.length;
        Integer[] numberArray = new Integer[countNumber];
        for (int i = 0; i < arr.length; i++) {
            numberArray[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(numberArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(numberArray));
    }

    static class StringLengthSort implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1.length() > o2.length()) {
                return 1;
            } else {
                if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
