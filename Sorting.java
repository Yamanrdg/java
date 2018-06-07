public class Sorting {
  public static void main(String[] args) {
    int numbers[] = { 12, 13, 14, 5, 78, 23, 45, 56 };
    int sortedArray[] = sortAsc(numbers);
    for (int i = 0; i < sortedArray.length; i++) {
      System.out.println(sortedArray[i]);
    }
  }

  public static int[] sortAsc(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length; j++) { // 2
        if (numbers[i] < numbers[j]) {
          int temp = numbers[i];
          numbers[i] = numbers[j];
          numbers[j] = temp;
        }
      }
    }
    return numbers;
  }
}