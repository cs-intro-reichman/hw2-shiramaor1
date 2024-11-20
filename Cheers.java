// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheers = args [0];
            int times = Integer.parseInt(args[1]);
            String upperCheers = cheers.toUpperCase(); 
            String specialChars = "AEFHILMNORSX";
            for (int i = 0; i < upperCheers.length(); i++) {
                char currentChar = upperCheers.charAt(i);
                
                if (specialChars.indexOf(currentChar) == -1) {
                    System.out.println("Give me a  " + upperCheers.charAt(i) + ": " + currentChar + "!" );    
                } else {
                    System.out.println("Give me an " + upperCheers.charAt(i) + ": " + currentChar + "!" );    
                }     
            }
            System.out.println("What does that spell?");
            
            for (int i = 0; i < times; i++) {
                System.out.println(upperCheers + "!!!");
            }
               
        }
}
