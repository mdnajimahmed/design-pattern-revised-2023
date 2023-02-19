package creational.objectscope.abstractfactory;

public interface SoldierFactory {
  InfantrySoldier getInfantrySoldier();

  NavalSoldier getNavalSoldier();
}
