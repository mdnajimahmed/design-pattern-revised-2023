package creational.classscope.factorymethod.example1GOF;

public class BombedMazeGame extends MazeGame {
  private final int bombPerRoom;

  public BombedMazeGame(int bombPerRoom) {
    this.bombPerRoom = bombPerRoom;
  }

  protected SideElement createWall() {
    return new BombedWall();
  }

  protected Room createRoom() {
    return new RoomWithBomb(bombPerRoom);
  }
}
