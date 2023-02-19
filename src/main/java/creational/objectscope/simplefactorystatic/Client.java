package creational.objectscope.simplefactorystatic;

public class Client {
  public static void main(String[] args) {
    Food rice = FoodFactory.getRice();
    Food egg = FoodFactory.getEgg(0);
  }
}
