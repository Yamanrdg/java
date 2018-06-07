import java.util.Scanner;

public class Mult {
  public static void main(String[] args) {
    System.out.print("Enter any number between 1 to 9: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt(); // nextDouble nextLine nextFloat
    mult(number);
    scanner.close();
  }

  public static void mult(int number) {
    for (int i = 1; i <= 10; i++) {
      int result = number * i;
      String outputString = number + " x " + i + " = " + result;
      System.out.println(outputString);
    }
  }
}