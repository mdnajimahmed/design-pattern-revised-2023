package creational.classscope.factorymethod.example2InhHierarchy;

public class EngineerFactory {
  protected Engineer getEngineer() {
    MileStone mileStone = createMileStone();
    Engineer engineer = createEngineer();
    engineer.setMileStone(mileStone);
    return engineer;
  }

  protected MileStone createMileStone() {
    return new DefaultMilestone();
  }

  protected Engineer createEngineer() {
    return new Engineer();
  }
}
