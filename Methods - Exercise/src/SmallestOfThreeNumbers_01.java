import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int smallestNum = findSmallestNumber(firstNum, secondNum);
        int theSmallestNum = findSmallestNumber(smallestNum, thirdNum);

        System.out.println(theSmallestNum);
    }

    static int findSmallestNumber(int firstNum, int secondNum) {
        if (firstNum < secondNum) {
            return firstNum;
        }
        return secondNum;

    }
}
