package creational.classscope.factorymethod.example2InhHierarchy;

public class CivilEngineerFactory extends EngineerFactory{
  protected MileStone createMileStone() {
    return new CivilEngineeringMileStone();
  }

  protected Engineer createEngineer() {
    return new CivilEngineer();
  }
}
