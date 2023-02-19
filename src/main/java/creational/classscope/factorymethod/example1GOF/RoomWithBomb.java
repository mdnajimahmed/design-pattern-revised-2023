package creational.classscope.factorymethod.example1GOF;

public class RoomWithBomb implements Room{
  private final int numberOfBomb;

  public RoomWithBomb(int numberOfBomb) {
    this.numberOfBomb = numberOfBomb;
  }

  @Override
  public void addSide(Sides side, SideElement wall) {

  }
}
