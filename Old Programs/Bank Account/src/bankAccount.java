
public class bankAccount {
	private String name;
	private double checking, savings;
	public bankAccount(String name, double checking, double savings) {
		this.name = name;
		this.checking = checking;
		this.savings = savings;
	}
	public String toString() {
		return "The persons banking information is: \nName: " + this.name + "\nChecking: " + this.checking + "\nSavings: " + this.savings + "\n-------------------------------";
	}
	public String toUString() {
		return "The persons updated banking information is: \nName: " + name + "\nChecking: " + checking + "\nSavings: " + savings + "\n-------------------------------";
	}
	public void cWithdraw(double withdraw){
		this.checking -= withdraw;
		System.out.println(toUString());
	}
	public void withdraw(double withdraw){
		this.checking -= withdraw;
		this.savings -= withdraw;
		System.out.println(toUString());
	}
	public void sWithdraw(double withdraw) {
		this.savings -= withdraw;
		System.out.println(toUString());
	}
	public static void main(String[] args) {
		bankAccount acc1 = new bankAccount("Brayden",900.0,700.0);
		System.out.println(acc1.toString());
		acc1.withdraw(500);
	}

}
