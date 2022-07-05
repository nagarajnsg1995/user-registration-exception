package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void testUserFirstName_whenValid_ShouldReturnSuccess() {
        UserRegistration userRegistration = new UserRegistration();
        String isFNameValid = null;
        try {
            isFNameValid = userRegistration.checkFName("Nagaraj");
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals("Success", isFNameValid);
        }

    }

    @Test

    public void testFirstName_WhenValueIsInvalid_shouldReturnException() {
        UserRegistration userRegistration = new UserRegistration();
        String isFNameValid = null;
        try {
            userRegistration.checkFName("nagaraj");
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test

    public void testFirstName_WhenPassNullValue_shouldNullValueException() {
        UserRegistration userRegistration = new UserRegistration();
        String isFNameValid = null;
        try {
            userRegistration.checkFName(null);
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test

    public void testLastName_WhenValueIsValid_ShouldReturnSuccess() {
        UserRegistration userRegistration = new UserRegistration();
        String islNameValid = null;
        try {
            islNameValid = userRegistration.checkLName("Gaddad");
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals("Success", islNameValid);
        }
    }

    @Test

    public void testLastName_WhenValueIsInvalid_ShouldThrowInvalidException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkLName("nagaraj");
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test

    public void testLastName_WhenValueIsNull_ShouldThrowNullPointerException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkLName(null);
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test

    public void testEmailId_WhenValueIsValid_ShouldReturnSuccess() {
        UserRegistration userRegistration = new UserRegistration();
        String isEmailValid = null;
        try {
            isEmailValid = userRegistration.checkEmail("nagarajece.rymec@gmail.com");
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals("Success", isEmailValid);
        }
    }

    @Test

    public void testEmailId_WhenValueIsInvalid_ShouldThrowInvalidDetailException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkEmail("nagaraj.@.com");
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test

    public void testEmailId_WhenValueIsNull_ShouldThrowNullPointerException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkEmail(null);
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test

    public void testMobileNum_WhenValueIsValid_ShouldReturnSuccess() {
        UserRegistration userRegistration = new UserRegistration();
        String isPhoneValid = null;
        try {
            isPhoneValid = userRegistration.checkPhoneNumber("91 9886856421");
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals("Success", isPhoneValid);
        }
    }

    @Test

    public void testMobileNum_WhenValueIsInvalid_ShouldInvalidDetailException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkPhoneNumber("8660768341");
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test

    public void testMobileNum_WhenPassedNullValue_ShouldThrowNullPointerException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkPhoneNumber(null);
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test

    public void testPassword_WhenSatisfyRule2_ShouldReturnSuccess() {
        UserRegistration userRegistration = new UserRegistration();
        String isValidPassword = null;
        try {
            isValidPassword = userRegistration.checkPassword("Pqrs@0997");
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals("Success", isValidPassword);
        }
    }

    @Test

    public void testPassword_WhenNotSatisfyRule2_ShouldThrowInvalidPassException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkPassword("abcd");
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test

    public void testPassword_WhenPassedNullValue_ShouldThrowNullPointerException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkPassword(null);
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test

    public void mood_Analyser_Test_Happy() {
        UserRegistration userRegistration = new UserRegistration();
        String isMoodHappy = "HAPPY";
        try {
            isMoodHappy = userRegistration.moodAnalyse("Nagaraj", "gaddad", "91 8660768341", "nagarajsg09@gmail.com", "Qwer@0321");
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals("HAPPY", isMoodHappy);
        }
    }

    @Test

    public void mood_Analyser_Test_Sad() {
        UserRegistration userRegistration = new UserRegistration();
        String isMoodSad = null;
        try {
            isMoodSad = userRegistration.moodAnalyse("nagaraj", "gaddad", "8660768341", "007almas.@.com", "nsgg*321");
        } catch (InvalidDetailExceptions e) {
            Assert.assertEquals(null, isMoodSad);
        }
    }
}

