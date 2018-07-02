public class DogTwo {
  public String name;
  public int age;
  public String color;

  public void barking() {
    System.out.println(name + " Does:");
    System.out.println("Wof wof wof");
  }

  public static void main(String[] args) {
    DogTwo dogOne = new DogTwo(); // object
    dogOne.name = "Tommy";
    dogOne.age = 12;
    dogOne.color = "black";
    dogOne.barking();
    DogTwo dogTwo = new DogTwo(); // object
    dogTwo.name = "Rocket";
    dogTwo.barking();
  }
}
