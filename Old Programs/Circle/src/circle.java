public class circle {
	private double radius;
	public circle(double radius) {
		this.radius=radius;
	}
	public double area() {
		return (Math.PI*(this.radius*this.radius));
	}
	public double cir() {
		return (Math.PI*2.0)*(this.radius);
	}
	public String toString() {
		return "\nRadius is: " + radius + "\nThe Area is: " + area() + "\nThe Circumference is: " + cir() + "\n-------------------------------------------------";
	}

	public static void main(String[] args) {
		circle c1 = new circle(5.0);
		System.out.println(c1.toString());
		circle c2 = new circle(7.2);
		System.out.println(c2.toString());
	}

}
