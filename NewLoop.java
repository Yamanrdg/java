public class NewLoop {
  public static void main(String args[]) {
    int[] numbers = { 10, 20, 30, 40, 50, 60, 70 };

    // For Each
    for (int number : numbers) { // for number in numbers
      System.out.println(number);
    } // LOOP

    for (int i = 0; i < numbers.length; i++) {
      System.out.println(i);
    }
  }
}
