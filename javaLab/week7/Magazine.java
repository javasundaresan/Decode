package week7;
class Magazine extends LendingLibrary {
  private int volumeNo;
  private int issueNo;

  public Magazine(String title, double rentalFee, int volumeNo, int issueNo) {
      super(title, rentalFee);
      this.volumeNo = volumeNo;
      this.issueNo = issueNo;
  }

  @Override
  public void calculateDueTime() {
      this.dueTime = new Time(this.acquisitionTime.hours + 2, this.acquisitionTime.min, this.acquisitionTime.sec);
  }

  @Override
  public String toString() {
      return super.toString() + "\nVolume No: " + volumeNo + "\nIssue No: " + issueNo;
  }
}

interface Invoice {
  double fine = 5.0;
  double calculateFine(long overduePeriod);
}
