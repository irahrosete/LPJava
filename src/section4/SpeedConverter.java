package section4;

public class SpeedConverter {
  public static void main(String[] args) {
    double miles = toMilesPerHour(-1);
    System.out.println("Miles = " + miles);

    printConversion(-2);
  }

  public static long toMilesPerHour(double kilometersPerHour) {
    if (kilometersPerHour < 0) {
      return -1;
    }
    return Math.round(kilometersPerHour / 1.609);
  }

  public static void printConversion(double kilometersPerHour) {
    if (kilometersPerHour < 0) {
      System.out.println("Invalid Value");
    } else {
      long milesPerHour = toMilesPerHour(kilometersPerHour);
      System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
  }
}
