public class Subtract {

  // Declaring the static diff Function
  static void diff(int x, int y) {
    System.out.println(x - y);
  }
  
  // Declaring the static altDiff Function
  static int altDiff(int x, int y) {
    return x - y;
  }

  public static void main(String[] args) {
    
    // Calling the static functions

    diff(5, 3);

    int x = altDiff(20, 15);

    System.out.println(x);

  }
}
