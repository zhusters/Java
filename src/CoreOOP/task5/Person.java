package CoreOOP.task5;

public abstract class Person implements Employee{
  private int age;
  private String name;

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }
}
