
public class Time {

	/*
	 * Exercise 2-3, Think Java. #1
	 */
	
	public Time() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		/*
		 * Exercise 2-3, Think Java. #2
		 */
		
		double hour = 14;
		double minute = 34;
		double second = 20;
		double totalSeconds = 0;
		double totalMinutes = 0;
		double fullDaySeconds = 0;
		double remainingDaySeconds = 0;
		double percentDay = 0;
		
		/*
		 * Output the current time. Done for me only to test the program.
		 */
		
		System.out.println("The current time is: " + hour + ":" + minute + ":" + second);
		
		/*
		 * Exercise 2-3, Think Java. #3
		 * Calculate and output the total seconds for the time I provided. 
		 * This happens to also fit the requirement to calculat the number of seconds
		 * since midnight
		 */
		totalMinutes = (hour * 60);
		totalSeconds = (totalMinutes * 60) + (minute * 60) + second;
		System.out.println("The total seconds for " + hour + " hours, " + minute + " minutes, and " + second + " seconds is: " + totalSeconds);
		
		/* 
		 * Exercise 2-3, Think Java. #4
		 */
		
		totalMinutes = (24 * 60);
		fullDaySeconds = (totalMinutes * 60);
		System.out.println("The total seconds in a day: " + fullDaySeconds);
		remainingDaySeconds = (fullDaySeconds - totalSeconds);
		System.out.println("The remaining seconds in the day is: " + remainingDaySeconds);
		
		/*
		 * Exercise 2-3, Think Java #5
		 */
		
		percentDay = (remainingDaySeconds/fullDaySeconds);
		System.out.println("The % of the day done is: " + percentDay + "%.");
	}
}
