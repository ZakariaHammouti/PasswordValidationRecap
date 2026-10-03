import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationTest {

    @Test
    void isAtLeast8CharactersLong_whenEmpty_ExpectFalse() {
        //Given
        String password = "";

        //When
        boolean result = PasswordValidation.isAtLeast8CharactersLong(password);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void isAtLeast8CharactersLong_when8Characters_ExpectTrue() {
        //Given
        String password = "12345678";

        //When
        boolean result = PasswordValidation.isAtLeast8CharactersLong(password);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    void isAtLeast8CharactersLong_when7Characters_ExpectFalse() {
        //Given
        String password = "1234567";

        //When
        boolean result = PasswordValidation.isAtLeast8CharactersLong(password);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void isAtLeast8CharactersLong_when9Characters_ExpectTrue() {
        //Given
        String password = "123456789";

        //When
        boolean result = PasswordValidation.isAtLeast8CharactersLong(password);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    void containsDigit_whenEmpty_ExpectFalse() {
        //Given
        String password = "";

        //When
        boolean result = PasswordValidation.containsDigit(password);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void containsDigit_whenOneDigit_ExpectTrue() {
        //Given
        String password = "1";

        //When
        boolean result = PasswordValidation.containsDigit(password);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    void containsDigit_whenMixedText_ExpectTrue() {
        //Given
        String password = "asdasd14324[]¶¢[";

        //When
        boolean result = PasswordValidation.containsDigit(password);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    void containsLowerAndUpperCaseCharacters_whenEmpty_ExpectTFalse() {
        //Given
        String password = "";

        //When
        boolean result = PasswordValidation.containsLowerAndUpperCaseCharacters(password);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void containsLowerAndUpperCaseCharacters_whenAa_ExpectTrue() {
        //Given
        String password = "Aa";

        //When
        boolean result = PasswordValidation.containsLowerAndUpperCaseCharacters(password);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    void containsLowerAndUpperCaseCharacters_whena_ExpectFalse() {
        //Given
        String password = "a";

        //When
        boolean result = PasswordValidation.containsLowerAndUpperCaseCharacters(password);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void containsLowerAndUpperCaseCharacters_whenA_ExpectFalse() {
        //Given
        String password = "A";

        //When
        boolean result = PasswordValidation.containsLowerAndUpperCaseCharacters(password);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void isWellKnownPassword_whenEasyPassword_ExpectTrue() {
        //Given
        String password = "123456";

        //When
        boolean result = PasswordValidation.isWellKnownPassword(password);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    void isWellKnownPassword_whenEasyPassword2_ExpectTrue() {
        //Given
        String password = "password";

        //When
        boolean result = PasswordValidation.isWellKnownPassword(password);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    void isWellKnownPassword_whenHardPassword_ExpectFalse() {
        //Given
        String password = "as_23438AHAHDBCJENC54210654894";

        //When
        boolean result = PasswordValidation.isWellKnownPassword(password);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void isSafe_whenEmpty_ExpectFalse() {
        //Given
        String password = "";

        //When
        boolean result = PasswordValidation.isSafe(password);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void isSafe_whenEmpty_whenHardPassword_ExpectTrue() {
        //Given
        String password = "as_23438AHAHDBCJENC54210654894";

        //When
        boolean result = PasswordValidation.isSafe(password);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    void isSafe_whenLongLowerCase_ExpectFalse() {
        //Given
        String password = "asdasdfdhtzihil";

        //When
        boolean result = PasswordValidation.isSafe(password);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void isSafe_whenLongLowerCaseAndUpperCase_ExpectFalse() {
        //Given
        String password = "asdasdfdhtzihil";

        //When
        boolean result = PasswordValidation.isSafe(password);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void isSafe_whenLongLowerCaseAndUpperCaseWithDigit_ExpectFalse() {
        //Given
        String password = "password1";

        //When
        boolean result = PasswordValidation.isSafe(password);

        //Then
        Assertions.assertFalse(result);
    }

}
