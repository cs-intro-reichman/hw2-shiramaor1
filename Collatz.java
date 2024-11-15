// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String mode = args[1]; 
		for ( int i = 1; i <= N; i++ ) {
			int a = i; 
			int times = 1;
			String runs = "" + a; 
			while (a != 1 || times == 1) {
				if ( a % 2 == 0){
					a = a / 2;
				} else {
					a = a * 3 + 1;
				}
				times++;
				runs = runs + " " + a;
			}
			if ( mode.equals("v")) {
				System.out.println(runs + "(" + times + ")"); 
			}
			
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");

	}
}
