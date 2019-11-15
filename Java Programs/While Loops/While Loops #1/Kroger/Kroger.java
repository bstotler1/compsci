import java.util.Scanner;
class Kroger{
    int stock, amount;
    public Kroger(){};
    Scanner input = new Scanner(System.in);
    public void buy(){
        System.out.print("Enter the amount of stock of your item at Kroger: ");
        stock = input.nextInt();
        while(stock!=0){
            System.out.print("Enter the amount you want to buy of your item at Kroger: ");
            amount = input.nextInt();
            if(amount>stock){
                System.out.println("ERROR! The Amount you entered is greater than the items quantity!");
            }else{
            stock -= amount;
            System.out.println("You now have " + stock + " at Kroger");
            }
        }
        System.out.println("You have ran out of your item at Kroger!");
    }
}