import java.util.Scanner;

public class Ages_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = Integer.parseInt(scanner.nextLine());
        String ages = "";
        if (years >= 0 && years <= 2) {
            System.out.printf("baby");
        } else if (years >= 3 && years <= 13) {
            System.out.printf("child");
        } else if (years >= 14 && years <= 19) {
            System.out.printf("teenager");
        } else if (years >= 20 && years <= 65) {
            System.out.printf("adult");
        } else if (years >= 66) {
            System.out.printf("elder");
        } else System.out.printf("Error ");
    }
}
