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

public class MyCalculationThree extends Calculation { // Sub Class // Child Class
  public void mult(int a, int b) {
    int c = a * b;
    System.out.println(c);
  }

  public static void main(String[] args) {
    MyCalculationThree calc = new MyCalculationThree();
    calc.add(10, 20); // 30
    calc.mult(10, 20); // 200
    System.out.println(calc instanceof MyCalculationThree); // true
    System.out.println(calc instanceof Calculation); // true
    Calculation calc2 = new Calculation();
    System.out.println(calc2 instanceof MyCalculationThree); // false
  }
}