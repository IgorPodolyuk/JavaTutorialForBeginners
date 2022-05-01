public class Strings {

	public static void main(String[] args) {
		
		String message1 = new String("Hello World");
		String message2 = "Hello World" + "!!"; // These to codes are absolute the same
		
		System.out.println(message1);
		System.out.println(message2);
		System.out.println(message2.startsWith("!!")); // "message2 Hello World!!" does not start with "!!" -> false
		System.out.println(message2.endsWith("!!"));  // "message2 Hello World!!" ends with "!!" -> true
		System.out.println(message2.length()); // "message2" has 13 symbols , including "space"
		System.out.println(message2.indexOf("H")); // count the position of the reference symbol (capital symbols sensitive) ("H" = 0)
		System.out.println(message2.indexOf("sky")); // there is no symbol "sky" -> returns "-1"
		System.out.println(message2.replace("!", "*"));
		System.out.println(message2); // the above replacement "replace" does not change the content of String variable "message2"
		System.out.println(message2.toLowerCase());
		System.out.println(message2.toUpperCase());
		String message3 = "  Hello World !!            ";
		System.out.println(message3.trim()); // remove unnecessary tabs and spaces inputed by the user
		
	}

}
