import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String file = text.substring(text.lastIndexOf('\\') + 1, text.indexOf('.'));
        String extension = text.substring(text.lastIndexOf('.') + 1);

        System.out.println("File name: " + file);
        System.out.println("File extension: " + extension);

    }
}
