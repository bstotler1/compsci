class Main {
  public static String evenOdd(int number){
    int remainder = number%2;
    if(remainder==0){
      return "The number is EVEN!";
    }
    else{
      return "The number is ODD!";
    }
  }

  public static void main(String[] args) {
    System.out.println(evenOdd(5));
    System.out.println(evenOdd(10));
  }
}
