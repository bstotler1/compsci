public class Quadratic {
    double root1, root2, a, b, c;
    public Quadratic(double a, double b, double c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }
    
    public void getRoots(double a, double b, double c){
       double determinant = b * b - 4 * a * c;
        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("Roots are: " + root1 + " and " + root2);
        }
        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.println("Roots are: " + root1);
        }
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.println("Roots are: " + realPart + "+" + imaginaryPart + "i and " + realPart + "-" + imaginaryPart + "i");
        }
    }
    public static void main(String[] args) {
        Quadratic quad = new Quadratic(0,0,0);
        quad.getRoots(1,-6,5);
        quad.getRoots(1,-2,1);
        quad.getRoots(1,1,1);
      }
}