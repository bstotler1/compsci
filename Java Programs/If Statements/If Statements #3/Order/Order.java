class Order{
  public Order(){}
  public static boolean inOrder(int a, int b, int c, boolean ORDER){
    if(b>a && c>b && ORDER==false){
      return true;
    } else if(ORDER==true && c>b){
      return true;
    } else{
      return false;
    }
  }
}