package week6;
public class Course {
  private String courseName;
  private String instructorName;
  private int credits;
  private int contactHours;
  private String type;
  private String grade;

  public Course(String courseName, String instructorName, int credits, int contactHours, String type, String grade) {
      this.courseName = courseName;
      this.instructorName = instructorName;
      this.credits = credits;
      this.contactHours = contactHours;
      this.type = type;
      this.grade = grade;
  }

  public String getCourseName() {
      return courseName;
  }

  public void setCourseName(String courseName) {
      this.courseName = courseName;
  }

  public String getInstructorName() {
      return instructorName;
  }

  public void setInstructorName(String instructorName) {
      this.instructorName = instructorName;
  }

  public int getCredits() {
      return credits;
  }

  public void setCredits(int credits) {
      this.credits = credits;
  }

  public int getContactHours() {
      return contactHours;
  }

  public void setContactHours(int contactHours) {
      this.contactHours = contactHours;
  }

  public String getType() {
      return type;
  }

  public void setType(String type) {
      this.type = type;
  }

  public String getGrade() {
      return grade;
  }

  public void setGrade(String grade) {
      this.grade = grade;
  }

  @Override
  public String toString() {
      return "Course{" +
              "courseName='" + courseName + '\'' +
              ", instructorName='" + instructorName + '\'' +
              ", credits=" + credits +
              ", contactHours=" + contactHours +
              ", type='" + type + '\'' +
              ", grade='" + grade + '\'' +
              '}';
  }
}
