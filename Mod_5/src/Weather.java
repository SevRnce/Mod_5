
/**
 * 
 */
/**
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Weather {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<String> days = new ArrayList<String>();
		ArrayList<Float> temps = new ArrayList<Float>();
		Double total;
		Double avg;
		
		for (int i = 1; i <= 7; i++)
		{
			 System.out.println("Enter day of the week " + i + ":");
			 days.add(input.next());
			 System.out.println("Enter temperature for day " + i + ":");
			 temps.add(input.nextFloat());
		}
		total = temps.stream()
				.mapToDouble(Float::doubleValue)
				.sum();
		avg = total / 7;
		System.out.println("Please enter a day of the week to check the average for that day or enter \"week\" to check the weekly average.");
		String Check = input.next().toLowerCase();
			
			if (Check.equals("week"))
			{
				for(int i = 0; i < 7; i++)
				{
					System.out.println(days.get(i) + "\t" + temps.get(i));
				}
				System.out.println("Weekly Average: " + avg);
			}
			else if(days.contains(Check))
			{
				int Day = days.indexOf(Check);
				System.out.println(days.get(Day) + "\t" + temps.get(Day));
			}
			else
			{
				System.out.println("Error");
			}

		
	}
}