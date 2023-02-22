package creational.objectscope.builder.ex3;

public interface VehicleBuilder {
  void addBrandName();
  void buildBody();
  void insertWheels();
  // The following method is used to
  // retrieve the object that is constructed.
  Vehicle getVehicle();
}
