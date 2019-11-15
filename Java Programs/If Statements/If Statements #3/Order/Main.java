class Main {
  public static void main(String[] args) {
    Order o = new Order();
    System.out.println(o.inOrder(3,2,4,false));
    System.out.println(o.inOrder(2,3,4,false));
    System.out.println(o.inOrder(3,2,4,true));
    System.out.println(o.inOrder(4,2,2,true));
    System.out.println(o.inOrder(4,5,2,true));
  }
}