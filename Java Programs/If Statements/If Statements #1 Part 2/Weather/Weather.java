class Weather{ 
  public Weather(){}
  public void Temperature(int temp) {
    if (temp > 80) {
      System.out.println("Hot");
    } else if (temp > 70) {
      System.out.println("Warm");
    } else if (temp > 60) {
      System.out.println("Mild");
    } else if (temp > 50) {
      System.out.println("Chilly");
    }
  }
}

