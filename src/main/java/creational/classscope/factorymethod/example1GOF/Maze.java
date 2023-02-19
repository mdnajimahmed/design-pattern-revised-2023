package creational.classscope.factorymethod.example1GOF;

import java.util.ArrayList;
import java.util.List;

public class Maze {
  private List<Room> defaultRooms = new ArrayList<>();

  public void addRoom(Room defaultRoom) {
    defaultRooms.add(defaultRoom);
  }
}
