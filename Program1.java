package screeningtest;

import java.util.Scanner;

public class Program1 {
    private double a;
    private double b;

    public Program1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double subtract() {
        return a - b;
    }

    public double multiply() {
        return a * b;
    }

    public double divide() {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the type of operation (add/subtract/multiply/divide): ");
        String operation = scanner.next();

        Program1 calculator = new Program1(num1, num2);

        double result;
        switch (operation) {
            case "add":
                result = calculator.add();
                System.out.println("Result of addition: " + result);
                break;
            case "subtract":
                result = calculator.subtract();
                System.out.println("Result of subtraction: " + result);
                break;
            case "multiply":
                result = calculator.multiply();
                System.out.println("Result of multiplication: " + result);
                break;
            case "divide":
                try {
                    result = calculator.divide();
                    System.out.println("Result of division: " + result);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }

        scanner.close();
    }
}
