class numUnique{
    public numUnique(){}
    public static int numUnique(int a, int b, int c){
        if(a==c && a==b && b==c){
            return 0;
        } else if(a==b && a==c && b!=c){
            return 1;
        } else if(a!=b && a==c && b==c){
            return 1;
        } else if(a==b && a!=c && b==c){
            return 1;
        } else if(a==b && a!=c && b!=c){
            return 2;
        } else if(a!=b && a!=c && b==c){
            return 2;
        } else if(a!=b && a==c && b!=c){
            return 2;
        } else{
            return 3;
        }
    }
}