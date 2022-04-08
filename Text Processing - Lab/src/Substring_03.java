import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        int currentIndex = second.indexOf(first);
        while (currentIndex != -1) {
            second = second.replace(first, "");
            currentIndex = second.indexOf(first);
        }
        System.out.println(second);
    }
}
