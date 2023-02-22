package creational.objectscope.builder.ex3;

public class MotorCycleDirector extends Director{
  // The motor cycle director follows
  // its own sequence:
  // Add brand name-> make body-> insert wheels.
  public Vehicle instruct(VehicleBuilder builder) {
    builder.addBrandName();
    builder.buildBody();
    builder.insertWheels();
    return builder.getVehicle();
  }
}
