public class Functions {
  public static void main(String[] args) {
    int a = add(10, 20); // parameters
    sub(a, 10);
    a = 50;
    sub(10, a);
  }

  public static int add(int x, int y) { // arguments // function decleration
    return x + y;
  }

  public static void sub(int x, int y) {
    System.out.println(x - y);
  }
}