class Calculation {
  int a;
  int b;

  Calculation(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public void add() {
    int c = this.a + this.b;
    System.out.println(c);
  }
}

public class SubClassCalculation extends Calculation {
  SubClassCalculation(int a, int b) {
    super(a, b);
  }

  public void add() {
    int c = 30 + 60;
    System.out.println(c);
  }

  public void superAdd() {
    super.add();
  }

  public static void main(String[] args) {
    SubClassCalculation objOne = new SubClassCalculation(90, 45);
    objOne.superAdd();
    objOne.add();
  }
}