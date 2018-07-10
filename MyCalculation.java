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

public class MyCalculation extends Calculation { // Sub Class // Child Class
  public void mult(int a, int b) {
    int c = a * b;
    System.out.println(c);
  }

  public static void main(String[] args) {
    MyCalculation calc = new MyCalculation();
    calc.add(10, 20);
    calc.mult(10, 20);
  }
}