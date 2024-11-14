// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheers = args [0];
            int times = Integer.parseInt(args[1]);
            String specialChar = "AEFHILMNORSX";
            for (int i = 0; i < cheers.length(); i++) {
                char firstChar = cheers.charAt(i);
                if (firstChar == specialChar.indexOf(firstChar)) {
                   System.out.println("Give me an " + cheers.charAt(i) + ": " + firstChar + "!" );    
                } else {
                   System.out.println("Give me a " + cheers.charAt(i) + ": " + firstChar + "!" );    
                }     
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < times; i++) {
                System.out.println(cheers + "!!!");
            }
               
        }
}
