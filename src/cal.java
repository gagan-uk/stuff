import java.util.Scanner;

public class cal {

  public static int userInput() {

    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number: ");
    int userInput = sc.nextInt();

    return userInput;
  }

  public static int add(int a, int b) {
    return a + b;
  }

  public static int sub(int a, int b) {
    return a - b;
  }

  public static int mul(int a, int b) {
    return a * b;
  }

  public static int div(int a, int b) {
    return a / b;
  }

  public static void main(String[] args) {

    System.out.println("Select a operation:");
    System.out.print("1.Addtion\n2.Subtraction\n3.Multiplication\n4.Division\n");
    int operation = userInput();

    if (operation == 1) {
      System.out.printf("The sum is: %d ", add(userInput(), userInput()));
    } else if (operation == 2) {
      System.out.printf("The subtration is: %d", sub(userInput(), userInput()));
    } else if (operation == 3) {
      System.out.printf("The product is: %d", mul(userInput(), userInput()));
    } else if (operation == 4) {
      System.out.printf("The reminder is: %d", div(userInput(), userInput()));
    } else {
      System.out.println("Invaid operation");
    }

  }

}
