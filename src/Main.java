import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // Creating scanner
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    int userInput = sc.nextInt();

    if (userInput <= 1) {
      System.out.println("Not a prime number");
    }

    boolean isPrime = true;

    for (int i = 2; i < userInput; i++) {
      if (userInput % i == 0) {
        isPrime = false;
      }
    }

    if (isPrime) {
      System.out.println("Given number is prime");
    } else {
      System.out.println("Not a prime number");
    }

    sc.close();
  }
}
