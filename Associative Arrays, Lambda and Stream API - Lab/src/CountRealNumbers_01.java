import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> numberOccurences = new TreeMap<>();
        String[] numbersAsString = scanner.nextLine().split(" ");

        for (int i = 0; i < numbersAsString.length; i++) {
            double number = Double.parseDouble(numbersAsString[i]);

            Integer occurences = numberOccurences.get(number);
            if (occurences == null){
                occurences = 0;
            }

            numberOccurences.put(number, occurences + 1);
        }

        for (Map.Entry<Double, Integer> entry : numberOccurences.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
