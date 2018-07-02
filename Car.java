class Car {
  String compName;
  String color;
  String mgDate;
  String model;
  int numOfseats;

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

  void info() {
    System.out.println("CompName: " + compName);
    System.out.println("Color: " + color);
    System.out.println("model: " + model);
  }

  public static void main(String[] args) {
    Car car1 = new Car();
    car1.compName = "Ford";
    car1.color = "Black";
    car1.mgDate = "2016/03/24";
    car1.model = "edge";
    car1.numOfseats = 4;
    car1.makeSound();
    car1.toogleLight(true);
    int speedOfCar1 = car1.speed(10);
    System.out.println(speedOfCar1);
    car1.info();

    Car car2 = new Car();
    car2.compName = "Tata";
    car2.color = "Black";
    car2.mgDate = "2016/12/24";
    car2.model = "nano";
    car2.numOfseats = 3;
    car2.makeSound();
    car2.toogleLight(false);
    int speedOfCar2 = car2.speed(5);
    System.out.println(speedOfCar2);
    car2.info();
  }
}