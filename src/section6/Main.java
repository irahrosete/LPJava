package section6;

public class Main {
  public static void main(String[] args) {
    SimpleCalculator simpleCalculator = new SimpleCalculator();
    simpleCalculator.setFirstNumber(3.0);
    simpleCalculator.setSecondNumber(5);

    System.out.println("add: " + simpleCalculator.getAdditionResult());
    System.out.println("subtract: " + simpleCalculator.getSubtractionResult());

    simpleCalculator.setSecondNumber(0);
    System.out.println("multiply: " + simpleCalculator.getMultiplicationResult());
    System.out.println("divide: " + simpleCalculator.getSecondNumber());

    Person person = new Person();
    person.setFirstName("");
    person.setLastName("");
    person.setAge(10);
    System.out.println("full name: " + person.getFullName());
    System.out.println("teen: " + person.isTeen());

    person.setAge(18);
    person.setFirstName("John");
    System.out.println("full name: " + person.getFullName());
    System.out.println("teen: " + person.isTeen());

    person.setLastName("Smith");
    System.out.println("full name: " + person.getFullName());

    Circle circle = new Circle(3.75);
    System.out.println("circle radius: " + circle.getRadius());
    System.out.println("circle area: " + circle.getArea());

    Cylinder cylinder = new Cylinder(circle.getRadius(), 7.25);
    System.out.println("cylinder area: " + cylinder.getArea());
    System.out.println("cylinder volume: " + cylinder.getVolume());

  }
}
