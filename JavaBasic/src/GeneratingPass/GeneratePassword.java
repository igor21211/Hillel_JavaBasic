package GeneratingPass;

import java.security.SecureRandom;

public class GeneratePassword {
    private static final String CHAR_LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPERCASE = CHAR_LOWERCASE.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String SYMVOL = "!@#&()â€\"[{}]:;',?/*~$^+=<>";
    private static int PASSWORD_LENGTH = 8;

    public static void setPasswordLength(int passwordLength) {
        PASSWORD_LENGTH = passwordLength;
    }

    private static final String PASSWORD = CHAR_LOWERCASE + CHAR_UPPERCASE + NUMBER +SYMVOL;

    private static SecureRandom random = new SecureRandom();

    private static String generatePass(String input, int size){
        if (input == null || input.length() <= 0)
            throw new IllegalArgumentException("Invalid input.");
        if (size < 1) throw new IllegalArgumentException("Invalid size.");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size ; i++) {
            int index = random.nextInt(input.length());
            stringBuilder.append(input.charAt(index));
        }
        return stringBuilder.toString();
    }

    public static String getPassword(){
        StringBuilder password = new StringBuilder(PASSWORD_LENGTH);

        String strLowercase = generatePass(CHAR_LOWERCASE,PASSWORD_LENGTH/4);
        password.append(strLowercase);

        String strUppercase = generatePass(CHAR_UPPERCASE,PASSWORD_LENGTH/4);
        password.append(strUppercase);

        String strNumber = generatePass(NUMBER,PASSWORD_LENGTH/4);
        password.append(strNumber);

        String strSymvol = generatePass(SYMVOL,PASSWORD_LENGTH/4);
        password.append(strSymvol);

        return password.toString();
    }

}
