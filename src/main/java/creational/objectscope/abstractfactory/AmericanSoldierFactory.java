package creational.objectscope.abstractfactory;

public class AmericanSoldierFactory implements SoldierFactory {
  @Override
  public InfantrySoldier getInfantrySoldier() {
    return new AmericanInfantrySoldier();
  }

  @Override
  public NavalSoldier getNavalSoldier() {
    return new AmericanNavalSoldier();
  }
}
