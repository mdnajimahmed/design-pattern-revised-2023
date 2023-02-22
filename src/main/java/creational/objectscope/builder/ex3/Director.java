package creational.objectscope.builder.ex3;

// Director class
abstract class Director {
  // Director knows how to use/instruct the
  // builder to create a vehicle.
  public abstract Vehicle instruct(VehicleBuilder builder);
}
