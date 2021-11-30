import section4.SpeedConverter;

public class Main {
  public static void main(String[] args) {
    double miles = SpeedConverter.toMilesPerHour(-1);
    System.out.println("Miles = " + miles);

    SpeedConverter.printConversion(-2);
  }
}
