import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printCharactersInRange(firstSymbol, secondSymbol);
    }

    public static void printCharactersInRange(char first, char second){
        if (first < second){
            for (char i = (char) (first + 1); i < second; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = (char) (second + 1); i < first; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
