public class Break {
  public static void main(String[] args) {
    for (int a = 0; a < 10; a++) {
      if (a == 5) {
        break;
      }
      System.out.print("*");
    }
  }
}