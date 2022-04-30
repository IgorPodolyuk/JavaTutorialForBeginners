public class escapeSequences {

	public static void main(String[] args) {
		
		String myName = "Hello \"George\""; // Add Quotation Mark
		System.out.println(myName);
		
		// c:\Windows\...
		String dir = "c:\\Widnows\\..."; // Add Backslash
		System.out.println(dir);
		
		// c:
		// Windows\...
		String dirNewRow = "c:\nWidnows\\..."; // Add new row
		System.out.println(dirNewRow);
		
		// c:	Windows\...
		String dirTab = "c:\tWidnows\\..."; // Add Tab
		System.out.println(dirTab);

	}

}
