class Phone{
  public Phone(){}
  public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep){
    if(isMorning==false && isAsleep==false){
      return true;
    }else if(isMorning==true && isMom==true && isAsleep==false){
      return true;
    }else if((isMorning==true && isMom==true) || isAsleep==true){
      return false;
    }else if(isMorning==true && isMom==false && isAsleep==false){
      return false;
    }else{
      System.out.println("ERROR");
      return false;
    }

  }
}
