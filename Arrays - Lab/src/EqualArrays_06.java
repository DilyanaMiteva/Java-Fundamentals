import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstArrayString = scanner.nextLine();
        String[] firstNumbersString = firstArrayString.split(" ");
        int[] firstArray = new int[firstNumbersString.length];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = Integer.parseInt(firstNumbersString[i]);
        }

        String secondArrayString = scanner.nextLine();
        String[] secondNumbersString = secondArrayString.split(" ");
        int[] secondArray = new int[secondNumbersString.length];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = Integer.parseInt(secondNumbersString[i]);
        }
        int sum = 0;
        boolean areEqual = true;
        int differentAtIndex = -1;
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    areEqual = false;
                    differentAtIndex = i;
                    break;
                }
            }
        } else {
            areEqual = false;
        }
        if (areEqual){
            for (int number : firstArray) {
                sum += number;
            }

            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at " + differentAtIndex + " index.");
        }


    }
}
