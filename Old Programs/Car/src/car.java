public class car {
	private String make, color;
	private int year, doorCount, mileage;
	public car(String make, int year, int doorCount, int mileage, String color) {
		this.make = make;
		this.year = year;
		this.doorCount = doorCount;
		this.mileage = mileage;
		this.color = color;
	}
	public String toString() {
		return "Make: " + make +"\nYear: " + year +"\nNumber of Doors: " + doorCount + "\nMileage: " + mileage + "\nColor: " + color + "\n" + "---------------------------------------";
	} 
	public void setMake(String make) {
		this.make = make;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setDoorCount(int doorCount) {
		this.doorCount = doorCount;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
		car car1 = new car("Ford", 2012, 4, 23456, "Silver");
		System.out.println(car1.toString());
		car1.setMileage(23756);
		System.out.println(car1.toString());
		car car2 = new car("Toyota", 2016, 4, 23756, "Blue");
		System.out.println(car2.toString());
		car2.setColor("Green");
		System.out.println(car2.toString());
	}

}
