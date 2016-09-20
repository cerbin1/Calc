public class Calculator {
    public void run() {

        Numbers numbers = new Numbers();

        System.out.println("Podaj pierwsza liczbe");
        numbers.firstNumber = numbers.setNumber();

        System.out.println("podaj druga liczbe");
        numbers.secondNumber = numbers.setNumber();

        System.out.println("Co chcesz zrobic: ");
        numbers.choice = numbers.setNumber();

        switch (numbers.choice) {
            case 1:
                System.out.println(numbers.firstNumber + " + " + numbers.secondNumber + " = " + (numbers.firstNumber + numbers.secondNumber));
                break;
            case 2:
                System.out.println(numbers.firstNumber + " - " + numbers.secondNumber + " = " + (numbers.firstNumber - numbers.secondNumber));
                break;
            case 3:
                System.out.println(numbers.firstNumber + " * " + numbers.secondNumber + " = " + (numbers.firstNumber * numbers.secondNumber));
                break;
            case 4:
                System.out.println(numbers.firstNumber + " / " + numbers.secondNumber + " = " + (numbers.firstNumber / numbers.secondNumber));
                break;
            default:
                System.out.println("Wybrales zly number!");
        }
    }
}