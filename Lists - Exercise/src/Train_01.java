import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] wagons = input.split("\\s+");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < wagons.length; i++) {
            int arrayAsList = Integer.parseInt(wagons[i]);
            list.add(arrayAsList);
        }

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");

            if (tokens[0].equals("Add")) {
                int passenger = Integer.parseInt(tokens[1]);
                list.add(passenger);
            } else {
                for (int i = 0; i < list.size(); i++) {
                    int passenger = Integer.parseInt(tokens[0]);
                    int passengersAndAdded = list.get(i) + passenger;
                    if (passengersAndAdded <= maxCapacity){
                        list.set(i, passengersAndAdded);
                        break;
                    }
                }
            }


            input = scanner.nextLine();
        }


        for (Integer s : list) {
            System.out.print(s + " ");
        }
    }
}
