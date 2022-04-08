import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge_07 {
    static class People {
        String name;
        String id;
        int age;

        public People(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String toString() {
            return String.format("%s with ID: %s is %d years old.", name, id, age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<People> allPeople = new ArrayList<>();

        while (!input.equals("End")) {
            String[] data = input.split(" ");
            String name = data[0];
            String id = data[1];
            int age = Integer.parseInt(data[2]);
            People people = new People(name, id, age);
            allPeople.add(people);

            input = scanner.nextLine();
        }
        allPeople.stream()
                .sorted((a1, a2) -> Double.compare(a1.getAge(), a2.getAge()))
                .forEach(people -> System.out.println(people.toString()));
    }
}
