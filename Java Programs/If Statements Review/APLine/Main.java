class Main{
    public static void main(String[] args){
        APLine line1 = new APLine(5, 4, -17);
        double slope1 = line1.getSlope();
        boolean onLine1 = line1.isOnLine(5, -2);
        System.out.println(slope1);
        System.out.println(onLine1);
    }
}