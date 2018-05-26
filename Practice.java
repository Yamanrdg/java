public class Practice {
  public static void main(String[] args) {
    for (int i = 2; i > 0; i--) {
      for (int j = 1; j <= i; j++) {
        if (j == i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}