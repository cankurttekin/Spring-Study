import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Name: ");
        String name = reader.nextLine();

        System.out.print("Age: ");
        int age = Integer.valueOf(reader.nextLine());

        System.out.print("Height: ");
        double height = Double.valueOf(reader.nextLine());

        System.out.print("Weight: ");
        double weight = Double.valueOf(reader.nextLine());

        Person person = new Person(name, age, height, weight);
        System.out.println(person);
    }
}