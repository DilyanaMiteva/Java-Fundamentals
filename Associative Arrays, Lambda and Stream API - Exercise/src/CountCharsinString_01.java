import java.util.*;

public class CountCharsinString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> chars = new LinkedHashMap<>();

        String input = scanner.nextLine();
        for (char symbol : input.toCharArray()) {
            if (symbol != ' ') {
                if (chars.containsKey(symbol)) {
                    int count = chars.get(symbol);
                    chars.put(symbol, count + 1);
                } else {
                    chars.put(symbol, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
