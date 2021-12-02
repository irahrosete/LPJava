package section7;

public class BillsBurgers {
  public static void main(String[] args) {
    BaseHamburger burger = new BaseHamburger("Bill's Burger", "sourdough", "chicken");
    System.out.println(burger.getBreadType());
    System.out.println(burger.getPrice());
    System.out.println(burger.addIngredient("lettuce"));
    System.out.println(burger.addIngredient("cheese"));
    System.out.println(burger.addIngredient("tomato"));
    System.out.println(burger.addIngredient("mayo"));
    System.out.println(burger.getPrice());

    HealthyBurger healthyBurger = new HealthyBurger("beef");
    System.out.println(healthyBurger.getName());
    System.out.println(healthyBurger.addIngredient("lettuce"));
    System.out.println(healthyBurger.getPrice());

    DeluxeBurger deluxeBurger = new DeluxeBurger("traditional", "pork");
    System.out.println("deluxe price " + deluxeBurger.getPrice());
    System.out.println(deluxeBurger.getName());
  }
}

class BaseHamburger {
  private String name;
  private String breadType;
  private String meat;
  private double price;

  public BaseHamburger(String name, String breadType, String meat) {
    this.name = name;
    this.breadType = breadType;
    this.meat = meat;
    this.price = 10;
  }

  public String getName() {
    return name;
  }

  public String getBreadType() {
    return breadType;
  }

  public String getMeat() {
    return meat;
  }

  public double getPrice() {
    return price;
  }

  public String addIngredient(String ingredient) {
    price += 2;
    return ingredient + " added.";
  }
}

class HealthyBurger extends BaseHamburger {
  public HealthyBurger(String meat) {
    super("Healthy Burger", "rye", meat);
  }

  @Override
  public String getName() {
    return "Healthy Burger";
  }
}

class DeluxeBurger extends BaseHamburger {
  public DeluxeBurger(String breadType, String meat) {
    super("Deluxe Burger", breadType, meat);
    super.addIngredient("chips");
    super.addIngredient("drinks");
  }

    @Override
  public String getName() {
    return "Deluxe Burger";
  }
}