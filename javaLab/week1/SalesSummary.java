import java.util.Scanner;

public class SalesSummary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a 2D array to store sales information (4 salespersons x 5 products)
        int[][] sales = new int[4][5];

        // Input sales information for last month
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter sales for Salesperson " + (i + 1) + " and Product " + (j + 1) + ": ");
                sales[i][j] = scanner.nextInt();
            }
        }

        // Display table headers
        System.out.printf("%-15s", "Salesperson");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%-15s", "Product " + i);
        }
        System.out.printf("%-15s%n", "Total");

        // Display sales information and calculate cross-totals
        int[] productTotals = new int[5];
        for (int i = 0; i < 4; i++) {
            int salespersonTotal = 0;
            System.out.printf("%-15s", "Person " + (i + 1));

            for (int j = 0; j < 5; j++) {
                System.out.printf("%-15d", sales[i][j]);
                salespersonTotal += sales[i][j];
                productTotals[j] += sales[i][j];
            }

            // Display the salesperson total
            System.out.printf("%-15d%n", salespersonTotal);
        }

        // Display product totals
        System.out.printf("%-15s", "Total");
        for (int total : productTotals) {
            System.out.printf("%-15d", total);
        }

        scanner.close();
    }
}