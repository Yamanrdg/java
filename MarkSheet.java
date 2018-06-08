import java.util.Scanner;

public class MarkSheet {
  public static void main(String[] args) {
    inputUserInfo();
    double[] marks = subjectMarks();
    calculatePercentage(marks);
    printMarksheet();
  }

  public static void inputUserInfo() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Your Name: ");
    String userName = scanner.nextLine();
    System.out.print("Enter Your Age: ");
    int age = scanner.nextInt();
    System.out.print("Enter Your Grade: ");
    int grade = scanner.nextInt();
  }

  public static double[] subjectMarks() {
    double marks[] = new double[3];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter marks in each subjects: ");
    System.out.print("English: ");
    marks[0] = scanner.nextDouble();
    System.out.print("Nepali: ");
    marks[1] = scanner.nextDouble();
    System.out.print("Computer: ");
    marks[2] = scanner.nextDouble();
    scanner.close();
    return marks;
  }

  public static void calculatePercentage(double[] marks) {
    double grandTotal = 0.0;
    double fullTotal = marks.length * 100.0;
    for (int i = 0; i < marks.length; i++) {
      grandTotal += marks[i];
    }
    double percentage = (grandTotal / fullTotal) * 100;
    System.out.println("Percentage: " + percentage + "%");
  }

  public static void printMarksheet() {
    /*
     * English : 81 Nepali: 78 Computer: 89 Grand Total: <total_value> Percentage:
     * <percentage>
     * 
     */
  }
}