package creational.classscope.factorymethod.example2InhHierarchy;

public class SoftwareEngineerFactory extends EngineerFactory {

  @Override
  protected MileStone createMileStone() {
    return new SoftwareEngineeringMileStone();
  }

  @Override
  protected Engineer createEngineer() {
    return new SoftwareEngineer();
  }
}
