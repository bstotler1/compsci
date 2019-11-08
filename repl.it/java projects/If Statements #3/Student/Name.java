import java.util.Scanner;
class Name{
  Scanner inp = new Scanner(System.in);
  public Name(){}
  public void nameCheck(){
    System.out.print("In: ");
    String name = inp.next();
    if(name.equals("Chen")){
      System.out.println("teacher");
    }else{
      System.out.println("student");
    }
  }
}
