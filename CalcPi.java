// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numberOfterms = Integer.parseInt(args[0]);
		int denominator = 1;
        double sum = 0; 
		for (int i = 1; i <= numberOfterms; i++) {
			if (i % 2 == 0) {
				sum = sum - 1.0/denominator;    
			} else { 
				sum = sum + 1.0/denominator;
			}
			denominator = denominator + 2; 
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum * 4);
		
	}
}
