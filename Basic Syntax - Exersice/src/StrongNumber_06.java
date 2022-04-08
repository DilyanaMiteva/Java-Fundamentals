import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - 48;

            int fact = 1;
            for (int j = 1; j <= digit; j++) {
                fact *= j;
            }
            sum += fact;
        }
        int inputNum = Integer.parseInt(number);
        if(sum == inputNum){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
