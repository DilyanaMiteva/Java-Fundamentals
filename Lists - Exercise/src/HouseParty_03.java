import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commands = Integer.parseInt(scanner.nextLine());
        List<String> people = new ArrayList<>();

        for (int i = 0; i < commands; i++) {

            String input = scanner.nextLine();
            String[] inputAsArray = input.split("\\s+");
            String name = inputAsArray[0];

            if (inputAsArray.length == 3) {
                if (people.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    people.add(name);
                }
            } else {
                if (people.contains(name)) {
                    people.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }

            }
        }
        for (String person : people) {
            System.out.println(person);
        }

    }
}
