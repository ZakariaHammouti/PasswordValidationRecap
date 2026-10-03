

public class PasswordValidation {


    public static boolean isAtLeast8CharactersLong(String password) {

        return password.length() >= 8;
    }

    public static boolean containsDigit(String password) {
        return password.matches(".*[0-9].*");
    }
}

