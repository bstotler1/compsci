class Main{
    public static void main(String[] args){
        egg a = new egg();
        System.out.println("I have " + a.howManyDozen(24) + " dozen");
        System.out.println("I have " + a.howManyDozen(28) + " dozen");
        System.out.println("I have " + a.howManyDozen(11) + " dozen");
        System.out.println(a.isReady(0));
        System.out.println(a.isReady(11));
        System.out.println(a.isReady(12));
        System.out.println(a.isReady(24));
        System.out.println(a.isReady(28));
    }
}