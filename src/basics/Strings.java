package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains("Ring")) {
			System.out.println("The book contains the word " + wordChoice);
		}
		
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Erih";
		String lastName = "Foss";
		String ID = "39804200828";
		
		System.out.println("There are " + ID.length() + " digits in your ID");
				
		// Print the initials plus last 4 digits of ID
				
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));
		System.out.println(ID.substring(7));
	}

}
