package Week1_Programs;

public class Q5_Quadratic_eqn {
	public static void main(String[] args) {
		
	    int a=26,b=5,c=3;
	    double root1, root2;
	    double determinant = b * b - 4 * a * c;

	   
	    if (determinant > 0) {
	      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
	      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

	      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
	    }
	    else if (determinant == 0) {
	      root1 = root2 = -b / (2 * a);
	      System.out.format("root1 = root2 = %.2f;", root1);
	    }
	    else {
	      double real = -b / (2 * a);
	      double imaginary = Math.sqrt(-determinant) / (2 * a);
	      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
	      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
	    }
	  }
	}


