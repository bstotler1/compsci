import java.util.Scanner;
class Sum{
    public Sum(){}
    Scanner input = new Scanner(System.in);
    public void sum(){
        System.out.print("Enter two numbers: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double correct = n1 + n2;
        System.out.print("What is " + n1 + " + " + n2 + "? ");
        double n3 = input.nextDouble();
        while(n3!=correct){
            System.out.print("Wrong Answer. Try Again. What is " + n1 + " + " + n2 + "? ");
            n3 = input.nextDouble();
        }
        System.out.println("You got it!");
    }
    
}