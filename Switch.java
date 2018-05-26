public class Switch {
  public static void main(String[] args) {
    String a = "World";

    switch (a) {
    case "Hello":
      System.out.println("I am Hello");
      break;
    case "World":
      System.out.println("I am World");
      break;
    case "Boom":
      System.out.println("I am Boom");
      break;
    default:
      System.out.println("Default case Running");
      break;
    }
  }
}