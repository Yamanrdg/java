public class FunctionsTwo {
  public static void main(String[] args) {
    printName();
  }

  public static void printName() {
    printFirstName(); // syntax of function call
    printLastName();
  }

  public static void printFirstName() {
    System.out.println("Rabin");
  }

  public static void printLastName() {
    System.out.println("Gaire");
  }
}
