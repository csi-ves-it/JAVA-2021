public class Vehicle {

  String type;
  String model;
  int wheels;

  // Default Constructor - Initializing Instant Variables
  Vehicle() {
    type = "";
    model = "";
    wheels = 0;
  }

  void drive() {
    System.out.println("Ahh such a nice ride!");
  }
  
  public static void main(String[] args) {
    
    Vehicle obj = new Vehicle();

    obj.type = "car";
    obj.model = "Ferrari";
    obj.wheels = 4;

    System.out.println(obj.type);
    System.out.println(obj.model);
    System.out.println(obj.wheels);

    obj.drive();

  }

}

