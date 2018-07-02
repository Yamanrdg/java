public class CarTwo {
  String compName;
  String color;
  String mgDate;
  String model;
  int numOfseats;

  CarTwo() { // constructor
    compName = "Tata";
    color = "Black";
    mgDate = "2016/12/24";
    model = "nano";
    numOfseats = 3;
  }

  CarTwo(String compName, String color, String model) { // constructor with different params
    this.compName = compName;
    this.color = color;
    this.model = model;
  }

  void makeSound() {
    System.out.println("bhur bhur");
  }

  void toogleLight(boolean status) {
    if (status) {
      System.out.println("Light is on");
    } else {
      System.out.println("Light is off");
    }
  }

  int speed(int weelSpeedPerSecond) {
    return weelSpeedPerSecond * 60 * 60; // dummy function to calculate speed of a car per hour
  }

  int speed() {
    return 30;
  }

  void info() {
    System.out.println("CompName: " + compName);
    System.out.println("Color: " + color);
    System.out.println("model: " + model);
  }

  public static void main(String[] args) {
    CarTwo car1 = new CarTwo("Ford", "Red", "edge"); // calling second constructor
    car1.info();
    System.out.println(car1.speed());

    CarTwo car2 = new CarTwo(); // calling first constructor
    car2.info();
    System.out.println(car1.speed(60));
  }
}