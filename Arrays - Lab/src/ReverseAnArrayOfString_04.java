
import java.util.Scanner;

public class ReverseAnArrayOfString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");

        for (int i = 0; i < elements.length / 2; i++) {
            int swapIndex = elements.length - 1 - i;
            String oldElementI = elements[i];
            elements[i] = elements[swapIndex];
            elements[swapIndex] = oldElementI;
        }
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
    }
}
