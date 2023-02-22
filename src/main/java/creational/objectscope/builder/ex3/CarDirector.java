package creational.objectscope.builder.ex3;

class CarDirector extends Director {
  // The car director follows
  // its own sequence:
  // Make body-> add wheels->then add the brand name.
  public Vehicle instruct(VehicleBuilder builder) {
    builder.buildBody();
    builder.insertWheels();
    builder.addBrandName();
    return builder.getVehicle();
  }
}