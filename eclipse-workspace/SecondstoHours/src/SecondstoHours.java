
public class SecondstoHours {

	/**
	 * 
	 * Created by Chris Ihasz
	 * Exercise 3-3 from Think Java
	 * Begun: 4/16/2018
	 * Ended: 
	 * 
	 * Program that converts a number of seconds to hours, minutes, and seconds.
	 * 
	 *  	1. Prompt a user for input
	 *  	2. Read an integer from the keyboard
	 *  	3. Calculate the result
	 *  	4. use the printf to display the output.
	 *  
	 *  	Example: "5000 seconds = 1 hours, 23 minutes, 20 seconds."
	 *  	
	 *  	Hint: use the modulus operator
	 */
	
	public SecondstoHours() {
		// TODO Auto-generated constructor stub
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double seconds = 5000;
		double hours = 0;
		double minutes = 0;
		double finalSeconds = 0;
		double remainder = 0;
		
		minutes = seconds/60;
		remainder = seconds%60;
		System.out.printf("%.0f minutes \n", minutes);
		System.out.println(remainder);
	}
}
