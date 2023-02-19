package creational.classscope.factorymethod.example1GOF;

public class MazeGame {
  public Maze createMaze() {
    Maze aMaze = new Maze();
    Room defaultRoom1 = createRoom();
    Room defaultRoom2 = createRoom();
    SideElement door = createDoor(defaultRoom1, defaultRoom2);
    defaultRoom1.addSide(Sides.EAST, createWall());
    defaultRoom1.addSide(Sides.WEST, createWall());
    defaultRoom1.addSide(Sides.NORTH, createWall());
    defaultRoom1.addSide(Sides.SOUTH, door);
    aMaze.addRoom(defaultRoom1);
    aMaze.addRoom(defaultRoom2);
    return aMaze;
  }

  protected SideElement createWall() {
    return new Wall();
  }

  protected SideElement createDoor(Room defaultRoom1, Room defaultRoom2) {
    return new Door(defaultRoom1, defaultRoom2);
  }

  protected Room createRoom() {
    return new DefaultRoom();
  }
}
