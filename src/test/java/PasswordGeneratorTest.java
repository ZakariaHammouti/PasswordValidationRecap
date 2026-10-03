import org.example.PasswordValidation;
import org.example.PasswordGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordGeneratorTest {

    @Test
    void whenGenerating_expect8Chars() {
        //Given

        //When
        String password = PasswordGenerator.generate();

        //Then
        Assertions.assertEquals(8, password.length());
        System.out.println(password);
    }

    @Test
    void whenGenerating_expectSafePassword() {
        //Given

        //When
        String password = PasswordGenerator.generate();

        //Then
        Assertions.assertTrue(PasswordValidation.isSafe(password));

    }
}
