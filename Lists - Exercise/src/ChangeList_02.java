import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputAsString = scanner.nextLine();
        String[] inputAsArray = inputAsString.split("\\s+");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < inputAsArray.length; i++) {
            int arrayAsList = Integer.parseInt(inputAsArray[i]);
            list.add(arrayAsList);
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] inputCommand = command.split("\\s+");

            if (inputCommand[0].equals("Delete")) {
                int numberCommand = Integer.parseInt(inputCommand[1]);
                while (list.contains(numberCommand)) {
                    list.remove(Integer.valueOf(numberCommand));
                }

            } else {
                int numberCommand = Integer.parseInt(inputCommand[1]);
                int numberPosition = Integer.parseInt(inputCommand[2]);
                if (numberPosition < list.size()) {
                    list.add(numberPosition, numberCommand);

                }

            }

            command = scanner.nextLine();
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }
}
