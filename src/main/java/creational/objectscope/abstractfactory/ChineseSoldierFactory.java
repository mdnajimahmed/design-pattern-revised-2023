package creational.objectscope.abstractfactory;

public class ChineseSoldierFactory implements SoldierFactory{
  @Override
  public InfantrySoldier getInfantrySoldier() {
    return new ChineseInfantrySoldier();
  }

  @Override
  public NavalSoldier getNavalSoldier() {
    return new ChineseNavalSoldier();
  }
}
