import java.util.ArrayList;
import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            int length = word.length();
            for (int j = 0; j < length; j++) {
            result.append(word);
            }
        }
        System.out.println(result);
    }
}
