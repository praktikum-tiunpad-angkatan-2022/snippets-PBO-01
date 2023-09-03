public class Test {
  public static void main(String args[]) {
    Ship ferry = new Ship();

    System.out.println("Initially, this ship has " + ferry.getCrew() + " crew.");

    if (ferry.getCrew() < 30) {
      ferry.setCrew(30);
    }

    System.out.println("But then, now this ship has " + ferry.getCrew() + " crew.");
  }
}