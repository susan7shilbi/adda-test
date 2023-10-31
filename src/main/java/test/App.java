/**
 * 
 */
package test;

public class App {
	private static final String predefinedUsername = 
			"Susan"; 
	private static final String predefinedPassword = 
			"20MIC0006"; 
	public static boolean validate(String inputUsername, 
	String inputPassword) { 
	return inputUsername.equals(predefinedUsername) && 
	inputPassword.equals(predefinedPassword);
}
}
