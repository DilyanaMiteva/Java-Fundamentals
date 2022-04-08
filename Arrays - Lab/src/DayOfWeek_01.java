import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dayOfWeek = new String[]{"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};
        int day = Integer.parseInt(scanner.nextLine());

        if (day >= 1 && day <= 7) {
            System.out.println(dayOfWeek[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}

