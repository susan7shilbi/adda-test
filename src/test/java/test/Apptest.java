package test;

import org.testng.annotations.Test;
import org.testng.Assert;

public class Apptest {

    @Test
    public void testValidUser() {
        Assert.assertTrue(validate("mayank", "password"));
    }

    @Test
    public void testInvalidUser() {
        Assert.assertFalse(validate("wronguser", "wrongpassword"));
    }

    public static boolean validate(String username, String password) {
        // Your validation logic here
        // Replace this with your actual validation code
        // For example, you can check if username and password are correct
        return username.equals("mayank") && password.equals("password");
    }
}
