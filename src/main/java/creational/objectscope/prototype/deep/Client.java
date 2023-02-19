package creational.objectscope.prototype.deep;

import creational.objectscope.prototype.shallow.Gangster;

public class Client {
  public static void main(String[] args) throws CloneNotSupportedException {
    Gangster najim = new Gangster("Najim");
    Gangster ehan = new Gangster("Najim");
    Gang najimsGang = new Gang("The deadly gang", najim);
    Gang ehansGang = (Gang) najimsGang.clone();
    if (najimsGang.getGangLeader() == ehansGang.getGangLeader()) {
      throw new RuntimeException("Expected deep copy");
    }
    System.out.println("Deep copy successful");
  }
}
