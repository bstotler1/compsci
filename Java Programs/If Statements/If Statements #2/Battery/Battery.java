class Battery{
  public Battery(){}
  public boolean fuelBattery(int fuel, int battery){
    System.out.println("Gallons of gas in the car: " + fuel);
    System.out.println("Battery Level in the car: " + battery);
    if(fuel >= 3 && battery >= 5){
      System.out.println("You can drive the car!");
      return true;
    } else{
      System.out.println("You cannot drive the car!");
      return false;
    }
  }
}
