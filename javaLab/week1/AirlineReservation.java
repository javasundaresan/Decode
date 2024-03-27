import java.util.*;

public class AirlineReservation {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    boolean seats[] = new boolean[10];
    Arrays.fill(seats, false);
    while(true) {
      System.out.println("Enter your Seat Preference : \n1 -- First Class\n2 -- Economy");
      int seatPreference,seatNumber = 0;
      boolean isFirstFull = false;
      boolean isEconomyFull = false;
      seatPreference = in.nextInt();
      if ( seatPreference == 1 ) {
        for ( int i = 0 ; i < 5 ; i++ ) {
          if ( !seats[i] ) {
          seats[i] = true;
          seatNumber = i+1;
          isFirstFull = false;
          break;
          }
          else {
          isFirstFull = true;
          }
        }
        if ( !isFirstFull ) {
          System.out.println("Boarding Pass : \n"+"Seat Number : "+(seatNumber)+"\n"+"Class : First Class");
        }
        if ( isFirstFull ) {
          System.out.println("First Class is Full! Are you okay with the Economy?\n1 -- Yes\n2 -- No");
          int response = in.nextInt();
          if ( response == 1 ) {
            for ( int i = 5 ; i < 10 ; i++ ) {
              if ( !seats[i] ) {
                seats[i] = true;
                seatNumber = i+1;
                isEconomyFull = false;
                break;
              }
              else {
                isEconomyFull = true;
              }
            }
            if ( !isEconomyFull ) {
              System.out.println("Boarding Pass : \n"+"Seat Number : "+(seatNumber)+"\n"+"Class : Economy");
            }
            if ( isEconomyFull ) {
              System.out.println("All seats are Full!");
            }
          }
          else {
            System.out.println("Next Flight leaves in 3 hours!");
          }
        }
      }
      else if ( seatPreference == 2 ) {
        for ( int i = 5 ; i < 10 ; i++ ) {
          if ( !seats[i] ) {
            seats[i] = true;
            seatNumber = i+1;
            isEconomyFull = false;
            break;
          }
          else {
            isEconomyFull = true;
          }
        }
        if ( !isEconomyFull ) {
          System.out.println("Boarding Pass : \n"+"Seat Number : "+(seatNumber)+"\n"+"Class : Economy");
        }
        if ( isEconomyFull ) {
          System.out.println("Economy is Full! Are you okay with the First Class?\n1 -- Yes\n2 -- No");
          int response = in.nextInt();
          if ( response == 1 ) {
            for ( int i = 0 ; i < 5 ; i++ ) {
              if ( !seats[i] ) {
              seats[i] = true;
              seatNumber = i+1;
              isFirstFull = false;
              break;
              }
              else {
              isFirstFull = true;
              }
            }
            if ( !isFirstFull ) {
              System.out.println("Boarding Pass : \n"+"Seat Number : "+(seatNumber)+"\n"+"Class : First Class");
            }
            if ( isFirstFull ) {
              System.out.println("All seats are Full!");
            }
          }
          else {
            System.out.println("Next Flight leaves in 3 hours!");
          }
        }
      }
      else {
        System.out.println("Enter Valid Seat Preference!");
      }
      if ( isFirstFull && isEconomyFull ) {
        break;
      }
    }
  }
}