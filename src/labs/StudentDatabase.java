package labs;

public class StudentDatabase {

	public static void main(String[] args) {
		Student s1 = new Student("Bobby", "1324567854");
		
		s1.setPhone("+4923646874");
		s1.setCity("Seattle");
		s1.setState("Washington");
		
		System.out.println(s1.toString());
		s1.enroll("Maths");
		s1.enroll("Biology");	
		System.out.println(s1.showCourses());
		
		s1.pay(300);
		
		Student s2 = new Student("Gloria", "6789445478");
		
		s2.setPhone("+79278879468");
		s2.setCity("Sacromento");
		s2.setState("California");
		
		System.out.println(s2.toString());
		
		s2.enroll("Phisical Education");
		s2.enroll("English Grammars");
		s2.enroll("Psichology");
		System.out.println(s2.showCourses());
		
		s2.pay(700);
	
	}


}

class Student {
	private String name;
	private static int ID = 1000;
	private String SSN;
	private String userID;
	private String phone;
	private String city;
	private String state;
	private String email;
	private double balance;
	private String[] enrolledCourses = new String[5];
	private int enrolledCoursesCount = 0;
	
	public Student(String name, String SSN) {
		printLn("New student record");
		setName(name);
		createEmail();
		setSSN(SSN);
		newID();
		setBalance(1000);
		generateUserID();
	}
	
	public void printLn(String text) {
		System.out.println(text);
	}
	
	public void createEmail() {
		email = name.toLowerCase() + "@school.com";
	}
	
	public void newID() {
		ID++;
	}
	
	public void generateUserID() {
		userID = ID + "" + makeRandomNumber() + SSN.substring(6);
	}
	
	public int makeRandomNumber() {
		int random;
		do {
			random = (int) (Math.random() * 10000);
		} while (random <= 1000 || random >= 9000);
		return random;
	}
	
	public void enroll(String subject) {
		enrolledCourses[enrolledCoursesCount] = subject;
		enrolledCoursesCount++;
		String text = name + " is enrolled to " + subject;
		printLn(text);
	}
	
	public String showCourses() {
		
		String coursesList = "";
		for (int i = 0; i < enrolledCoursesCount; i++) {
			if(enrolledCoursesCount - i == 1)
			coursesList = coursesList + enrolledCourses[i] + ".";
			else
			coursesList = coursesList + enrolledCourses[i] + ", ";
		}
		return name + " is enrolled to the next courses: " + coursesList;
	}
	
	public void pay(int amount) {
		printLn(payMessage(amount));
		decreaseBalance(amount);
	}
	
	public void decreaseBalance(int amount) {
		balance = balance - amount;
		checkBalance();
	}
	
	public void increaseBalance(int amount) {
		balance = balance + amount;
		checkBalance();
	}
	
	public void checkBalance() {
		printLn(name + "'s balance is: $" + balance);
	}
	
	public String payMessage(int amount) {
		String text = name + " paid $" + amount;
		return text;
	}
	
	// Getters and Setters
	public String getUserID() {
		return userID;	
	}
	
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String SSN) {
		this.SSN = SSN;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Override methods
	@Override
	public String toString() {
		return "[Name: " + name + "]\n" + "[SSN: " + SSN + "]\n" + "[Generated e-mail: " + email + "]\n" + "[UserID: " + userID + "]\n" + "[Initial Balance: $" + balance + "]\n" + "[Phone: " + phone + "]\n" + "[City: " + city + "]\n" + "[State: " + state + "]\n";
	}
}
