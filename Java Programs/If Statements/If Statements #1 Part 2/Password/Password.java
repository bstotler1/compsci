class Password{
  public Password(){}
  public void Pass(String pass){
    System.out.println("You Entered: " + pass);
    if(pass.equals("Password")){
      System.out.println("You have access!");
    } else {
      System.out.println("You don't have access!");
    }
  }
}
