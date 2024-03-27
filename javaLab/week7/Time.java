package week7;

public class Time {
  int hours;
  int min;
  int sec;

  public Time(int hours, int min, int sec) {
      this.hours = hours;
      this.min = min;
      this.sec = sec;
  }

  public void setHours(int hours) {
      this.hours = hours;
  }

  public int getHours() {
      return hours;
  }

  public void setMin(int min) {
      this.min = min;
  }

  public int getMin() {
      return min;
  }

  public void setSec(int sec) {
      this.sec = sec;
  }

  public int getSec() {
      return sec;
  }

  public long difference(Time other) {
      long thisMillis = (hours * 3600000L) + (min * 60000L) + (sec * 1000L);
      long otherMillis = (other.hours * 3600000L) + (other.min * 60000L) + (other.sec * 1000L);
      return Math.abs(thisMillis - otherMillis);
  }

  @Override
  public String toString() {
      return String.format("%02d:%02d:%02d", hours, min, sec);
  }
}
