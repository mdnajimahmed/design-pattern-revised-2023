package creational.classscope.factorymethod.example2InhHierarchy;

public class Client {
  public static void main(String[] args) {
    EngineerFactory swefactory = new SoftwareEngineerFactory();
    Engineer swe = swefactory.getEngineer();
    MileStone sweMileStone = swe.getMileStone();
    System.out.println("swe milestone" + sweMileStone);

    EngineerFactory civilfactory = new CivilEngineerFactory();
    Engineer civilEngineer = civilfactory.getEngineer();
    MileStone civilEngineerMileStone = civilEngineer.getMileStone();
    System.out.println("civilEngineer milestone" + civilEngineerMileStone);

  }
}
