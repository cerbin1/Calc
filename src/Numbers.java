import java.util.Scanner;

public class Numbers {
    public int firstNumber;
    public int secondNumber;
    public int choice;

    Scanner getInt = new Scanner(System.in);

    public int setNumber() {
        return getInt.nextInt();
    }
}
