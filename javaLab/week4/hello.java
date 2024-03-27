package week4;

public class hello{
  static int fbonus=2000;
  public static void main(String args[]){
          SalesPerson p1=new SalesPerson(23,"Varsha",4000);
          p1.doj.day=10;
          p1.doj.month=3;
          p1.doj.year=2023;
          int i;
          for (i=0;i<50;i++){
                  p1.addSale(i);
          }
          double bs=p1.getSalary();
          bs=bs*12;
          p1.display();
          int ye=(p1.doj).getYears(p1.doj);
          double b=p1.getBonus();
          bs+=b;
          bs+=fbonus;
          System.out.println("Bonus for "+p1.name+" is: "+b);
          System.out.println("Years of experience for "+p1.name+" is: "+ye);
          System.out.println("Total Salary of "+p1.name+ " is: "+bs);
          System.out.println(p1.doj.toString());
  }
}