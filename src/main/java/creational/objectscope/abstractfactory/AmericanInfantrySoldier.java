package creational.objectscope.abstractfactory;

public class AmericanInfantrySoldier implements InfantrySoldier{
  @Override
  public void echo() {
    System.out.println("I am American infantry soldier holding American flag in my uniform");
  }
}
