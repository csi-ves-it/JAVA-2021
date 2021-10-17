public class Vehicle2 {
  
  String type;
  String model;
  int wheels;

  // Parameterized Constructor - Initializing Instant Variables
  Vehicle2(String type, String model, int wheels) {
    this.type = type;
    this.model = model;
    this.wheels = wheels;
  }

  void drive() {
    System.out.println("Ahh such a nice ride!");
  }

  void accelerate() {
    System.out.println("My " + this.model + " is accelerating!");
  }

  void stop() {
    System.out.println("The " + this.wheels + " have come to a halt!");
  }

  public static void main(String[] args) {

    Vehicle2 obj = new Vehicle2("car", "Ferrari", 4);

    System.out.println(obj.type);
    System.out.println(obj.model);
    System.out.println(obj.wheels);

    obj.drive();

    obj.accelerate();
    
    obj.stop();

  }

}
