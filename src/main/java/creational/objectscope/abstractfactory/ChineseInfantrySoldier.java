package creational.objectscope.abstractfactory;

public class ChineseInfantrySoldier implements InfantrySoldier{
  @Override
  public void echo() {
    System.out.println("I am Chinese infantry soldier holding Chinese flag in my uniform");
  }
}
