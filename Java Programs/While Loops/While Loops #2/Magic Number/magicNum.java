import java.util.Scanner;
class magicNum{
    Scanner input = new Scanner(System.in);
    int correctNum = 39;
    int guess;
    public magicNum(){}
    public void guessNum(){
        System.out.println("Guess a magic number between 0 and 100");
        System.out.print("Enter your guess: ");
        guess = input.nextInt();
        while(guess != correctNum){
            if (guess > correctNum){
                System.out.println("You guess is too high!");
            } else{
                System.out.println("Your guess is too low!");
            }
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
        }
        System.out.println("Yes, the number is " + correctNum);
    }
    
    
}