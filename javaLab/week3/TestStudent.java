public class TestStudent {

  public static void main(String[] args) {
          // TODO Auto-generated method stub
    Course c1=new Course("C Program" ,"ab1",7,6,8);
    Course c2=new Course("DSA" , "ab2",7,7,7);
    Course c3=new Course("CA","ab3",6,5,9);

    Student s1=new Student("Sai",49);

    System.out.println(s1.toString());
    s1.addCourse(c1);
    s1.addCourse(c2);
    System.out.println(s1.calculateCgpa() + " is cgpa");
    s1.dropCourse(c3);
    s1.addCourse(c3);
    System.out.println(s1.calculateCgpa() + " is cgpa");
    s1.dropCourse(c1);
    System.out.println(s1.calculateCgpa() + " is cgpa");
    s1.dropCourse(c2);
    System.out.println(s1.calculateCgpa() + " is cgpa");
  }

}