public class pythagorean {
	double leg1,leg2;
	public pythagorean(double leg1, double leg2) {
		this.leg1 = leg1;
		this.leg2 = leg2;
	}
	public double hypo() {
		return Math.sqrt(Math.pow(this.leg1, 2) + Math.pow(this.leg2, 2));
	}
	public String toString() {
		return "\nThe 2 legs are: " + leg1 + " and " + leg2 + "\nThe Hypotenuse is: " + hypo() + "\n-------------------------------";
	}
	public static void main(String[] args) {
		pythagorean p1 = new pythagorean(3.4, 6.8);
		System.out.println(p1.toString());
		pythagorean p2 = new pythagorean(7.0, 24.0);
		System.out.println(p2.toString());

	}

}
