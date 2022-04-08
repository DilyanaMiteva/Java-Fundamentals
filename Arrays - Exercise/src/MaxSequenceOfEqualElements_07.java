import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int maxSequence = 0;
        int number = 0;
        int sequence = 1;


        for (int i = 0; i < array.length - 1; i++) {

            int current = array[i];
            int next = array[i + 1];
            if (current == next) {
                sequence++;
                if (sequence > maxSequence) {
                    maxSequence = sequence;
                    number = current;
                }
            } else {
                sequence = 1;
            }
        }

        for (int i = 0; i < maxSequence; i++) {
            System.out.print(number + " ");

        }
    }
}

