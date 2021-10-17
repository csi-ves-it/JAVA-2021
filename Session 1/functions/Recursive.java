public class Recursive {
  
  int fact(int n) {
    if (n == 0) {
      return 1;
    }

    return n * fact(n-1); // Calling the same function again
  }

  public static void main(String[] args) {
    
    Recursive obj = new Recursive();

    int factorial = obj.fact(5);

    System.out.println("Factorial : " + factorial);

  }
}
