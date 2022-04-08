import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfPerson = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = (int) Math.ceil((double) countOfPerson / capacity); //int remainingNumber = countOfPerson % capacity; System.out.println(courses); //17/3 = 5 //17%3 = 2
    }
}