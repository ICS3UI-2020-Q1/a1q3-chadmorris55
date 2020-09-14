import java.util.Scanner;

/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a Scanner for user input
    Scanner input = new Scanner(System.in);
    
    //asks user for how many chargers 
    System.out.println ("How many chromebook chargers?");
    double numCharger = input.nextInt();

    //asks user for how many motherboards
    System.out.println ("How many motherboards?");
    double numMotherboard = input.nextInt();

    //asks user how many mice
    System.out.println ("How many mice?");
    double numMice = input.nextInt();
    
    // prices of each
    double PRICE_CHARGER = 34.99;
    double PRICE_MOTHERBOARD = 127.50;
    double PRICE_MICE = 18.00;

    //totals of all
    double totalCharger = numCharger * PRICE_CHARGER;
    double totalMotherboard = numMotherboard * PRICE_MOTHERBOARD;
    double totalMice = numMice * PRICE_MICE;

    //subtotal calulation then tell user what the subtotal is
   double subtotal = totalCharger + totalMice + totalMotherboard;
   System.out.println("Subtotal = " + subtotal);

   // finds tax
   double tax = subtotal * 0.13;
   System.out.println("Taxes = " + tax);
   
   // finds absolute total
   double total = subtotal * 1.13;
   System.out.println("Total = " + total);

  }
}
