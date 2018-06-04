public class Scopes {
  public static void main(String[] args) {
    // block scoping
    int a = 10;
    {
      System.out.println(a);
    }
    data(a);
  }

  public static void data(int j) {
    System.out.println(j);
  }
}