package creational.objectscope.prototype.shallow;

public class Gangster implements Cloneable {
  private String name;


  @Override
  public String toString() {
    return "Gangster{" +
        "name='" + name + '\'' +
        '}';
  }

  public Gangster(String name) {
    this.name = name;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public void setName(String name) {
    this.name = name;
  }
}
