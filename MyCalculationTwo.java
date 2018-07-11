class Calculation { // Parent Class
  public void add(int a, int b) {
    int c = a + b;
    System.out.print("Super Class Sum:");
    System.out.println(c);
  }

  public void sub(int a, int b) {
    int c = a - b;
    System.out.print(c);
  }
}

public class MyCalculationTwo extends Calculation { // Sub Class // Child Class
  public void add(int a, int b) {
    int c = a + b;
    System.out.print("Sub Class Sum:");
    System.out.println(c);
  }

  public void wrapperMethod() {
    super.add(10, 20); // super here is object
  }

  public static void main(String[] args) {
    MyCalculationTwo calcTwo = new MyCalculationTwo();
    calcTwo.add(200, 400);
    calcTwo.wrapperMethod();
  }
}