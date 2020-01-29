import java.util.Scanner;

/**
 * 
 * @author >>RanaSiroosian<<
 *
 */

public class Lab7Regex {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Please enter a valid Name: ");
		String name = scnr.nextLine();
		validateName(name);
		
		System.out.println("Please enter a valid email: ");
		String email = scnr.nextLine();
		validateEmail(email);
		
		System.out.println("Please enter a valid phone number: ");
		String phone = scnr.nextLine();
		validatePhone(phone);
		
		System.out.println("Please enter a valid date: ");
		String date = scnr.nextLine();
		validateDate(date);
		
		System.out.println("Please enter a valid HTML: ");
		String html = scnr.nextLine();
		validateHtml(html);
		
		scnr.close();
	}

	public static boolean validateName(String name) {

		String regex = "[A-Z][a-zA-Z]{1,29}";
		if (name.matches(regex)) {
			System.out.println("Name is valid!");
			return true;
		} else {
			System.out.println("Sorry, name is not valid!");
			return false;
		}
	}

	public static boolean validateEmail(String email) {

		String regex = "(!?)[a-z0-9]{5,30}@[a-z0-9]{3,10}.[a-z0-9]{2,3}";

		if (email.matches(regex)) {
			System.out.println("Email is valid!");
			return true;
		} else {
			System.out.println("Sorry, email is not valid!");
			return false;
		}
	}
	
	public static boolean validatePhone(String phone) {

		String regex = "\\d{3}[\\-]\\d{3}[\\-]\\d{4}";

		if (phone.matches(regex)) {
			System.out.println("Phone number is valid!");
			return true;
		} else {
			System.out.println("Sorry, phone is not valid!");
			return false;
		}
	}
	
	public static boolean validateDate(String date) {

		
		String regex = ("(0[1-9]|1[0-9]|2[0-9]|3[0-1])/(0[1-9]|1[0-2])/\\d{4}");
		if (date.matches(regex)) {
			System.out.println("Date is valid!");
			return true;
		} else {
			System.out.println("Sorry, date is not valid!");
			return false;
		}
	}
	
	public static boolean validateHtml(String html) {
		String regex = "<([a-zA-Z]{0,2}[a-zA-Z0-9]{0,2})>.*</\\1>";
		if (html.matches(regex)) {
			System.out.println("Html is valid!");
			return true;
		} else {
			System.out.println("Sorry, html is not valid!");
			return false;
		}
	}

}
