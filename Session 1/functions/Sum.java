public class Sum {
  
  // Declaring the add Function
  void add(int x, int y) {
    System.out.println(x + y);
  }
  
  // Declaring the altAdd Function
  double altAdd(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    
    Sum obj = new Sum(); // Creating Object of Class Sum

    obj.add(3, 4); // Calling the add Function

    double z = obj.altAdd(5, 10); // Calling the altAdd Function

    System.out.println(z); // Printing the returned value
  }
}
