import java.util.Scanner;
public class bookPrices
{

	public static void main(String[] args) {
		Scanner bscan = new Scanner(System.in);
		Scanner pscan = new Scanner(System.in);
		Scanner mscan = new Scanner(System.in);
		System.out.print("Enter the number of books: ");
		int book = bscan.nextInt();
		System.out.print("Enter the price of each book : ");
		double price = pscan.nextDouble();
		double total = book * price;
		System.out.println("The total is: "+ total);
		System.out.print("How much money was given: ");
		double money = mscan.nextDouble();
		double change = money - total;
		System.out.println("The change is: " + change);

	}

}
