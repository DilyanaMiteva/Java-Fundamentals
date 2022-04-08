import java.util.List;
import java.util.Scanner;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputAsAArray = scanner.nextLine().split("\\|");

        String result = "";
        for (int i = inputAsAArray.length - 1; i >= 0; i--) {
            String[] currentArr = inputAsAArray[i].split("\\s+");
            for (int j = 0; j < currentArr.length; j++) {
                if (!currentArr[j].equals("")) {
                    result += currentArr[j] + " ";
                }
            }
        }
        System.out.println(result.trim());
    }
}
