package bank;

public class Manager {
	
	public static void login(String uname, String passwd) {
		String mainUName = "manager1";
		String mainPasswd = "manager1";
		
		if (uname.equals(mainUName) && mainPasswd.equals(mainPasswd)) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Username and Password is wrong!");
			login(uname, passwd);
		}
	}
}
