package creational.objectscope.builder.ex3;

// The CarBuilder builds cars.
class CarBuilder implements VehicleBuilder {
  Car car;

  public CarBuilder() {
    car = new Car();
  }

  @Override
  public void addBrandName() {
    car.add("Toyota");
  }

  @Override
  public void buildBody() {
    car.add("TheBody");
  }

  @Override
  public void insertWheels() {
    car.add("TheWheels");
  }

  @Override
  public Vehicle getVehicle() {
    return car;
  }
}