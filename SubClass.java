class SuperClass {
  int age; // class var

  SuperClass(int age) { // constructor
    this.age = age;
  }

  public void getAge() {
    System.out.println(this.age); // pointing class var
  }
}

public class SubClass extends SuperClass {
  SubClass(int age) { // constructor
    super(age); // super here is method
  }

  public static void main(String[] args) {
    SubClass objOne = new SubClass(18);
    objOne.getAge();
  }
}