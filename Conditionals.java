public class Conditionals {
  public static void main(String[] args) {
    int a = 8;
    int b = 1;
    // true && false => false
    // true || false => true
    if (a < 10 && b == 10) {
      System.out.println("A is equal to 10");
    } else if (b == 1) {
      System.out.println("B is equal to 1");
    } else {
      System.out.println("A is not equal to 10");
    }
  }
}

/*
 * == equal <= less or equal to >= greater or equal to < less > greater
 * 
 * != not equal
 * 
 */

/*
 * true && true => true true && false => false false && true => false false &&
 * false => false
 * 
 * true || true => true true || false => true false || true => true false ||
 * false => false
 */
