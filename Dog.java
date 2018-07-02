public class Dog {
  public Dog() { // Constructor
    System.out.println("Constructor called");
  }

  public void bark() {
    System.out.println("Wohf Wohf Wohf");
  }

  public static void main(String[] args) {
    Dog rocket = new Dog();
    rocket.bark();
  }
}