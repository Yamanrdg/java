// Is A Relationship
class Animal {
  public void hungry() {
    System.out.print(true);
  }
}

class Mammal extends Animal {
  public void breastFeeding() {
    System.out.print(true);
  }

  public void info() {
    Mammal cow = new Mammal();
    cow.breastFeeding();
    cow.hungry();
  }
}

class Reptile extends Animal {
  public void coldBlooded() {
    System.out.print(true);
  }

  public void info() {
    Reptile liz = new Reptile();
    liz.coldBlooded();
    liz.hungry();
  }
}

public class Dog extends Mammal {
  public void bark() {
    System.out.print("wof wof wof");
  }

  public void info() {
    Dog rocky = new Dog();
    rocky.hungry();
    rocky.breastFeeding();
    rocky.bark();
  }
}