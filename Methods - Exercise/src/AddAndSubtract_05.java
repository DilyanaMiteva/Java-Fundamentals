import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        sum(first, second);
        subtract(sum(first, second), third);

        System.out.println(subtract(sum(first, second), third));

    }

    private static int subtract(int sum, int third) {
        int subtracts = sum - third;
        return subtracts;
    }

    private static int sum(int first, int second) {
        return first + second;
    }
}

