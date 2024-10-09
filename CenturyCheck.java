import java.util.Scanner;

public class CenturyCheck{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of years: ");
		int years = scanner.nextInt();

		System.out.print(getRangeOfYears(years));

	}

public static String getRangeOfYears(int year){

	String duration = "";
	
	if(year > 0 && year <= 2024){
	
		if(year >= 1 && year <= 100){
			
			duration = "1st century";	
	
		}

		if(year >= 101 && year <= 200){
			
			duration = "2nd century";	
	
		}

		if(year >= 201 && year <= 300){
			
			duration = "3rd century";	
	
		}

		if(year >= 301 && year <= 400){
			
			duration = "4th century";	
	
		}

		if(year >= 401 && year <= 500){
			
			duration = "5th century";	
	
		}
		
		if(year >= 501 && year <= 600){
			
			duration = "6th century";	
	
		}

		if(year >= 601 && year <= 700){
			
			duration = "7th century";	
	
		}	

		if(year >= 701 && year <= 800){
			
			duration = "8th century";	
	
		}

		if(year >= 801 && year <= 900){
			
			duration = "9th century";	
	
		}

		if(year >= 901 && year <= 1000){
			
			duration = "10th century";	
	
		}

		if(year >= 1001 && year <= 1100){
			
			duration = "11th century";	
	
		}

		if(year >= 1101 && year <= 1200){
			
			duration = "12th century";	
	
		}

		if(year >= 1201 && year <= 1300){
			
			duration = "13th century";	
	
		}

		if(year >= 1301 && year <= 1400){
			
			duration = "14th century";	
	
		}

		if(year >= 1401 && year <= 1500){
			
			duration = "15th century";	
	
		}

		if(year >= 1501 && year <= 1600){
			
			duration = "16th century";	
	
		}
		if(year >= 1601 && year <= 1700){
			
			duration = "17th century";	
	
		}
		if(year >= 1701 && year <= 1800){
			
			duration = "18th century";	
	
		}

		if(year >= 1801 && year <= 1900){
			
			duration = "19th century";	
	
		}

		if(year >= 1901 && year <= 2000){
			
			duration = "20th century";	
	
		}
		
		if(year >= 2001 && year <= 2100){
			
			duration = "21st century";	
	
		}
	}

	else{
		duration = "Century never Existed!";
	
		}
	return duration;


}

}

