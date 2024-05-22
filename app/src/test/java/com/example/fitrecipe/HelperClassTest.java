package com.example.fitrecipe;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelperClassTest {

    @Test
    public void testGettersAndSetters() {

        String name = "John Doe";
        String email = "john@example.com";
        String username = "john_doe";
        String password = "password123";


        HelperClass helper = new HelperClass(name, email, username, password);


        assertEquals(name, helper.getName());
        assertEquals(email, helper.getEmail());
        assertEquals(username, helper.getUsername());
        assertEquals(password, helper.getPassword());
    }

    @Test
    public void testSetName() {

        HelperClass helper = new HelperClass("John Doe", "john@example.com", "john_doe", "password123");
        String newName = "Jane Doe";


        helper.setName(newName);


        assertEquals(newName, helper.getName());
    }

    @Test
    public void testSetEmail() {

        HelperClass helper = new HelperClass("John Doe", "john@example.com", "john_doe", "password123");
        String newEmail = "jane@example.com";


        helper.setEmail(newEmail);


        assertEquals(newEmail, helper.getEmail());
    }

    @Test
    public void testSetUsername() {

        HelperClass helper = new HelperClass("John Doe", "john@example.com", "john_doe", "password123");
        String newUsername = "jane_doe";


        helper.setUsername(newUsername);


        assertEquals(newUsername, helper.getUsername());
    }

    @Test
    public void testSetPassword() {

        HelperClass helper = new HelperClass("John Doe", "john@example.com", "john_doe", "password123");
        String newPassword = "newpassword123";


        helper.setPassword(newPassword);


        assertEquals(newPassword, helper.getPassword());
    }

    @Test
    public void testSetNameToNull() {

        HelperClass helper = new HelperClass("John Doe", "john@example.com", "john_doe", "password123");


        helper.setName(null);


        assertNull(helper.getName());
    }

    @Test
    public void testSetEmailToNull() {

        HelperClass helper = new HelperClass("John Doe", "john@example.com", "john_doe", "password123");


        helper.setEmail(null);


        assertNull(helper.getEmail());
    }

    @Test
    public void testSetUsernameToNull() {

        HelperClass helper = new HelperClass("John Doe", "john@example.com", "john_doe", "password123");


        helper.setUsername(null);


        assertNull(helper.getUsername());
    }

    @Test
    public void testSetPasswordToNull() {

        HelperClass helper = new HelperClass("John Doe", "john@example.com", "john_doe", "password123");


        helper.setPassword(null);


        assertNull(helper.getPassword());
    }
}
