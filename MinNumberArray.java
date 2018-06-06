public class MinNumberArray {
  public static void main(String[] args) {
    int[] numbers = { 90, 32, 12, 14, 17, 90, 23, 4 };

    System.out.println(min(numbers));
  }

  public static int min(int[] numbers) {
    int minNumber = numbers[0];

    for (int i = 0; i < numbers.length; i++) {
      if (minNumber > numbers[i]) {
        minNumber = numbers[i];
      }
    }
    return minNumber;
  }
}