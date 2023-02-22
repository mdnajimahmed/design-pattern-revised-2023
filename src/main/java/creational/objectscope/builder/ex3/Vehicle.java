package creational.objectscope.builder.ex3;

import java.util.LinkedList;

public class Vehicle {
  /*
   * You can use any data structure that you prefer.
   * I have used LinkedList<String> in this case.
   */
  private LinkedList<String> parts;

  public Vehicle() {
    parts = new LinkedList<>();
  }

  public void add(String part) {
    // Adding parts
    parts.addLast(part);
  }

  public void showProduct() {
    System.out.println("These are the construction sequences:");
    for (String part : parts) {
      System.out.println(part);
    }
  }
}
