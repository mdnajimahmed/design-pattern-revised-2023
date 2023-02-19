package creational.objectscope.abstractfactory;

public class Client {
  public static void main(String[] args) {
    SoldierFactory americanSoldierFactory = new AmericanSoldierFactory();
    InfantrySoldier americanInfantrySoldier = americanSoldierFactory.getInfantrySoldier();
    americanInfantrySoldier.echo();
    NavalSoldier americanNavalSoldier = americanSoldierFactory.getNavalSoldier();
    americanNavalSoldier.echo();


    SoldierFactory factory = new ChineseSoldierFactory();
    InfantrySoldier chineseInfantrySoldier = factory.getInfantrySoldier();
    chineseInfantrySoldier.echo();
    NavalSoldier chineseNavalSoldier = factory.getNavalSoldier();
    chineseNavalSoldier.echo();
  }
}
