
public class student {
		 private String name;
		 private int gradeLevel;
		 private double gpa;
		 public student(String name, int gradeLevel, double gpa){
		   this.name=name;
		   this.gradeLevel=gradeLevel;
		   this.gpa=gpa;
		 }
		 public String toString() {
			 return "Name: " + this.name + ", Grade Level: " + this.gradeLevel + ", GPA: " + this.gpa;
		 }
		 public String getName(){
		   return name;
		 }
		 public int getGradeLevel() {
			 return gradeLevel;
		 }
		 public double getGPA() {
			 return gpa;
		 }
		 public void setName(String name) {
			 this.name = name;			
		 }
		 public void setGradeLevel(int gradeLevel) {
			 this.gradeLevel = gradeLevel;
		 }
		 public void setGPA(double gpa) {
			 this.gpa = gpa;
		 }
		 public static void main(String[] args) {
			student student1 = new student("Benjamin Java", 5, 2.7);
			System.out.println(student1.toString());
			student1.setGPA(4.0); 
			System.out.println(student1.toString());
		 }
}
