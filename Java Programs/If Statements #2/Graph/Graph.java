class Graph{
  public Graph(){}
  public static int theQuadrant(int x, int y){
    if(x == 0 || y == 0){
      return 0;
    }else if(x > 0 && y > 0){
      return 1;
    }else if(x < 0 && y > 0){
      return 2;
    }else if(x < 0 && y < 0){
      return 3;
    }else if(x > 0 && y < 0){
      return 4;
    }else{
      return 8;
    }
  }
}
