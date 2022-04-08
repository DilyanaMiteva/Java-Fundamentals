import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        int sumGivenNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length; i++) {

            int element = 0;
            int nextElement = 0;

            element = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] + element == sumGivenNumber){
                    System.out.println(element + " " + numbers[j]);
                }
            }


        }
    }
}
