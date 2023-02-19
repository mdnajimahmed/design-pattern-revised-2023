package creational.objectscope.simplefactorystatic;

public class FoodFactory {
  public static Food getRice() {
    return null;
  }

  public static Food getEgg(int type) {
    switch (type) {
      case 0:
        return new ChickenEgg();
      case 1:
        return new GooseEgg();
      default:
        throw new RuntimeException("Unknown egg type");
    }
  }
}
