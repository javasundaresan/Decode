package week7;
import java.util.*;
public abstract class LendingLibrary implements Invoice {
  protected String title;
  protected Time acquisitionTime;
  protected double rentalFee;
  protected Time dueTime;
  protected boolean checkOut;

  public LendingLibrary(String title, double rentalFee) {
      this.title = title;
      this.rentalFee = rentalFee;
      this.acquisitionTime = new Time(0, 0, 0); // Default acquisition time
      this.dueTime = null;
      this.checkOut = false;
  }

  public void issue(Time time) {
      this.acquisitionTime = time;
      this.checkOut = true;
  }

  public void returnItem(Time time) {
      this.checkOut = false;
      long overduePeriod = this.dueTime.difference(time);
      if (overduePeriod > 0) {
          double fineAmount = calculateFine(overduePeriod);
          this.rentalFee += fineAmount;
      }
  }

  public abstract void calculateDueTime();

  public double calculateFine(long overduePeriod) {
      double fineAmount = 0.0;
      long extraMinutes = overduePeriod / 30000; // Assuming Time class uses milliseconds
      fineAmount = extraMinutes * Invoice.fine;
      return fineAmount;
  }

  @Override
  public String toString() {
      return "Title: " + title + "\nAcquisition Time: " + acquisitionTime + "\nRental Fee: " + rentalFee + "\nDue Time: " + dueTime + "\nChecked Out: " + checkOut;
  }
}