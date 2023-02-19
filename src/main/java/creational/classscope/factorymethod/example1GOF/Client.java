package creational.classscope.factorymethod.example1GOF;

public class Client {
  public static void main(String[] args) {
    MazeGame mazeGame = new MazeGame();
    Maze maze = mazeGame.createMaze();

    MazeGame bombedMazeGame = new BombedMazeGame(2);
    Maze bombedMaze = bombedMazeGame.createMaze();
  }
}
