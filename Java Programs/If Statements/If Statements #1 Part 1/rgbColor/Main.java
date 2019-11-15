class Main {
  public static String rgbColor(String color){
    if(color.equalsIgnoreCase("Blue")){
      return "Blue is a primary color!";
    }
    else if(color.equalsIgnoreCase("Red")){
      return "Red is a primary color!";
    }
    else if(color.equalsIgnoreCase("Green")){
      return "Green is a primary color!";
    }
    else{
      return "NOT a primary color!";
    }

  }
  public static void main(String[] args) {
    System.out.println(rgbColor("blue"));
    System.out.println(rgbColor("Yellow"));
    System.out.println(rgbColor("Red"));
  }
}
