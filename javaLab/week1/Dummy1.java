import java.util.*;
public class Dummy1 {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter how many Sales Person : ");
    int n=in.nextInt();
    System.out.print("Enter how many Product : ");
    int m=in.nextInt();
    int[][] sales=new int[n][m];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        System.out.print("Enter Sales for Salesperson "+(i+1)+" & Product "+(j+1)+" : ");
        sales[i][j]=in.nextInt();
      }
    }
    //Display headers
    System.out.printf("%-15s","Salesperson");
    for(int i=0;i<m;i++)
    {
      System.out.printf("%-15s","Product "+(i+1));
    }
    System.out.printf("%-15s%n","Total");
    int[] productTotal=new int[m];
    for(int i=0;i<n;i++)
    {
      int salespersonTotal=0;
      System.out.printf("%-15s","Person "+(i+1));
      for(int j=0;j<m;j++)
      {
        System.out.printf("%-15d",sales[i][j]);
        salespersonTotal+=sales[i][j];
        productTotal[j]+=sales[i][j];
      }
      System.out.printf("%-15d%n",salespersonTotal);
    }
    System.out.printf("%-15s","Total");
    int ans=0;
    for(int total:productTotal)
    {
      System.out.printf("%-15d",total);
      ans+=total;
    }
    System.out.printf("%-15d",ans);
  }
}
