package creational.objectscope.builder.ex3;

class Client {
  public static void main(String[] args) {
    System.out.println("*** Builder Pattern Demonstration. ***");
    // Making a car
    VehicleBuilder builder = new CarBuilder();
    Director director = new CarDirector();
    Vehicle vehicle = director.instruct(builder);
    vehicle.showProduct();
    // Making a motorcycle
    builder = new MotorCycleBuilder();
    director = new MotorCycleDirector();
    vehicle = director.instruct(builder);
    vehicle.showProduct();
  }
}