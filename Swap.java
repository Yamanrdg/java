public class Swap {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    swap(a, b);
  }

  public static void swap(int a, int b) {
    System.out.println("Before swapping:");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    // a -> red water glass
    // b -> green water glass
    // temp -> new empty glass
    int temp = a; // red water new empty glass ma rakhe
    a = b; // red water glass empty -> green water red water glass ma rakhe
    b = temp; // green water glass empty -> new glass ma bhako red water green glass ma rakhe
    System.out.println("After swapping:");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}