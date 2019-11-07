import java.util.Scanner;
public class cubeMath {

	public static void main(String[] args) {
		Scanner sl = new Scanner(System.in);
		System.out.print("Please enter the length of a side of the cube: ");
		double s = sl.nextInt();
		double sa = (double)(6*(s*s));
		double v = (double)(s*s*s);
		System.out.println("The surface area of your cube is " + sa);
		System.out.println("The volume of your cube is " + v);
		


	}

}
