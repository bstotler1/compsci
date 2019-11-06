class Movie{
  public Movie(){}
  public static void seeMovie(double price, int rating){
    if(price<5.0){
      System.out.println("Very Interested");
    }else if(price>=12.0 && rating<5){
      System.out.println("Not Interested");
    }else if(price>=12.0 && rating==5){
      System.out.println("Sort-Of-Interested");
    }else if(price<12.0 && rating==5){
      System.out.println("Very Interested");
    }else if(price>=5.0 && price<=11.99 && rating>=2 && rating<=4){
      System.out.println("Sort-Of-Interested");
    }else{
      System.out.println("Not Interested");
    }

  }
}