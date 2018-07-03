class Math {
  int a;
  int b;

  Math() { // constructor
    this.a = 10;
    this.b = 10;
  }

  Math(int a) { // constructor
    this.a = a;
    this.b = 10;
  }

  Math(int a, int b) { // constructor
    this.a = a;
    this.b = b;
  }

  int add() {
    return this.a + this.b;
  }

  int sub() {
    return this.a - this.b;
  }

  int doubleValue() {
    return this.a * this.a;
  }

  public static void main(String[] args) {
    Math objOne = new Math(2); // object
    int resultAdd = objOne.add();
    int resultSub = objOne.sub();
    int resultDoubleValue = objOne.doubleValue();
    System.out.println(resultAdd);
    System.out.println(resultSub);
    System.out.println(resultDoubleValue);
  }
}