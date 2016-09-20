import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

    }

    public void displayMenu() {
        System.out.println("Calculator of two numbers");
        System.out.println("Choose what do you want to do.");
        System.out.println("1. Addition");
        System.out.println("2. Substracting");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Your choice: ");
    }

    public void setNumber(int number) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            number = in.nextInt();
            System.out.println("Podana liczba:");
            System.out.println(number);
        } catch (Exception e) {
            System.err.print("Nie wpisałeś poprawnych danych.");
        }
    }

}
