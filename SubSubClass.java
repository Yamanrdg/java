class Calculation { // Parent Class
  public void add(int a, int b) {
    int c = a + b;
    System.out.println(c);
  }

  public void sub(int a, int b) {
    int c = a - b;
    System.out.print(c);
  }
}

class MyCalculation extends Calculation { // Sub Class // Child Class
  public void mult(int a, int b) {
    int c = a * b;
    System.out.println(c);
  }
}

public class SubSubClass extends MyCalculation {
  public void div(int a, int b) {
    int c = a / b;
    System.out.println(c);
  }

  public static void main(String[] args) {
    SubSubClass calc = new SubSubClass();
    calc.add(10, 20);
    calc.mult(10, 20);
    calc.div(4, 2);
  }
}