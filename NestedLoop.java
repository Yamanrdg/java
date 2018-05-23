public class NestedLoop {
  public static void main(String[] args) {
    for (int a = 1; a <= 2; a++) {

      for (int b = 1; b <= 2; b++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}