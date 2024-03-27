package week7;
class DVD extends LendingLibrary {
  private int playLength;

  public DVD(String title, double rentalFee, int playLength) {
      super(title, rentalFee);
      this.playLength = playLength;
  }

  @Override
  public void calculateDueTime() {
      this.dueTime = new Time(this.acquisitionTime.hours + 3, this.acquisitionTime.min + 30, this.acquisitionTime.sec);
  }

  @Override
  public String toString() {
      return super.toString() + "\nPlay Length: " + playLength + " minutes";
  }
}
