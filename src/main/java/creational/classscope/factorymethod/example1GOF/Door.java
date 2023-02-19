package creational.classscope.factorymethod.example1GOF;

public class Door implements SideElement {
  private final Room defaultRoom1;
  private final Room defaultRoom2;

  public Door(Room defaultRoom1, Room defaultRoom2) {
    this.defaultRoom1 = defaultRoom1;
    this.defaultRoom2 = defaultRoom2;
  }
}
