import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }

        int counter = 1;
        while (counter <= 3){
            String input = scanner.nextLine();
            if(input.equals(password)){
                System.out.printf("User %s logged in.", username);
                return;
            } else {
                System.out.printf("Incorrect password. Try again.");
                System.out.println();
            }
            counter++;
        }
        System.out.printf("User %s blocked!", username);
    }
}
