package creational.objectscope.prototype.shallow;

public class Client {
  public static void main(String[] args) throws CloneNotSupportedException {
    Gangster najim = new Gangster("Najim");
    Gangster ehan = (Gangster) najim.clone();
    System.out.println(najim);
    ehan.setName("ehan");
    System.out.println(ehan);
  }
}
