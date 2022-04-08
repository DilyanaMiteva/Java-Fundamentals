import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfPeople = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;
        double totalPrice = 0.0;
        switch (typePeople) {
            case "Students":
                if (day.equals("Friday")) {
                    price = 8.45;
                } else if (day.equals("Saturday")) {
                    price = 9.8;
                } else if (day.equals("Sunday")) {
                    price = 10.46;
                }
                if (countOfPeople >= 30) {
                    totalPrice = countOfPeople * price - ((countOfPeople * price) * 0.15);
                } else{
                    totalPrice = countOfPeople * price;
                }
                break;
            case "Business":
                if (day.equals("Friday")) {
                    price = 10.9;
                } else if (day.equals("Saturday")) {
                    price = 15.6;
                } else if (day.equals("Sunday")) {
                    price = 16;
                }
                if (countOfPeople >= 100) {
                    totalPrice = (countOfPeople - 10) * price;
                } else{
                    totalPrice = countOfPeople * price;
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    price = 15;
                } else if (day.equals("Saturday")) {
                    price = 20;
                } else if (day.equals("Sunday")) {
                    price = 22.5;
                }
                if (countOfPeople >= 10 && countOfPeople <= 20) {
                    totalPrice = countOfPeople * price - ((countOfPeople * price) * 0.05);
                } else{
                    totalPrice = countOfPeople * price;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);


    }
}
