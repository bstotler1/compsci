class egg{
    public egg(){}
    public static int howManyDozen(int eggs){
        return eggs/12;
    }
    public static boolean isReady(int eggs){
        if(eggs==0){
            return false;
        } else if(eggs%12==0){
            return true;
        } else{
            return false;
        }
    }
}