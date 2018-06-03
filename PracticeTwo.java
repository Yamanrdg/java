public class PracticeTwo {
  public static void main(String[] args) {
    int a = 10;
    boolean b = false;
    double c = 10.5;

    int[] d = { 1, 2, 3, 4, 5, 6 };

    String e = "Hello World";

    System.out.println(e);

    for (int i = 0; i < d.length; i++) {
      System.out.println(d[i]);
    }

    int j = 0;
    while (j < d.length) {
      System.out.println("While Loop: " + d[j]);
      j++;
    }

    if (b) {
      System.out.println("b is " + b);
    } else {
      System.out.println("b is " + b);
    }
  }
}