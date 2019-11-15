class Cube{
    private static int yTemp, sum;
    public Cube(){}
    public static int addCubes(int x, int y){
        sum = 0;
        yTemp = y;
        while(yTemp >= x){
            sum += (yTemp*yTemp*yTemp);
            yTemp--;
        }
        return sum;
    }
}