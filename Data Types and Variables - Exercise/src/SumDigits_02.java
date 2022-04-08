import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.nextLine();
        int sumOfDigits = 0;
        for (int i = 0; i < inputNumber.length(); i++) {
            int currentNumber = inputNumber.charAt(i) - 48;
            sumOfDigits += currentNumber;
        }
        System.out.println(sumOfDigits);
    }
}