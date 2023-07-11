package models;

public class LoginService {
	public static boolean loginCheck(User user) {
		boolean result = false;
		if (user.getPassword().equals("1234")) result = true;
		
		return result;
	}
}