package creational.objectscope.abstractfactory;

public class AmericanNavalSoldier implements NavalSoldier{
  @Override
  public void echo() {
    System.out.println("I am american naval soldier holding American flag in my uniform");
  }
}
