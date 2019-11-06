class PositiveNegative{
  public PositiveNegative(){}
  public void posNegative(int num){
    System.out.println("You Entered: " + num );
    if (num == 0){
      System.out.println("0 is neither a positive or negative number!");
    } else if (num>0){
      System.out.println(num + " is a positive number!");
    } else {
      System.out.println(num + " is a negative number!");
    }
  }

}
