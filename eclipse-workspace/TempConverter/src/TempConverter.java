import java.util.Scanner;

public class TempConverter {

	/**
	 * 
	 * Created by Chris Ihasz
	 * Exercise 3-2 from Think Java
	 * Begun: 4/13/2018
	 * Ended: 4/16/2018
	 * 
	 * Program that converts a temperature from Celsius to Fahrenheit.
	 * 
	 * It needs to:
	 * 		XX1. Prompt the user for input.
	 * 		XX2. read a double value from the keyboard.
	 * 		XX 3. calculate the result. 
	 * 		4. format the output to 1 decimal place.
	 * 		
	 * 		Example of output: "24.0 C = 75.2 F".
	 * 
	 * 		Formula used: F = C * (9/5) + 32
	 * 		
	 */
	
	public TempConverter() {
		// TODO Auto-generated constructor stub
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double fareh = 0.0;
		double celsi = 24.0;
		final double nineFifths = 1.8; // the 9/5 from the formula
		final double farehAddition = 32; // the 32 that is added at the end
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a temperature in Celsius: ");
		celsi = in.nextDouble();
		fareh = ((celsi * nineFifths) + farehAddition);
		System.out.printf("%.1f C = %.1f F.", celsi, fareh);
	}

}
