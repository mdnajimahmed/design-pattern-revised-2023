package creational.objectscope.builder.ex3;

public class MotorCycleBuilder implements VehicleBuilder {
  MotorCycle motorCycle;
  public MotorCycleBuilder() {
    motorCycle=new MotorCycle();
  }
  @Override
  public void addBrandName() {
    motorCycle.add("MotorBrand");
  }
  @Override
  public void buildBody() {
    motorCycle.add("motorcycle body");
  }
  @Override
  public void insertWheels() {
    motorCycle.add("motorcycle wheels");
  }
  @Override
  public Vehicle getVehicle() {
    return motorCycle;
  }
}
