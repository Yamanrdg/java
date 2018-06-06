public class MinNumber {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int minnumber = min(a, b);
    System.out.println(minnumber); // ?

    // if (a < b) {
    // System.out.println("a is smaller");
    // } else {
    // System.out.println("b is smaller");
    // }

    int c = 20;
    int d = 67;
    System.out.println(min(c, d));

    // if (c < d) {
    // System.out.println("c is smaller");
    // } else {
    // System.out.println("d is smaller");
    // }

    int e = 21;
    int f = 32;
    System.out.println(min(e, f));

    // if (e < f) {
    // System.out.println("e is smaller");
    // } else {
    // System.out.println("f is smaller");
    // }
  }

  public static int min(int i, int j) {
    if (i < j) {
      return i;
    } else {
      return j;
    }
  }
}