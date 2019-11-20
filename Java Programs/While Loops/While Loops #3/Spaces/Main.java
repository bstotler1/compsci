class Main{
    public static void main(String[] args){
        Spaces s1 = new Spaces();
        System.out.println(s1.spaceCounter("Hi my name is Mrs. Tan")); // returns 5
        System.out.println(s1.spaceCounter("Hi!")); // returns  0
        System.out.println(s1.spaceCounter("Sing us a song you're the piano man."));
    }
}