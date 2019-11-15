import java.util.Scanner;
class PosNeg{
    public PosNeg(){}
    Scanner input = new Scanner(System.in);
    int positive = 0, negative = 0, total = 0, count = 0, number;
    public void posneg(){
        System.out.print("Enter an integer, the input ends if it is 0: ");
        while((number = input.nextInt()) != 0) {
            total += number;
            count++;
            if(number > 0){
                positive++;
            } else if(number < 0) {
                negative++;
            }
        }
        double average = total / (double) count;
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
    }
}