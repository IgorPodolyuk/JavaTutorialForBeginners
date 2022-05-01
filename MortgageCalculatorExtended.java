import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculatorExtended {
	
	public static void main(String[] args) {
		
		final byte monthsInYear = 12;
		final byte percents = 100;
		Scanner input = new Scanner(System.in);
		
		int principal = 0;
		while (true) {
			System.out.print("Principal ($1K - $1M): ");
			principal = input.nextInt();
			if (principal>=1_000 && principal<=1_000_000)
				break;  // break the infinite loop if the user input number between 1,000 and 1,000,000
			System.out.println("Enter a number between 1,000 and 1,000,000.");
		}
		
		float annualRate = 0;
		while (true) {
			System.out.print("Annual Interest Rate: ");
			annualRate = input.nextFloat();
			if (annualRate>0 && annualRate<=30)
				break; // break the infinite loop if the user input value greater than 0 and less than or equal to 30
			System.out.println("Enter a value greater than 0 and less than or equal to 30.");	
		}
		
		byte periodYears = 0;
		while (true) {
			System.out.print("Period (Years): ");
			periodYears = input.nextByte();
			if (periodYears>=1 && periodYears<=30)
				break; // break the infinite loop if the user input value greater or equal to 1 and less than or equal to 30
			System.out.println("Enter a value between 1 and 30.");
		}
		
		double monthlyRate = (annualRate / monthsInYear / percents);
		int periodMonths = (periodYears * monthsInYear);
		double mortgage = principal 
				* ((monthlyRate * Math.pow(1 + monthlyRate, periodMonths))
				/ (Math.pow(1 + monthlyRate, periodMonths) - 1));
		System.out.println(NumberFormat.getCurrencyInstance(Locale.US)
				.format(mortgage));
		
	}
}
