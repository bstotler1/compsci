class Divide{
    int output, count;
    public Divide(){}
    public int divideBy(int divisor, int dividend){
        count = 0;
        while (dividend%divisor==0){
            dividend = dividend / divisor;
            count++;
        }
        return count;
    }
    
}