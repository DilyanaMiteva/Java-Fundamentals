import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                if (r + 1 == c) {
                    l.add(matrix[r][c]);
                }
            }
        }
        boolean growingNumber = true;
        for (int i = 0; i < l.size() - 1; i++) {
            if (l.get(i) > l.get(i + 1)) {
                growingNumber = false;
                break;
            }
        }
        System.out.println(growingNumber);
    }
}