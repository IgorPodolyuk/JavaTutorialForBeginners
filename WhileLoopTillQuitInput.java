import java.util.Scanner;

public class WhileLoopTillQuitInput {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = "";
		
		while (!input.equals("quit")) {
			System.out.print("Input quit: ");
			input = scanner.next().toLowerCase();
			if (input.equals("pass"))
				continue; // return the loop to the beginning
			if (input.equals("quit"))
				break; // break the loop
			System.out.println(input.equals("quit") 
					? "" 
					: "You input \"" + input + "\". Please, input \"quit\".");
		}
		
	}
	
}
