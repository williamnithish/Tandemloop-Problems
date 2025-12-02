import java.util.Scanner;

class Calculator {
    
    
    public double calculate(double a, double b, String operation) {

        switch(operation.toLowerCase()) {

            case "add":
            case "+":
                return a + b;

            case "sub":
            case "subtract":
            case "-":
                return a - b;

            case "mul":
            case "multiply":
            case "*":
                return a * b;

            case "div":
            case "divide":
            case "/":
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                    return 0;
                }
                return a / b;

            default:
                System.out.println("Invalid Operation");
                return 0;
        }
    }
}

public class Problem_1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String op = sc.next();

        
        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, op);

        System.out.println("Result = " + result);
    }
}
