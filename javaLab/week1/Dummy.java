import java.util.*;
public class Dummy {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    boolean seats[]=new boolean[10];
    Arrays.fill(seats,false);
    while(true){
      System.out.println("Enter Your seat Preference 1 First class & 2 Economy class : ");
      int seatPreference,seatNumber=0;
      boolean isFirstFull=false,isEconomyFull=false;
      seatPreference=in.nextInt();
      if(seatPreference==1)
      {
        for(int i=0;i<5;i++)
        {
          if(!seats[i])
          {
            seats[i]=true;
            seatNumber=i+1;
            isFirstFull=false;
            break;
          }
          else{
            isFirstFull=true;
          }
        }
        if(!isFirstFull){
          System.out.println("Boarding Pass");
          System.out.println("Seat Number : "+seatNumber);
          System.out.println("First Class");
        }
        if(isFirstFull){
          System.out.println("First class Full,Are you ok with Economy class 1. yes 2.no");
          int response=in.nextInt();
          if(response==1)
          {
            for(int i=5;i<10;i++)
            {
              if(!seats[i])
              {
                seats[i]=true;
                isEconomyFull=false;
                seatNumber=i+1;
                break;
              }
              else{
                isEconomyFull=true;
              }
            }
            if(!isEconomyFull)
            {
              System.out.println("Boarding Pass");
              System.out.println("Seat Number : "+seatNumber);
              System.out.println("Economy class");
            }
            if(isEconomyFull)
            {
              System.out.println("All seats are Full");
            }
          }
          else{
            System.out.println("Next flight Leave in 3 hrs");
          }
        }
      }
      else if(seatPreference==2)
      {
        for(int i=5;i<10;i++)
        {
          if(!seats[i])
          {
            seats[i]=true;
            isEconomyFull=false;
            seatNumber=i+1;
            break;
          }
          else{
            isEconomyFull=true;
          }
        }
        if(!isEconomyFull)
        {
          System.out.println("Boarding Pass");
          System.out.println("Seat number : "+seatNumber);
          System.out.println("Economy class");
        }
        if(isEconomyFull)
        {
          System.out.println("Economy class is Full,Are you ok with First clsas");
          System.out.println("1.Yes 2.No");
          int response=in.nextInt();
          if(response==1)
          {
            for(int i=0;i<5;i++)
            {
              if(!seats[i])
              {
                seats[i]=true;
                isFirstFull=false;
                seatNumber=i+1;
                break;
              }
              else{
                isFirstFull=true;
              }
            }
            if(!isFirstFull){
              System.out.println("Boarding pass");
              System.out.println("Seat Number "+seatNumber);
              System.out.println("First Class");
            }
            if(isFirstFull)
            {
              System.out.println("All seats are Full");
            }
          }
          else{
            System.out.println("Next Flight Leave in 3 hrs");
          }
        }
      }
      else
      {
        System.out.println("Please enter valid seatPreference !!");
      }
      if(isEconomyFull && isFirstFull)
        break;
    }
  }
}
