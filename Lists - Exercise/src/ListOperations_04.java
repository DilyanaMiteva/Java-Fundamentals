import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputAsArray = input.split("\\s+");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < inputAsArray.length; i++) {
            numbers.add(Integer.parseInt(inputAsArray[i]));
        }

        String commandInput = scanner.nextLine();
        while (!commandInput.equals("End")) {

            String[] commandAsArray = commandInput.split("\\s+");
            String command = commandAsArray[0];

            switch (command) {
                case "Add":
                    numbers.add(Integer.parseInt(commandAsArray[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandAsArray[2]);
                    if (index >= 0 && index < numbers.size()) {
                        numbers.add(index, Integer.parseInt(commandAsArray[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(commandAsArray[1]);
                    if (index >= 0 && index < numbers.size()) {
                        numbers.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String direction = commandAsArray[1];
                    int count = Integer.parseInt(commandAsArray[2]);
                    shift(numbers, direction, count);
                    break;
            }

            commandInput = scanner.nextLine();
        }


        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }

    private static void shift(List<Integer> numbers, String direction, int count) {
        switch (direction) {
            case "left":
                for (int i = 0; i < count; i++) {
                    int first = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(first);
                }
                break;
            case "right":
                for (int i = 0; i < count; i++) {
                    int last = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, last);
                }
                break;
        }
    }


}
