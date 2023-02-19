package creational.objectscope.prototype.deep;

import creational.objectscope.prototype.shallow.Gangster;

public class Gang implements Cloneable {
  private String name;
  private Gangster gangLeader;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Gangster getGangLeader() {
    return gangLeader;
  }

  public void setGangLeader(Gangster gangLeader) {
    this.gangLeader = gangLeader;
  }

  @Override
  public String toString() {
    return "Gang{" +
        "name='" + name + '\'' +
        ", gangLeader=" + gangLeader +
        '}';
  }

  public Gang(String name, Gangster gangLeader) {
    this.name = name;
    this.gangLeader = gangLeader;
  }

  // shallow copy, class has non-primitive as field.

//  @Override
//  protected Object clone() throws CloneNotSupportedException {
//    return super.clone()
//  }

// deep copy
  @Override
  protected Object clone() throws CloneNotSupportedException {
    return new Gang(name, (Gangster) gangLeader.clone());
  }
}
