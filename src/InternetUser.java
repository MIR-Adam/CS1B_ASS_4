
public class InternetUser {

	public static final int MAX_NAME_LENGTH = 50;
	public static final int MIN_NAME_LENGTH = 2;
	public static final String DEFAULT_NAME = "";

	public static final int MAX_IP_LENGTH = 15;
	public static final int MIN_IP_LENGTH = 7;
	public static final String DEFAULT_IP = "0.0.0.0";

	// private member data
	private static String name;
	private static String IP;
	private static boolean invalidName;
	private static boolean invalidIP;
	private static String invalidNameSet;
	private static String invalidIPSet;

	// default constructor
	public InternetUser() {
		name = DEFAULT_NAME;
		IP = DEFAULT_IP;
	}

	// constructor overloader
	public InternetUser(String name, String IP) {
		set(name, IP);
	}

	// accessors
	public String getName() {
		return name;
	}

	public String getIP() {
		return IP;
	}

	public boolean set(String name, String IP) {
		if (validateUserData(name, IP)) {
			InternetUser.name = name;
			InternetUser.IP = IP;
			return true;
		} else {
			name = DEFAULT_NAME;
			IP = DEFAULT_IP;
			return false;
		}
	}

	private static boolean validateUserData(String name, String IP) {
		if (name.length() > MIN_NAME_LENGTH && name.length() < MAX_NAME_LENGTH) {

			invalidName = false;

		} else {

			invalidNameSet = name;
			invalidName = true;
		}
		if (IP.length() > MIN_IP_LENGTH && IP.length() < MAX_IP_LENGTH) {

			invalidIP = false;

		} else {

			invalidIPSet = IP;
			invalidIP = true;
		}
		if (invalidName == true || invalidIP == true) {
			return false;
		} else {
			return true;
		}
	}

	public String toString() {
		String userStringized = "";
		String IPStringized = "";

		if (!invalidName) {
			userStringized = "Your username is " + name + " \n";
		}
		if (invalidName) {
			userStringized = "There was an ERROR in your username! Your current username is " + name + ". "
					+ "Invalid name set was: " + invalidNameSet + " \n";
		}

		if (!invalidIP) {
			IPStringized = "Your IP is " + IP + " \n";
		}
		if (invalidIP) {
			IPStringized = "There was an ERROR in your IP! Your current IP is " + IP + ". " + "Invalid IP set was: "
					+ invalidIPSet + " \n";
		}
		String returnString = userStringized + IPStringized;
		return returnString;
	}
}