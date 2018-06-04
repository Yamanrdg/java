public class FunctionsThree {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    printArrayValue(a);
    int[] b = { 10, 20, 30, 40 };
    printArrayValue(b);
  }

  public static void printArrayValue(int[] j) {
    for (int i = 0; i < j.length; i++) {
      System.out.println(j[i]);
    }
  }
}