package week7;

public class TestApplication {
  public static void main(String[] args) {
      DVD dvd = new DVD("LEO", 5.0, 120);
      dvd.issue(new Time(10, 0, 0));
      dvd.calculateDueTime();
      System.out.println(dvd);

      Magazine magazine = new Magazine("fORBES", 3.0, 12, 5);
      magazine.issue(new Time(12, 0, 0));
      magazine.calculateDueTime();
      System.out.println(magazine);

      // Simulate returning the DVD late
      Time lateReturnTime = new Time(13, 31, 0);
      dvd.returnItem(lateReturnTime);
      System.out.println("\nDVD after late return:");
      System.out.println(dvd);

      // Simulate returning the magazine on time
      magazine.returnItem(new Time(14, 0, 0));
      System.out.println("\nMagazine after on-time return:");
      System.out.println(magazine);
  }
}
