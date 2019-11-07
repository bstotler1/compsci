public class Main {
  // instance variables or fields
  private static String name;
  private int numID;
  private static int numPatients; 
  // static instance variable  // constructor
  public Main(String name, int numID) {
    this.name = name;
    this.numID = numID;
  }          // mutator/set methods
  public void setName(String name) {
    this.name = name;
  }
  public void setNumID(int numID) {
    this.numID = numID;
  }
  public static void setNumPatients(int p) {
    
    
    name = "John";
    numPatients = p;
  } 
       // getter/accessor methods
       public String getName() {
         return name;
      }
public int getNumID() {
  return numID;
  }
  
  public int getNumPatients() {
    return numPatients;
    }
    public String toString() {
      return "Name: " + name + " " + "ID: " + numID + " " + "Total Patients: " + numPatients;
      }
      public static void main(String[] args) {
        Main m1 = new Main("M1:", 1);
        Main m2 = new Main("M2:", 2);
        Main m3 = new Main("M3:", 3);

        //m1.setNumPatients(150);
        Main.setNumPatients(150);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
  }
}