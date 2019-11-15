class StoreProduct{
  String label, category;
  int price, stock, origStock;
  boolean hasExpiration;
  public StoreProduct(String label, String category, int price, int stock, boolean hasExpiration){
    this.label = label;
    this.category = category;
    this.price = price;
    this.stock = stock;
    this.hasExpiration = hasExpiration;
    this.origStock = stock;
  }
  public StoreProduct(String label, int price, int stock){
    this.label = label;
    this.price = price;
    this.stock = stock;
    this.origStock = stock;

  }
  public void expired(boolean hasExpired){
    if(hasExpiration == true && hasExpired==true){
      stock = 0;
      System.out.println("This item's stock is: " + stock);
    }else{
      System.out.println("This item's stock is: " + stock);
    }
  }
  public int sale(int quantity){
    if(quantity<=stock){
      stock-=quantity;
      System.out.println("You can buy: " + label);
      return stock;
    }else{
      System.out.println("You cannot buy: " + label);
      return origStock;
    }
  }
  public double getDiscountedPrice(double discount){
    price*=(1-discount);
    return price;
  }
  public String toString(){
    return "\nLabel: " + label +
    "\nCategory: " + category +
    "\nPrice: " + price +
    "\nStock: " + stock +
    "\nhasExpiration: " + hasExpiration;
  }
}