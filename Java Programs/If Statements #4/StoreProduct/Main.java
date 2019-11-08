import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    StoreProduct s1 = new StoreProduct("Ruffles", "snacks", 5, 5, true);
    StoreProduct s2 = new StoreProduct("Pasta Roni", 6, 100);
    System.out.println("The following from the store is " + s1);
    s1.expired(false);
    s1.expired(true);
    System.out.println("You have " + s2.sale(88) + " boxes left");
    System.out.println("You have " + s2.sale(210) + " boxes left");
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the discount % off the Pasta Roni: ");
    double discount = scan.nextDouble();
    System.out.println("The new price of the Pasta Roni box is $" + s2.getDiscountedPrice(discount));
  }
}