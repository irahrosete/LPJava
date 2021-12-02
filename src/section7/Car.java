package section7;

public class Car {
  private boolean engine;
  private int cylinders;
  private String name;
  private int wheels;

  public Car(int cylinders, String name) {
    this.cylinders = cylinders;
    this.name = name;
    this.engine = true;
    this.wheels = 4;
  }

  public String startEngine() {
    return getClass().getSimpleName() + " -> startEngine()";
  }

  public String accelerate() {
    return getClass().getSimpleName() + " -> accelerate";
  }

  public String brake() {
    return getClass().getSimpleName() + " -> brake";
  }

  public int getCylinders() {
    return cylinders;
  }

  public String getName() {
    return name;
  }
}

class Mitsubishi extends Car {
  public Mitsubishi(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public String startEngine() {
    return getClass().getSimpleName() + " -> startEngine()";
  }

  @Override
  public String accelerate() {
    return getClass().getSimpleName() + " -> accelerate";
  }

  @Override
  public String brake() {
    return getClass().getSimpleName() + " -> brake";
  }
}