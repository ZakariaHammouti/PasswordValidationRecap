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
    void containsDigit_whenEmpty_ExpectTrue() {
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
}
