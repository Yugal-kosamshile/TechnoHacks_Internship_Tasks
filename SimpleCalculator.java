import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Calculation of two numbers");
            System.out.println("2. Area calculation (Square, Triangle, Rectangle, Circle)");
            System.out.println("3. Table of a number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter first number: ");
                    double num1 = scanner.nextDouble();

                    System.out.println("Enter an operator (+, -, *, /, %): ");
                    char operator = scanner.next().charAt(0);

                    System.out.println("Enter second number: ");
                    double num2 = scanner.nextDouble();

                    double result;

                    switch (operator) {
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                        case '/':
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                System.out.println("Error: Division by zero is not allowed.");
                                continue;
                            }
                            break;
                        case '%':
                            if (num2 != 0) {
                                result = num1 % num2;
                            } else {
                                System.out.println("Error: Division by zero is not allowed.");
                                continue;
                            }
                            break;
                        default:
                            System.out.println("Error: Invalid operator.");
                            continue;
                    }

                    System.out.println("The result is: " + result);
                    break;

                case 2:
                    System.out.println("Choose shape for area calculation:");
                    System.out.println("a. Square");
                    System.out.println("b. Triangle");
                    System.out.println("c. Rectangle");
                    System.out.println("d. Circle");
                    System.out.print("Enter your choice: ");
                    char shapeChoice = scanner.next().charAt(0);

                    switch (shapeChoice) {
                        case 'a':
                            System.out.print("Enter side length of the square: ");
                            double side = scanner.nextDouble();
                            System.out.println("Area of square: " + (side * side));
                            break;
                        case 'b':
                            System.out.print("Enter base of the triangle: ");
                            double base = scanner.nextDouble();
                            System.out.print("Enter height of the triangle: ");
                            double height = scanner.nextDouble();
                            System.out.println("Area of triangle: " + (0.5 * base * height));
                            break;
                        case 'c':
                            System.out.print("Enter length of the rectangle: ");
                            double length = scanner.nextDouble();
                            System.out.print("Enter width of the rectangle: ");
                            double width = scanner.nextDouble();
                            System.out.println("Area of rectangle: " + (length * width));
                            break;
                        case 'd':
                            System.out.print("Enter radius of the circle: ");
                            double radius = scanner.nextDouble();
                            System.out.println("Area of circle: " + (Math.PI * radius * radius));
                            break;
                        default:
                            System.out.println("Error: Invalid shape choice.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a number to generate its table: ");
                    int number = scanner.nextInt();
                    System.out.println("Table of " + number + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(number + " x " + i + " = " + (number * i));
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Error: Invalid menu choice.");
            }
        }
    }
}