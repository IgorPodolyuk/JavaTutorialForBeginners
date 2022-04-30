import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Principal: ");
		int principal = input.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		float annualRate = input.nextFloat();
		
		System.out.print("Period (Years): ");
		byte periodYears = input.nextByte();
		
		double monthlyRate = (annualRate / 12 / 100.0);
		int periodMonths = (periodYears * 12);
		double mortgage = principal 
				* ((monthlyRate * Math.pow(1 + monthlyRate, periodMonths))
				/ (Math.pow(1 + monthlyRate, periodMonths) - 1));
		
		System.out.println(NumberFormat.getCurrencyInstance(Locale.US)
				.format(mortgage));
		
	}
}
